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
package x10c.visit;

import polyglot.ast.*;
import polyglot.main.Reporter;
import polyglot.types.TypeSystem;
import polyglot.visit.NodeVisitor;
import x10.ast.FinishExpr;


public class FixRaceCondition extends NodeVisitor {
	private Reporter reporter;
	private int _number = 0;
	public FixRaceCondition(TypeSystem ts) {
		reporter = ts.extensionInfo().getOptions().reporter;
	}	

	@Override
    public Node leave(Node parent, Node old, Node n, NodeVisitor v) {
		if (n instanceof LocalDecl){
            LocalDecl f = (LocalDecl) n;
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

		return n;
	}
}
