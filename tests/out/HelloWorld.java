@x10.runtime.impl.java.X10Generated
public class HelloWorld extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<HelloWorld> $RTT = 
        x10.rtt.NamedType.<HelloWorld> make("HelloWorld",
                                            HelloWorld.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(HelloWorld $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + HelloWorld.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        HelloWorld $_obj = new HelloWorld((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public HelloWorld(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 2 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
    public double dist$O() {
        
        //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        final x10.core.Rail rail$207 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {1L, 2L})));
        
        //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        final long size$208 = ((x10.core.Rail<x10.core.Long>)rail$207).size;
        
        //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        long idx$197 = 0L;
        {
            
            //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            final long[] rail$207$value$230 = ((long[])rail$207.value);
            
            //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            for (;
                 true;
                 ) {
                
                //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$198 = idx$197;
                
                //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final boolean t$199 = ((t$198) < (((long)(size$208))));
                
                //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                if (!(t$199)) {
                    
                    //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                    break;
                }
                
                //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$193 = idx$197;
                
                //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long p$194 = ((long)rail$207$value$230[(int)t$193]);
                
                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final x10.core.Rail rail$191 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {1L, 2L})));
                
                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long size$192 = ((x10.core.Rail<x10.core.Long>)rail$191).size;
                
                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                long idx$188 = 0L;
                {
                    
                    //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                    final long[] rail$191$value$229 = ((long[])rail$191.value);
                    
                    //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long t$189 = idx$188;
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final boolean t$190 = ((t$189) < (((long)(size$192))));
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        if (!(t$190)) {
                            
                            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                            break;
                        }
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long t$184 = idx$188;
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long p$185 = ((long)rail$191$value$229[(int)t$184]);
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long t$186 = idx$188;
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        final long t$187 = ((t$186) + (((long)(1L))));
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                        idx$188 = t$187;
                    }
                }
                
                //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$195 = idx$197;
                
                //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$196 = ((t$195) + (((long)(1L))));
                
                //#line 3 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                idx$197 = t$196;
            }
        }
        
        //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        final x10.core.Rail rail$209 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {1L, 2L})));
        
        //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        final long size$210 = ((x10.core.Rail<x10.core.Long>)rail$209).size;
        
        //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        long idx$204 = 0L;
        {
            
            //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            final long[] rail$209$value$231 = ((long[])rail$209.value);
            
            //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            for (;
                 true;
                 ) {
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$205 = idx$204;
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final boolean t$206 = ((t$205) < (((long)(size$210))));
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                if (!(t$206)) {
                    
                    //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                    break;
                }
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$200 = idx$204;
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long p$201 = ((long)rail$209$value$231[(int)t$200]);
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$202 = idx$204;
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                final long t$203 = ((t$202) + (((long)(1L))));
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
                idx$204 = t$203;
            }
        }
        
        //#line 7 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        return 8.1;
    }
    
    
    //#line 1 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
    final public HelloWorld HelloWorld$$this$HelloWorld() {
        
        //#line 1 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
        return HelloWorld.this;
    }
    
    
    //#line 1 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
    // creation method for java code (1-phase java constructor)
    public HelloWorld() {
        this((java.lang.System[]) null);
        HelloWorld$$init$S();
    }
    
    // constructor for non-virtual call
    final public HelloWorld HelloWorld$$init$S() {
         {
            
            //#line 1 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            
            
            //#line 1 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
            this.__fieldInitializers_HelloWorld();
        }
        return this;
    }
    
    
    
    //#line 1 "/data/src/x10-trunk/x10.compiler/tests/test.x10"
    final public void __fieldInitializers_HelloWorld() {
        
    }
}

