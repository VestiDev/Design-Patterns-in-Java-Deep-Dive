/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package playground;

public abstract class ContextWithSubclassing {
    public void contextInterface() {
        System.out.println("Context.contextInterface");
        algorithmInterface();
    }

    protected abstract void algorithmInterface();
}
