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

import x10.io.Console;

/**
 * The classic hello world program, shows how to output to the console.
 */
class HelloWorld {
  public static def main(Rail[String]) {
        val P = [1,2,3];
        finish for (p in P) {
            Console.OUT.println("Hello World"+p);
            for (p2 in P)
            	for (p3 in P);
            for (p2 in P);
        }
        
    }
    
    def dist():Double {
    	val P = [1,2,3];
    	for (p2 in P);
        return 2.1;
    }
}


