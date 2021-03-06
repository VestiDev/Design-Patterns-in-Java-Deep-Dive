/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package defaultvisitor.demo.d_defaultvisitorwithminus.framework;

public interface DefaultVisitor extends Visitor {
    default void visitNumber(Number n) {
        visitExpression(n);
    }

    default void visitPlus(Plus p) {
        visitExpression(p);
    }

    default void visitMinus(Minus m) {
        visitExpression(m);
    }

    default void visitExpression(Expression e) {
        // do nothing
    }
}
