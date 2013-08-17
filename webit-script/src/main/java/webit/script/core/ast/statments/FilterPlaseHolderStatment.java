// Copyright (c) 2013, Webit Team. All Rights Reserved.

package webit.script.core.ast.statments;

import webit.script.Context;
import webit.script.core.ast.AbstractStatment;
import webit.script.core.ast.Expression;
import webit.script.filters.Filter;
import webit.script.util.StatmentUtil;

/**
 *
 * @author Zqq
 */
public final class FilterPlaseHolderStatment extends AbstractStatment {

    private final Filter filter;
    private final Expression expr;

    public FilterPlaseHolderStatment(Filter filter, Expression expr) {
        super(expr.getLine(), expr.getColumn());
        this.filter = filter;
        this.expr = expr;
    }

    public FilterPlaseHolderStatment(Filter filter, Expression expr, int line, int column) {
        super(line, column);
        this.filter = filter;
        this.expr = expr;
    }

    @Override
    public void execute(Context context) {
        context.out(filter.process(StatmentUtil.execute(expr, context)));
    }
}
