/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package composite.exercise1;

import java.util.*;

public interface Contact {
    default void add(Contact contact) {
    }

    default void remove(Contact contact) {
    }

    void sendMail(String msg);

    default boolean isLeaf() {
        return true;
    }

    default Iterator<Contact> children() {
        return List.<Contact>of().iterator();
    }
}
