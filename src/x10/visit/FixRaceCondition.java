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

import polyglot.ast.Assign;
import polyglot.ast.Eval;
import polyglot.ast.Expr;
import polyglot.ast.IntLit.Kind;
import polyglot.ast.Local;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.frontend.Job;
import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
import polyglot.util.Position;
import polyglot.visit.ContextVisitor;
import polyglot.visit.NodeVisitor;
import x10.ast.Async;
import x10.ast.Atomic;
import x10.ast.Finish;


public class FixRaceCondition extends ContextVisitor {
	
	private boolean _isInFinal = false;
	private boolean _isInAsync = false;
	
	
    public FixRaceCondition(Job job, TypeSystem ts, NodeFactory nf) {
        super(job, ts, nf);

    }

    @Override
    public Node override(Node parent, Node n) {
    	if (n instanceof Async) {
    		_isInAsync = true;
    		return null;
    	}
        if (n instanceof Finish) {
            _isInFinal = true;
            return null;
        }
        if (n instanceof Eval)
    	{
    		Eval eval = (Eval)n;
	    	Position pos = eval.position();
	        if ((eval.expr() instanceof Assign) && _isInAsync && _isInFinal) {
	        	Assign f = (Assign) eval.expr();
	            Atomic a = nf.Atomic(pos, f.left(), eval);
	            return a;
	        }
    	}
        return null;
    }

    public Node leaveCall(Node old, Node n, NodeVisitor v) throws SemanticException {
    	
    	if (n instanceof Async) {
    		_isInAsync = false;
    	}
        if (n instanceof Finish) {
            _isInFinal = false;
        }
        return n;
    }

}
