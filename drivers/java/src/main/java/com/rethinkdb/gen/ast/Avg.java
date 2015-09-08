// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.exc.ReqlDriverError;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class Avg extends ReqlExpr {


    public Avg(Object arg) {
        this(new Arguments(arg), null);
    }
    public Avg(Arguments args){
        this(args, null);
    }
    public Avg(Arguments args, OptArgs optargs) {
        this(TermType.AVG, args, optargs);
    }
    protected Avg(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }

}
