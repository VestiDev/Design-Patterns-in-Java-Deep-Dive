/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package visitor.exercise1;

public class EmailSendingVisitor implements Visitor {
    private final String msg;

    public EmailSendingVisitor(String msg) {
        this.msg = msg;
    }

    public void visit(Person person) {
            System.out.println("To: " + person.getEmail());
            System.out.println("Msg: " + msg);
            System.out.println();
    }

    public void visit(DistributionList distributionList) {
        // do nothing
    }

    public void visit(WhatsAppContact whatsAppContact) {
        // do nothing
    }
}
