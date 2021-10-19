/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package visitor.exercise1;

import java.util.*;
import java.util.concurrent.*;

/**
 * This visitor must return a unique set of all emails in the contact structure
 * in alphabetical order.
 */
public class EmailGatheringVisitor implements Visitor, Iterable<String> {
    private final SortedSet<String> emails = new ConcurrentSkipListSet<>();
    private final SortedSet<String> unmodifiableEmails =
        Collections.unmodifiableSortedSet(emails);

    public Iterator<String> iterator() {
        return unmodifiableEmails.iterator();
    }

    public void visit(Person person) {
        emails.add(person.getEmail());
    }

    public void visit(DistributionList distributionList) {
        // do nothing
    }

    public void visit(WhatsAppContact whatsAppContact) {
        // do nothing
    }
}
