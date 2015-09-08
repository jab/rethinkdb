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



public class Sync extends ReqlExpr {


    public Sync(Object arg) {
        this(new Arguments(arg), null);
    }
    public Sync(Arguments args){
        this(args, null);
    }
    public Sync(Arguments args, OptArgs optargs) {
        this(TermType.SYNC, args, optargs);
    }
    protected Sync(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }

}
