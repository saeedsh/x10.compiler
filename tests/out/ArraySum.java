
@x10.runtime.impl.java.X10Generated
public class ArraySum extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ArraySum> $RTT = 
        x10.rtt.NamedType.<ArraySum> make("ArraySum",
                                          ArraySum.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(ArraySum $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + ArraySum.class + " calling"); } 
        $_obj.sum = $deserializer.readLong();
        $_obj.data = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        ArraySum $_obj = new ArraySum((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.sum);
        $serializer.write(this.data);
        
    }
    
    // constructor just for allocation
    public ArraySum(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 19 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
    public long sum;
    
    //#line 20 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
    public x10.core.Rail<x10.core.Long> data;
    
    
    //#line 22 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
    // creation method for java code (1-phase java constructor)
    public ArraySum(final long n) {
        this((java.lang.System[]) null);
        ArraySum$$init$S(n);
    }
    
    // constructor for non-virtual call
    final public ArraySum ArraySum$$init$S(final long n) {
         {
            
            //#line 22 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            
            
            //#line 17 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            this.__fieldInitializers_ArraySum();
            
            //#line 24 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            final x10.core.Rail t$825 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(n)), (x10.core.Long.$box(1L)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 24 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            this.data = ((x10.core.Rail)(t$825));
            
            //#line 25 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            this.sum = 0L;
        }
        return this;
    }
    
    
    
    //#line 28 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
    public long sum__0$1x10$lang$Long$2$O(final x10.core.Rail a, final long start, final long last) {
        
        //#line 29 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        long mySum = 0L;
        
        //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long i$750min$901 = start;
        
        //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long i$750max$902 = ((last) - (((long)(1L))));
        
        //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        long i$898 = i$750min$901;
        {
            
            //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            final long[] a$value$963 = ((long[])a.value);
            
            //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            for (;
                 true;
                 ) {
                
                //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$899 = i$898;
                
                //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final boolean t$900 = ((t$899) <= (((long)(i$750max$902))));
                
                //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                if (!(t$900)) {
                    
                    //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    break;
                }
                
                //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long i$895 = i$898;
                
                //#line 31 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$892 = mySum;
                
                //#line 31 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$893 = ((long)a$value$963[(int)i$895]);
                
                //#line 31 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$894 = ((t$892) + (((long)(t$893))));
                
                //#line 31 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                mySum = t$894;
                
                //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$896 = i$898;
                
                //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$897 = ((t$896) + (((long)(1L))));
                
                //#line 30 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                i$898 = t$897;
            }
        }
        
        //#line 33 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long t$834 = mySum;
        
        //#line 33 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        return t$834;
    }
    
    
    //#line 36 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
    public void sum(final long numThreads) {
        
        //#line 37 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final x10.core.Rail t$835 = ((x10.core.Rail)(data));
        
        //#line 37 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long t$836 = ((x10.core.Rail<x10.core.Long>)t$835).size;
        
        //#line 37 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long mySize = ((t$836) / (((long)(numThreads))));
        {
            
            //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            final x10.lang.FinishState x10$__var0 = x10.lang.Runtime.startFinish();
            
            //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            try {{
                {
                    
                    //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    final long i$766min$767 = 0L;
                    
                    //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    final long i$766max$768 = ((numThreads) - (((long)(1L))));
                    
                    //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    long i$913 = i$766min$767;
                    
                    //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        final long t$914 = i$913;
                        
                        //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        final boolean t$915 = ((t$914) <= (((long)(i$766max$768))));
                        
                        //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        if (!(t$915)) {
                            
                            //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                            break;
                        }
                        
                        //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        final long p$910 = i$913;
                        
                        //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new ArraySum.$Closure$0(this, data, p$910, mySize, (ArraySum.$Closure$0.__1$1x10$lang$Long$2) null))));
                        
                        //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        final long t$911 = i$913;
                        
                        //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        final long t$912 = ((t$911) + (((long)(1L))));
                        
                        //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        i$913 = t$912;
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var0)));
             }}
            }
        }
    
    
    //#line 46 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            ArraySum.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 47 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long t$848 = 5000L;
        
        //#line 47 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        long size = 5000000L;
        
        //#line 48 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long t$849 = ((x10.core.Rail<java.lang.String>)args).size;
        
        //#line 48 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final boolean t$852 = ((t$849) >= (((long)(1L))));
        
        //#line 48 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        if (t$852) {
            
            //#line 49 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            final java.lang.String t$850 = ((java.lang.String[])args.value)[(int)0L];
            
            //#line 49 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            final long t$851 = java.lang.Long.parseLong(t$850);
            
            //#line 49 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            size = t$851;
        }
        
        //#line 51 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final x10.io.Printer t$853 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 51 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        t$853.println(((java.lang.Object)("Initializing.")));
        
        //#line 52 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long t$854 = size;
        
        //#line 52 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final ArraySum a = ((ArraySum)(new ArraySum((java.lang.System[]) null).ArraySum$$init$S(t$854)));
        
        //#line 53 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final x10.core.Rail P = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {1L, 2L, 4L})));
        
        //#line 56 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final x10.io.Printer t$855 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 56 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        t$855.println(((java.lang.Object)("Warming up.")));
        
        //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final x10.core.Rail rail$955 = ((x10.core.Rail)(P));
        
        //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long size$956 = ((x10.core.Rail<x10.core.Long>)rail$955).size;
        
        //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        long idx$920 = 0L;
        {
            
            //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            final long[] rail$955$value$964 = ((long[])rail$955.value);
            
            //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            for (;
                 true;
                 ) {
                
                //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$921 = idx$920;
                
                //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final boolean t$922 = ((t$921) < (((long)(size$956))));
                
                //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                if (!(t$922)) {
                    
                    //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    break;
                }
                
                //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$916 = idx$920;
                
                //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long numThreads$917 = ((long)rail$955$value$964[(int)t$916]);
                
                //#line 58 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                a.sum((long)(numThreads$917));
                
                //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$918 = idx$920;
                
                //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$919 = ((t$918) + (((long)(1L))));
                
                //#line 57 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                idx$920 = t$919;
            }
        }
        
        //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final x10.core.Rail rail$957 = ((x10.core.Rail)(P));
        
        //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        final long size$958 = ((x10.core.Rail<x10.core.Long>)rail$957).size;
        
        //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        long idx$952 = 0L;
        {
            
            //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            final long[] rail$957$value$965 = ((long[])rail$957.value);
            
            //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            for (;
                 true;
                 ) {
                
                //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$953 = idx$952;
                
                //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final boolean t$954 = ((t$953) < (((long)(size$958))));
                
                //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                if (!(t$954)) {
                    
                    //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    break;
                }
                
                //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$948 = idx$952;
                
                //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long numThreads$949 = ((long)rail$957$value$965[(int)t$948]);
                
                //#line 61 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final x10.io.Printer t$923 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 61 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$924 = (("Starting with ") + ((x10.core.Long.$box(numThreads$949))));
                
                //#line 61 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$925 = ((t$924) + (" threads."));
                
                //#line 61 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                t$923.println(((java.lang.Object)(t$925)));
                
                //#line 62 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                a.sum = 0L;
                
                //#line 63 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$926 = x10.lang.System.nanoTime$O();
                
                //#line 63 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                long time$927 = (-(t$926));
                
                //#line 64 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                a.sum((long)(numThreads$949));
                
                //#line 65 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$928 = time$927;
                
                //#line 65 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$929 = x10.lang.System.nanoTime$O();
                
                //#line 65 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$930 = ((t$928) + (((long)(t$929))));
                
                //#line 65 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                time$927 = t$930;
                
                //#line 66 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final x10.io.Printer t$931 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
                
                //#line 66 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$932 = (("For p=") + ((x10.core.Long.$box(numThreads$949))));
                
                //#line 66 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$933 = ((t$932) + (" result: "));
                
                //#line 67 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$934 = a.sum;
                
                //#line 66 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$935 = ((t$933) + ((x10.core.Long.$box(t$934))));
                
                //#line 68 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$936 = size;
                
                //#line 68 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$937 = a.sum;
                
                //#line 68 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final boolean t$938 = ((long) t$936) == ((long) t$937);
                
                //#line 68 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                java.lang.String t$939 =  null;
                
                //#line 68 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                if (t$938) {
                    
                    //#line 68 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    t$939 = " ok";
                } else {
                    
                    //#line 68 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    t$939 = "  bad";
                }
                
                //#line 68 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$940 = t$939;
                
                //#line 66 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$941 = ((t$935) + (t$940));
                
                //#line 66 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$942 = ((t$941) + (" (time="));
                
                //#line 69 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$943 = time$927;
                
                //#line 69 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$944 = 1000000L;
                
                //#line 69 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$945 = ((t$943) / (((long)(t$944))));
                
                //#line 66 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$946 = ((t$942) + ((x10.core.Long.$box(t$945))));
                
                //#line 66 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final java.lang.String t$947 = ((t$946) + (" ms)"));
                
                //#line 66 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                t$931.println(((java.lang.Object)(t$947)));
                
                //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$950 = idx$952;
                
                //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$951 = ((t$950) + (((long)(1L))));
                
                //#line 60 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                idx$952 = t$951;
            }
        }
    }
    
    
    //#line 17 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
    final public ArraySum ArraySum$$this$ArraySum() {
        
        //#line 17 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        return ArraySum.this;
    }
    
    
    //#line 17 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
    final public void __fieldInitializers_ArraySum() {
        
        //#line 17 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
        this.sum = 0L;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$0 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$0> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$0> make($Closure$0.class,
                                                        new x10.rtt.Type[] {
                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(ArraySum.$Closure$0 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$0.class + " calling"); } 
            $_obj.out$$ = $deserializer.readObject();
            $_obj.data = $deserializer.readObject();
            $_obj.p$910 = $deserializer.readLong();
            $_obj.mySize = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            ArraySum.$Closure$0 $_obj = new ArraySum.$Closure$0((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.data);
            $serializer.write(this.p$910);
            $serializer.write(this.mySize);
            
        }
        
        // constructor just for allocation
        public $Closure$0(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Long$2 {}
        
    
        
        public void $apply() {
            
            //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
            try {{
                
                //#line 39 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final x10.core.Rail t$903 = ((x10.core.Rail)(this.data));
                
                //#line 39 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$904 = ((this.p$910) * (((long)(this.mySize))));
                
                //#line 39 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$905 = ((this.p$910) + (((long)(1L))));
                
                //#line 39 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long t$906 = ((t$905) * (((long)(this.mySize))));
                
                //#line 39 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                final long mySum$907 = this.out$$.sum__0$1x10$lang$Long$2$O(((x10.core.Rail)(t$903)), (long)(t$904), (long)(t$906));
                
                //#line 42 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                try {{
                    
                    //#line 42 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    x10.lang.Runtime.enterAtomic();
                    {
                        
                        //#line 42 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        final long t$908 = this.out$$.sum;
                        
                        //#line 42 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        final long t$909 = ((t$908) + (((long)(mySum$907))));
                        
                        //#line 42 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                        this.out$$.sum = t$909;
                    }
                }}finally {{
                      
                      //#line 42 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                      x10.lang.Runtime.exitAtomic();
                  }}
                }}catch (java.lang.Error __lowerer__var__0__) {
                    
                    //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    throw __lowerer__var__0__;
                }catch (java.lang.Throwable __lowerer__var__1__) {
                    
                    //#line 38 "/data/src/x10-trunk/x10.compiler/tests/ArraySum.x10"
                    throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
                }
            }
        
        public ArraySum out$$;
        public x10.core.Rail<x10.core.Long> data;
        public long p$910;
        public long mySize;
        
        public $Closure$0(final ArraySum out$$, final x10.core.Rail<x10.core.Long> data, final long p$910, final long mySize, __1$1x10$lang$Long$2 $dummy) {
             {
                this.out$$ = out$$;
                this.data = ((x10.core.Rail)(data));
                this.p$910 = p$910;
                this.mySize = mySize;
            }
        }
        
        }
        
    }
    
    