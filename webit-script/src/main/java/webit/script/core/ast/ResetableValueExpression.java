// Copyright (c) 2013-2014, Webit Team. All Rights Reserved.
package webit.script.core.ast;

import webit.script.Context;

/**
 *
 * @author Zqq
 */
public abstract class ResetableValueExpression extends Expression {

    protected ResetableValueExpression(int line, int column) {
        super(line, column);
    }

    public abstract Object setValue(Context context, Object value);
}
