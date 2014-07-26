@x10.runtime.impl.java.X10Generated
public class HelloWorld22 extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<HelloWorld22> $RTT = 
        x10.rtt.NamedType.<HelloWorld22> make("HelloWorld22",
                                              HelloWorld22.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(HelloWorld22 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + HelloWorld22.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        HelloWorld22 $_obj = new HelloWorld22((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public HelloWorld22(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 13 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
    public double dist$O() {
        
        //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        final x10.core.Rail rail$227 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {1L, 2L})));
        
        //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        final long size$228 = ((x10.core.Rail<x10.core.Long>)rail$227).size;
        
        //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        long idx$224 = 0L;
        {
            
            //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            final long[] rail$227$value$233 = ((long[])rail$227.value);
            
            //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            for (;
                 true;
                 ) {
                
                //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$225 = idx$224;
                
                //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final boolean t$226 = ((t$225) < (((long)(size$228))));
                
                //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                if (!(t$226)) {
                    
                    //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                    break;
                }
                
                //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$220 = idx$224;
                
                //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long p$221 = ((long)rail$227$value$233[(int)t$220]);
                
                //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final x10.core.Rail rail$218 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {1L, 2L})));
                
                //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long size$219 = ((x10.core.Rail<x10.core.Long>)rail$218).size;
                
                //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                long idx$215 = 0L;
                {
                    
                    //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                    final long[] rail$218$value$232 = ((long[])rail$218.value);
                    
                    //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long t$216 = idx$215;
                        
                        //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final boolean t$217 = ((t$216) < (((long)(size$219))));
                        
                        //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        if (!(t$217)) {
                            
                            //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                            break;
                        }
                        
                        //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long t$211 = idx$215;
                        
                        //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long p$212 = ((long)rail$218$value$232[(int)t$211]);
                        
                        //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long t$213 = idx$215;
                        
                        //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long t$214 = ((t$213) + (((long)(1L))));
                        
                        //#line 15 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        idx$215 = t$214;
                    }
                }
                
                //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$222 = idx$224;
                
                //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$223 = ((t$222) + (((long)(1L))));
                
                //#line 14 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                idx$224 = t$223;
            }
        }
        
        //#line 19 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        return 8.1;
    }
    
    
    //#line 12 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
    final public HelloWorld22 HelloWorld22$$this$HelloWorld22() {
        
        //#line 12 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        return HelloWorld22.this;
    }
    
    
    //#line 12 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
    // creation method for java code (1-phase java constructor)
    public HelloWorld22() {
        this((java.lang.System[]) null);
        HelloWorld22$$init$S();
    }
    
    // constructor for non-virtual call
    final public HelloWorld22 HelloWorld22$$init$S() {
         {
            
            //#line 12 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            
            
            //#line 12 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            this.__fieldInitializers_HelloWorld22();
        }
        return this;
    }
    
    
    
    //#line 12 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
    final public void __fieldInitializers_HelloWorld22() {
        
    }
}

