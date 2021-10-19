/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package decorator.exercise1;

import java.util.*;
import java.util.concurrent.locks.*;
import java.util.stream.*;

// this class should implement Iterable<T>
public class ThreadSafeIterable<T> implements Iterable<T> {
    private final List<T> copy;

    // synchronize on the lock and copy the source into a new collection
    public ThreadSafeIterable(Iterable<T> source, Object lock) {
        synchronized (lock) {
            copy = makeCopy(source);
        }
    }

    public ThreadSafeIterable(Iterable<T> source, Lock lock) {
        lock.lock();
        try {
            copy = makeCopy(source);
        } finally {
            lock.unlock();
        }
    }

    private List<T> makeCopy(Iterable<T> source) {
        return StreamSupport.stream(source.spliterator(), false)
            .toList();
    }

    public Iterator<T> iterator() {
        return copy.iterator();
    }
}
