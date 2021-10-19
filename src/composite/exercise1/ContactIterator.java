/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package composite.exercise1;

import java.util.*;

/**
 * This ContactIterator should iterate through the composite tree structure
 * without first building up a list of elements.  It thus figures out on-the-fly
 * whether there is a next element or not.
 */
public class ContactIterator implements Iterator<Contact> {
    private final Iterator<Contact> iterator;
    public ContactIterator(Contact contact) {
        Collection<Contact> leaves = new ArrayList<>();
        recurse(contact, leaves);
        this.iterator = List.copyOf(leaves).iterator();
    }

    private void recurse(Contact contact, Collection<Contact> leaves) {
        if (contact.isLeaf()) leaves.add(contact);
        else for (Contact child : leaves) {
            recurse(child, leaves);
        }
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public Contact next() {
        return iterator.next();
    }

    /**
     * This should throw an IllegalStateException if the root node of the
     * ContactIterator is a leaf; otherwise it should remove the element from
     * the composite tree structure.
     */
    public void remove() {
        throw new UnsupportedOperationException("todo");
    }
}
