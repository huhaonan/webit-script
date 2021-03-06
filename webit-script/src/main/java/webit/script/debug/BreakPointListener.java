// Copyright (c) 2013, Webit Team. All Rights Reserved.

package webit.script.debug;

import webit.script.Context;
import webit.script.core.ast.Statement;

/**
 *
 * @author zqq
 */
public interface BreakPointListener {
    
    void onBreak(String label, Context context, Statement statement, Object result);
}
