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


public class CountNumberOfForLoop extends NodeVisitor {
	private TypeSystem _ts;
	private int _number = 0;
	public CountNumberOfForLoop(TypeSystem ts) {
		_ts = ts;
	}	

	@Override
    public NodeVisitor enter(Node parent, Node n) {
        // keep track of the return type of the enclosing method
        if (n instanceof ClassBody) {
        	_number = 0;
        }
        else if (n instanceof For)
		{
			_number++;
		}
        return this;
    }
	@Override
    public Node leave(Node parent, Node old, Node n, NodeVisitor v) {
		if (n instanceof ClassBody)
		{
			ClassDecl type = (ClassDecl)parent;
			Reporter reporter = _ts.extensionInfo().getOptions().reporter;
			reporter.report(3, "Class "+type.name().toString()+" contains "+_number+" fors");
		}
		return n;
	}
}
