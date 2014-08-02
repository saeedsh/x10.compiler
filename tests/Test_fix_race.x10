import x10.io.Console;
import x10.compiler.CUDA;
import x10.compiler.CUDADirectParams;
import x10.util.CUDAUtilities;
import x10.compiler.Native;
import x10.util.Random;

public class CUDA_FFT {

    static def fft(
		p:Place, 
        data:GlobalRail[Float]{home==p},
        n:Long,
        isign:Int) {
        
        val packetSize = 128n;
        val threads = 128n;
		val blocks = (n/(threads*packetSize)) as Int;

        finish async at (p) @CUDA @CUDADirectParams {
            finish for (block in 0n..(blocks-1n)) async {
                clocked finish for (thread in 0n..(threads-1n)) clocked async {
                    val tid = block * threads + thread;
                    val tids = blocks * threads;
                    for (var i:Long=0; i < packetSize; i++) {
                    	// FFT developement to calculate valuse for a block 
                    	// number tid with size of packetSize
                    }
                }
            }
        }
    }

    public static def main (Rail[String]) {

        // Problem parameters
        val m = 10n;
        val OPT_N = (1 << m) as Long;

        val topo = PlaceTopology.getTopology();
	    val gpu:Place;
        if (topo.numChildren(here)==0) {
            Console.OUT.println("Set X10RT_ACCELS=ALL to enable your GPUs if you have them.");
            Console.OUT.println("Will run the test on the CPU.");
            gpu = here;
        } else {
	    gpu = topo.getChild(here, 0);
            Console.OUT.println("Using the GPU at place "+gpu);
            Console.OUT.println("This program only supports a single GPU.");
        }

        val cpu = here;
        val rand = new Random();

        // Host arrays contains complex values
        val h_data = new Rail[Float](2*OPT_N);
        // Device arrays contains complex values
        val d_data    = CUDAUtilities.makeGlobalRail[Float](gpu, 2*OPT_N);

        Console.OUT.println("Running " + NUM_ITERATIONS + " times on place " + gpu);
        val gpuTimeStart = System.nanoTime();
        
        //Copy to GPU
        finish {
            Rail.asyncCopy(h_data, 0l, d_data, 0l, 2*OPT_N);
        }
        
        fft(gpu,d_data,OPT_N,1);
        
        //Copy back data
        finish {
            Rail.asyncCopy(h_data, 0l, d_data, 0l, 2*OPT_N);
        }
        
        val gpuTime = System.nanoTime() - gpuTimeStart;
        
        //Execute on CPU 
		fft(cpu,h_data,OPT_N,1);
        
        val cpuTime = System.nanoTime() - gpuTime;
        
        CUDAUtilities.deleteGlobalRail(d_data);

        Console.OUT.println("GPU Time: " + gpuTime);
        Console.OUT.println("CPU Time: " + gpuTime);
    }
}

// vim: shiftwidth=4:tabstop=4:expandtab