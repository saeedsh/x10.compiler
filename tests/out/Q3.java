@x10.runtime.impl.java.X10Generated
public class Q3 extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Q3> $RTT = 
        x10.rtt.NamedType.<Q3> make("Q3",
                                    Q3.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Q3 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Q3.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Q3 $_obj = new Q3((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Q3(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 2 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
    public static void Race(final int P) {
        
        //#line 3 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
        long results = 0L;
        {
            
            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
            final x10.lang.FinishState x10$__var0 = x10.lang.Runtime.startFinish();
            {
                
                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                final long[] $results$101 = new long[1];
                
                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                $results$101[(int)0]=results;
                
                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                try {{
                    {
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                        final long i$67min$68 = 1L;
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                        final long i$67max$69 = ((long)(((int)(P))));
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                        long i$94 = i$67min$68;
                        
                        //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                            final long t$95 = i$94;
                            
                            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                            final boolean t$96 = ((t$95) <= (((long)(i$67max$69))));
                            
                            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                            if (!(t$96)) {
                                
                                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                                break;
                            }
                            
                            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                            final long p$91 = i$94;
                            
                            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                            x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Q3.$Closure$0($results$101, p$91))));
                            
                            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                            final long t$92 = i$94;
                            
                            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                            final long t$93 = ((t$92) + (((long)(1L))));
                            
                            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                            i$94 = t$93;
                        }
                    }
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
                    //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                    x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                    
                    //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                     x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var0)));
                 }}
                
                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                results = ((long)$results$101[(int)0]);
                }
            }
        }
    
    
    //#line 1 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
    final public Q3 Q3$$this$Q3() {
        
        //#line 1 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
        return Q3.this;
    }
    
    
    //#line 1 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
    // creation method for java code (1-phase java constructor)
    public Q3() {
        this((java.lang.System[]) null);
        Q3$$init$S();
    }
    
    // constructor for non-virtual call
    final public Q3 Q3$$init$S() {
         {
            
            //#line 1 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
            
            
            //#line 1 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
            this.__fieldInitializers_Q3();
        }
        return this;
    }
    
    
    
    //#line 1 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
    final public void __fieldInitializers_Q3() {
        
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
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(Q3.$Closure$0 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + $Closure$0.class + " calling"); } 
            $_obj.$results$101 = $deserializer.readObject();
            $_obj.p$91 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            Q3.$Closure$0 $_obj = new Q3.$Closure$0((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$results$101);
            $serializer.write(this.p$91);
            
        }
        
        // constructor just for allocation
        public $Closure$0(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
            try {{
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                final long t$89 = ((long)this.$results$101[(int)0]);
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                final long t$90 = ((t$89) + (((long)(this.p$91))));
                
                //#line 5 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                this.$results$101[(int)0]=t$90;
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 4 "/data/src/x10-trunk/x10.compiler/tests/Q3.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public long[] $results$101;
        public long p$91;
        
        public $Closure$0(final long[] $results$101, final long p$91) {
             {
                this.$results$101 = $results$101;
                this.p$91 = p$91;
            }
        }
        
    }
    
    }
    
    