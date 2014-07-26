package harness;


@x10.runtime.impl.java.X10Generated
abstract public class x10Test extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<x10Test> $RTT = 
        x10.rtt.NamedType.<x10Test> make("harness.x10Test",
                                         x10Test.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(harness.x10Test $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + x10Test.class + " calling"); } 
        $_obj.myRand = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.myRand);
        
    }
    
    // constructor just for allocation
    public x10Test(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 30 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    abstract public boolean run$O();
    
    
    //#line 32 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public void executeAsync() {
        
        //#line 33 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final x10.lang.Cell b = ((x10.lang.Cell)(new x10.lang.Cell<x10.core.Boolean>((java.lang.System[]) null, x10.rtt.Types.BOOLEAN).x10$lang$Cell$$init$S((x10.core.Boolean.$box(false)), (x10.lang.Cell.__0x10$lang$Cell$$T) null)));
        
        //#line 34 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        try {{
            {
                
                //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                x10.lang.Runtime.ensureNotInAtomic();
                
                //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final x10.lang.FinishState x10$__var1 = x10.lang.Runtime.startFinish();
                
                //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                try {{
                    {
                        
                        //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                        x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new harness.x10Test.$Closure$0(this, b, (harness.x10Test.$Closure$0.__1$1x10$lang$Boolean$2) null))));
                    }
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
                    //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                    x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                    
                    //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                     x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var1)));
                 }}
                }
            }}catch (final java.lang.Throwable e) {
                
                //#line 37 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                e.printStackTrace();
            }
        
        //#line 39 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final boolean t$656 = x10.core.Boolean.$unbox(((x10.lang.Cell<x10.core.Boolean>)b).$apply$G());
        
        //#line 39 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        harness.x10Test.reportResult((boolean)(t$656));
        }
    
    
    //#line 42 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public void execute() {
        
        //#line 43 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        boolean b = false;
        
        //#line 44 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        try {{
            {
                
                //#line 45 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                x10.lang.Runtime.ensureNotInAtomic();
                
                //#line 45 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final x10.lang.FinishState x10$__var2 = x10.lang.Runtime.startFinish();
                
                //#line 45 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                try {{
                    {
                        
                        //#line 45 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                        final boolean t$657 = this.run$O();
                        
                        //#line 45 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                        b = t$657;
                    }
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
                    //#line 45 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                    x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                    
                    //#line 45 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 45 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                     x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var2)));
                 }}
                }
            }}catch (final java.lang.Throwable e) {
                
                //#line 47 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                e.printStackTrace();
            }
        
        //#line 49 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final boolean t$658 = b;
        
        //#line 49 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        harness.x10Test.reportResult((boolean)(t$658));
        }
    
    
    //#line 58 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public static java.lang.String pathCombine(final java.lang.String prefix, final java.lang.String file) {
        
        //#line 59 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final x10.util.Map env = x10.lang.System.getenv();
        
        //#line 60 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final java.lang.String home = ((java.lang.String)
                                        ((x10.util.Map<java.lang.String, java.lang.String>)env).getOrElse(((java.lang.String)("X10_TEST_DIR")), x10.rtt.Types.STRING, ((java.lang.String)(null)), x10.rtt.Types.STRING));
        
        //#line 61 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final boolean t$665 = ((home) == (null));
        
        //#line 61 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        if (t$665) {
            
            //#line 62 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            return file;
        } else {
            
            //#line 64 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            final char t$659 = x10.io.File.SEPARATOR;
            
            //#line 64 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            final java.lang.String t$660 = ((home) + ((x10.core.Char.$box(t$659))));
            
            //#line 64 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            final java.lang.String t$661 = ((t$660) + (prefix));
            
            //#line 64 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            final char t$662 = x10.io.File.SEPARATOR;
            
            //#line 64 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            final java.lang.String t$663 = ((t$661) + ((x10.core.Char.$box(t$662))));
            
            //#line 64 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            final java.lang.String t$664 = ((t$663) + (file));
            
            //#line 64 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            return t$664;
        }
    }
    
    
    //#line 67 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public static java.lang.String pathCombine__0$1x10$lang$String$2(final x10.core.Rail<java.lang.String> prefix, final java.lang.String file) {
        
        //#line 68 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final long t$666 = ((x10.core.Rail<java.lang.String>)prefix).size;
        
        //#line 68 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final boolean t$667 = ((long) t$666) == ((long) 0L);
        
        //#line 68 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        if (t$667) {
            
            //#line 68 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            return file;
        }
        
        //#line 69 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final x10.util.StringBuilder sb = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null).x10$util$StringBuilder$$init$S()));
        
        //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final long i$640min$704 = 0L;
        
        //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final long t$705 = ((x10.core.Rail<java.lang.String>)prefix).size;
        
        //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final long i$640max$706 = ((t$705) - (((long)(2L))));
        
        //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        long i$701 = i$640min$704;
        {
            
            //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            final java.lang.String[] prefix$value$713 = ((java.lang.String[])prefix.value);
            
            //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            for (;
                 true;
                 ) {
                
                //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final long t$702 = i$701;
                
                //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final boolean t$703 = ((t$702) <= (((long)(i$640max$706))));
                
                //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                if (!(t$703)) {
                    
                    //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                    break;
                }
                
                //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final long i$698 = i$701;
                
                //#line 71 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final java.lang.String t$696 = ((java.lang.String)prefix$value$713[(int)i$698]);
                
                //#line 71 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                sb.add(((java.lang.String)(t$696)));
                
                //#line 72 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final char t$697 = x10.io.File.SEPARATOR;
                
                //#line 72 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                sb.add((char)(t$697));
                
                //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final long t$699 = i$701;
                
                //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final long t$700 = ((t$699) + (((long)(1L))));
                
                //#line 70 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                i$701 = t$700;
            }
        }
        
        //#line 74 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final long t$676 = ((x10.core.Rail<java.lang.String>)prefix).size;
        
        //#line 74 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final long t$677 = ((t$676) - (((long)(1L))));
        
        //#line 74 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final java.lang.String t$678 = ((java.lang.String[])prefix.value)[(int)t$677];
        
        //#line 74 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        sb.add(((java.lang.String)(t$678)));
        
        //#line 75 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final java.lang.String t$679 = sb.toString();
        
        //#line 75 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final java.lang.String t$680 = harness.x10Test.pathCombine(((java.lang.String)(t$679)), ((java.lang.String)(file)));
        
        //#line 75 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        return t$680;
    }
    
    
    //#line 78 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    final public static java.lang.String PREFIX = "++++++ ";
    
    
    //#line 80 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public static void success() {
        
        //#line 81 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final java.lang.String t$681 = ((java.lang.String)(harness.x10Test.PREFIX));
        
        //#line 81 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final java.lang.String t$682 = "++++++ Test succeeded.";
        
        //#line 81 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        harness.x10Test.println(((java.lang.String)(t$682)));
        
        //#line 82 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        x10.lang.System.setExitCode((int)(0));
    }
    
    
    //#line 85 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public static void failure() {
        
        //#line 86 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final java.lang.String t$683 = ((java.lang.String)(harness.x10Test.PREFIX));
        
        //#line 86 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final java.lang.String t$684 = "++++++ Test failed.";
        
        //#line 86 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        harness.x10Test.println(((java.lang.String)(t$684)));
        
        //#line 87 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        x10.lang.System.setExitCode((int)(1));
    }
    
    
    //#line 90 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public static void reportResult(final boolean b) {
        
        //#line 91 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        if (b) {
            
            //#line 91 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            harness.x10Test.success();
        } else {
            
            //#line 91 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            harness.x10Test.failure();
        }
    }
    
    
    //#line 94 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    @x10.runtime.impl.java.X10Generated
    public static class TestException extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<TestException> $RTT = 
            x10.rtt.NamedType.<TestException> make("harness.x10Test.TestException",
                                                   TestException.class,
                                                   new x10.rtt.Type[] {
                                                       x10.rtt.Types.EXCEPTION
                                                   });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        private Object writeReplace() throws java.io.ObjectStreamException {
            return new x10.serialization.SerializationProxy(this);
        }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(harness.x10Test.TestException $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + TestException.class + " calling"); } 
            $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            harness.x10Test.TestException $_obj = new harness.x10Test.TestException((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
            
        }
        
        // constructor just for allocation
        public TestException(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        
        //#line 96 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        public TestException() {
            super();
             {
                
                //#line 96 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                
                
                //#line 94 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                this.__fieldInitializers_harness_x10Test_TestException();
            }
        }
        
        
        
        //#line 98 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        public TestException(final java.lang.Throwable cause) {
            super(((java.lang.Throwable)(cause)));
             {
                
                //#line 98 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                
                
                //#line 94 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                this.__fieldInitializers_harness_x10Test_TestException();
            }
        }
        
        
        
        //#line 100 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        public TestException(final java.lang.String message) {
            super(((java.lang.String)(message)));
             {
                
                //#line 100 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                
                
                //#line 94 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                this.__fieldInitializers_harness_x10Test_TestException();
            }
        }
        
        
        
        //#line 102 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        public TestException(final java.lang.String message, final java.lang.Throwable cause) {
            super(((java.lang.String)(message)), ((java.lang.Throwable)(cause)));
             {
                
                //#line 102 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                
                
                //#line 94 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                this.__fieldInitializers_harness_x10Test_TestException();
            }
        }
        
        
        
        //#line 94 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final public harness.x10Test.TestException harness$x10Test$TestException$$this$harness$x10Test$TestException() {
            
            //#line 94 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            return harness.x10Test.TestException.this;
        }
        
        
        //#line 94 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final public void __fieldInitializers_harness_x10Test_TestException() {
            
        }
    }
    
    
    
    //#line 109 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public static void chk(final boolean b) {
        
        //#line 110 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final boolean t$686 = !(b);
        
        //#line 110 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        if (t$686) {
            
            //#line 110 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            final harness.x10Test.TestException t$685 = ((harness.x10Test.TestException)(new harness.x10Test.TestException()));
            
            //#line 110 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            throw t$685;
        }
    }
    
    
    //#line 117 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public static void chk(final boolean b, final java.lang.String s) {
        
        //#line 118 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final boolean t$688 = !(b);
        
        //#line 118 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        if (t$688) {
            
            //#line 118 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            final harness.x10Test.TestException t$687 = ((harness.x10Test.TestException)(new harness.x10Test.TestException(((java.lang.String)(s)))));
            
            //#line 118 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            throw t$687;
        }
    }
    
    
    //#line 121 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public x10.util.Random myRand;
    
    
    //#line 126 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public int ranInt$O(final int lb, final int ub) {
        
        //#line 127 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final x10.util.Random t$690 = ((x10.util.Random)(myRand));
        
        //#line 127 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final int t$689 = ((ub) - (((int)(lb))));
        
        //#line 127 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final int t$691 = ((t$689) + (((int)(1))));
        
        //#line 127 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final int t$692 = t$690.nextInt$O((int)(t$691));
        
        //#line 127 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final int t$693 = ((lb) + (((int)(t$692))));
        
        //#line 127 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        return t$693;
    }
    
    
    //#line 130 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    public static void println(final java.lang.String s) {
        
        //#line 130 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final x10.io.Printer t$694 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 130 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        t$694.println(((java.lang.Object)(s)));
    }
    
    
    //#line 24 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    final public harness.x10Test harness$x10Test$$this$harness$x10Test() {
        
        //#line 24 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        return harness.x10Test.this;
    }
    
    
    //#line 24 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    
    // constructor for non-virtual call
    final public harness.x10Test harness$x10Test$$init$S() {
         {
            
            //#line 24 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            
            
            //#line 24 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            this.__fieldInitializers_harness_x10Test();
        }
        return this;
    }
    
    
    
    //#line 24 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
    final public void __fieldInitializers_harness_x10Test() {
        
        //#line 121 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        final x10.util.Random t$695 = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).x10$util$Random$$init$S(((long)(1L)))));
        
        //#line 24 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
        this.myRand = t$695;
    }
    
    public static java.lang.String get$PREFIX() {
        return harness.x10Test.PREFIX;
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
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(harness.x10Test.$Closure$0 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$0.class + " calling"); } 
            $_obj.out$$ = $deserializer.readObject();
            $_obj.b = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            harness.x10Test.$Closure$0 $_obj = new harness.x10Test.$Closure$0((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.b);
            
        }
        
        // constructor just for allocation
        public $Closure$0(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Boolean$2 {}
        
    
        
        public void $apply() {
            
            //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
            try {{
                
                //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                final boolean t$655 = this.out$$.run$O();
                
                //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                ((x10.lang.Cell<x10.core.Boolean>)this.b).$apply__0x10$lang$Cell$$T(x10.core.Boolean.$box(t$655));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 35 "/data/src/x10-trunk/x10.tests/tests/x10lib/harness/x10Test.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public harness.x10Test out$$;
        public x10.lang.Cell<x10.core.Boolean> b;
        
        public $Closure$0(final harness.x10Test out$$, final x10.lang.Cell<x10.core.Boolean> b, __1$1x10$lang$Boolean$2 $dummy) {
             {
                this.out$$ = out$$;
                this.b = ((x10.lang.Cell)(b));
            }
        }
        
    }
    
    }
    
    