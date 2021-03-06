/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package visitor.exercise1;

public class WhatsAppContact implements Contact {
    private final String phoneNumber;

    public WhatsAppContact(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
