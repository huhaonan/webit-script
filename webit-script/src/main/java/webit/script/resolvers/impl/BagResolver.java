// Copyright (c) 2013-2014, Webit Team. All Rights Reserved.
package webit.script.resolvers.impl;

import webit.script.lang.Bag;
import webit.script.resolvers.GetResolver;
import webit.script.resolvers.SetResolver;

/**
 *
 * @author zqq90
 */
public class BagResolver implements GetResolver, SetResolver {

    public Object get(Object object, Object property) {
        return ((Bag) object).get(property);
    }

    public void set(Object object, Object property, Object value) {
        ((Bag) object).set(property, value);
    }

    public Class getMatchClass() {
        return Bag.class;
    }
}
