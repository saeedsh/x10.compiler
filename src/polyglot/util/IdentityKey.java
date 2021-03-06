/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * This file was originally derived from the Polyglot extensible compiler framework.
 *
 *  (C) Copyright 2000-2007 Polyglot project group, Cornell University
 *  (C) Copyright IBM Corporation 2007-2014.
 */

package polyglot.util;

/**
 * Class to be used for inserting objects in hashtables using pointer equality.
 */
public class IdentityKey
{
    private Object obj;

    public IdentityKey(Object obj) {
        this.obj = obj;
    }

    public Object object() {
        return obj;
    }

    public int hashCode() {
        return System.identityHashCode(obj);
    }

    public boolean equals(Object other) {
        return other instanceof IdentityKey
            && ((IdentityKey) other).obj == obj;
    }

    public String toString() {
        return "Id(" + obj + ")";
    }
}

