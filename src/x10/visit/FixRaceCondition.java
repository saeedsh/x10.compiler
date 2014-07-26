/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2006-2014.
 */
package x10.visit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import polyglot.ast.*;
import polyglot.frontend.Job;
import polyglot.main.Reporter;
import polyglot.types.Context;
import polyglot.types.Flags;
import polyglot.types.LocalDef;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.types.Types;
import polyglot.util.Position;
import polyglot.visit.ContextVisitor;
import polyglot.visit.NodeVisitor;
import x10.ast.Async;
import x10.ast.AtStmt;
import x10.ast.Finish;
import x10.ast.FinishExpr;
import x10.ast.X10Binary_c;
import x10.util.synthesizer.InstanceCallSynth;
import x10cuda.ast.CUDAKernel;


public class FixRaceCondition extends ContextVisitor {
	private Reporter reporter;
	private int _number = 0;
	public FixRaceCondition(Job job, TypeSystem ts, NodeFactory nf) {
		super(job, ts, nf);
		reporter = ts.extensionInfo().getOptions().reporter;
	}	

	@Override
    public Node override(Node parent, Node n) { 
    	if (n instanceof Finish) {
    		Finish finish = (Finish) n;
    		// Translate clocked finish S ==> 
    		// var clock_??1:Clock=null; 
    		// finish 
    		// try { 
    		//   val clock_??2 = Clock.make(); 
    		//   clock_??1=clock_??2; 
    		//   S; //--> nested clocked async T ==> async clocked(clock_??2) T
    		//  } finally {
    		//    clock_???.drop();
    		//  }
    		// TODO: Simplify this to finish { val clock?? = Clock.make(); try { S} finally{ clock??.drop();}}
//    		Context xc = context();
//    		Position pos = finish.position();
//    		Name name = xc.makeFreshName("clock");
//    		Flags flags = Flags.FINAL;
//    		Type type = ts.Clock();
//    		
//    		final Name varName = xc.getNewVarName();
//			final LocalDef li = ts.localDef(pos, flags, Types.ref(type), varName);
//			final Id varId = nf.Id(pos, varName);
//			final Local ldRef = (Local) nf.Local(pos, varId).localInstance(li.asInstance()).type(type);
//			clockStack.push(ldRef);
//			
//			final Name outerVarName = xc.getNewVarName();
//			final LocalDef outerLi = ts.localDef(pos, flags, Types.ref(type), outerVarName);
//			final Id outerVarId = nf.Id(pos, outerVarName);
//			final Local outerLdRef = (Local) nf.Local(pos, outerVarId).localInstance(outerLi.asInstance()).type(type);
//
//			try {
//				Expr clock = synth.makeStaticCall(pos, type, MAKE, type, xc);
//				final TypeNode tn = nf.CanonicalTypeNode(pos, type);
//				Expr nullLit = nf.NullLit(pos).type(type);
//				final LocalDecl outerLd = nf.LocalDecl(pos, nf.FlagsNode(pos, Flags.NONE), tn, outerVarId, nullLit).localDef(outerLi);
//				
//				Block block = synth.toBlock(finish.body());
//				final LocalDecl ld = nf.LocalDecl(pos, nf.FlagsNode(pos, flags), tn, varId, clock).localDef(li);
//				Stmt assign = nf.Eval(pos, synth.makeAssign(pos, outerLdRef, Assign.ASSIGN, ldRef, xc));
//				block = block.prepend(assign);
//				block = block.prepend(ld);
//				Eval drop = nf.Eval(pos, new InstanceCallSynth(nf, xc, pos, outerLdRef, DROP).genExpr());
//	            Expr cond = nf.Binary(pos, outerLdRef, X10Binary_c.NE, nf.NullLit(pos).type(ts.Null())).type(ts.Boolean());
//				Stmt stm1 = nf.Try(pos, block, Collections.<Catch>emptyList(), nf.Block(pos, nf.If(pos, cond, drop)));
//				Node result = visitEdgeNoOverride(parent, nf.Block(pos, outerLd, nf.Finish(pos, stm1, false)));
//				return result;
//			} catch (SemanticException z) {
//				return null;
//			} finally {
//			    clockStack.pop();
//			}
    	}
    	
        // match at (p) async S and treat it as if it were async (p) S.
    	if (n instanceof AtStmt) {
//    	    AtStmt atStm = (AtStmt) n;
//    	    Stmt body = atStm.body();
//    	    Async async = toAsync(body);
//    	    if (async==null)
//    	        return null;
//    	    Expr place = atStm.place();
//            if (ts.hasSameClassDef(Types.baseType(place.type()), ts.GlobalRef())) {
//                try {
//                    place = synth.makeFieldAccess(async.position(),place, ts.homeName(), context());
//                } catch (SemanticException e) {
//                }
//            }
//            List<Expr> clocks = async.clocks();
//            place = (Expr) visitEdgeNoOverride(atStm, place);
//            body = (Stmt) visitEdgeNoOverride(async, async.body());
//            if (clocks != null && ! clocks.isEmpty()) {
//                List<Expr> nclocks = new ArrayList<Expr>();
//                for (Expr c : clocks) {
//                    nclocks.add((Expr) visitEdgeNoOverride(async, c));
//                }
//                clocks =nclocks;
//            }
//            try {
//                Expr prof = getProfile(atStm.atDef());
//                return visitAsyncPlace(async, place, body, atStm.atDef().capturedEnvironment(), prof);
//            } catch (SemanticException z) {
//                return null;
//            }
    	}
    	
    	// CUDA KLUDGE: match async at(p) @CUDA S and compile it as if it were async(p) @CUDA S.
    	// TODO: Think about whether we can instead use a pattern that matches current (X10 2.4.3)
    	//       idioms for remote activity spawning.
    	if (n instanceof Async) {
    		Async async = (Async) n;
    		Stmt body = async.body();
//    		AtStmt atStm = toAtStmt(body);
//    		if (atStm==null) {
//    			return null;
//    		}
//            if (!(atStm.body() instanceof CUDAKernel)) {
//                return null;
//            }
//    		Expr place = atStm.place(); 
//    		if (ts.hasSameClassDef(Types.baseType(place.type()), ts.GlobalRef())) {
//    			try {
//    				place = synth.makeFieldAccess(async.position(),place, ts.homeName(), context());
//    			} catch (SemanticException e) {
//    			}
//    		}
//    		List<Expr> clocks = async.clocks();
//    		place = (Expr) visitEdgeNoOverride(atStm, place);
//    		body = (Stmt) visitEdgeNoOverride(atStm, atStm.body());
//    		if (clocks != null && ! clocks.isEmpty()) {
//    			List<Expr> nclocks = new ArrayList<Expr>();
//    			for (Expr c : clocks) {
//    				nclocks.add((Expr) visitEdgeNoOverride(async, c));
//    			}
//    			clocks =nclocks;
//    		}
//    		try {
//                Expr prof = getProfile(async.asyncDef());
//    			return visitAsyncPlace(async, place, body, atStm.atDef().capturedEnvironment(), prof);
//    		} catch (SemanticException z) {
//    			return null;
//    		}
    	}
        if (n instanceof Eval) {
//            try {
////                Stmt s = visitEval((Eval) n);
////                flag = 1;
////                return visitEdgeNoOverride(parent, s);
//            }
//            catch (SemanticException e) {
//                return null;
//            }
        }

        return null;
    }
	//Collecting Finish Use : store reducer when enter finishR
    @Override
    protected NodeVisitor enterCall(Node parent, Node n) {
        if (n instanceof LocalDecl){
            LocalDecl f = (LocalDecl) n;
            Expr ex = f.init();
            if (f.init() instanceof FinishExpr) {
            	reporter.report(3, "FINISH");
            }
        }
        if (n instanceof Eval) {
            if (((Eval) n).expr() instanceof Assign) {
                Assign f = (Assign) ((Eval)n).expr();
                Expr right = f.right();
                if (right instanceof FinishExpr) {
                	reporter.report(3, "FINISH");
                }
            }
        }
        if (n instanceof Return) {
            Return f = (Return) n;
            if (f.expr() instanceof FinishExpr) {
            	reporter.report(3, "FINISH");
            }
        }

        return this;
    }
}
