/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package playground;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public interface ImmutableCollection<E> {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    <T> T[] toArray(T[] a);
    Object[] toArray();
    default <T> T[] toArray(IntFunction<T[]> generator) {
        return toArray(generator.apply(0));
    }
    boolean containsAll(java.util.Collection<?> c);

    // Iterator<E> iterator();
    // boolean add(E e);
    // boolean remove(Object o);
    // boolean addAll(java.util.Collection<? extends E> c);
    // boolean removeAll(java.util.Collection<?> c);
    // default boolean removeIf(Predicate<? super E> filter) {
    //     Objects.requireNonNull(filter);
    //     boolean removed = false;
    //     final Iterator<E> each = iterator();
    //     while (each.hasNext()) {
    //         if (filter.test(each.next())) {
    //             each.remove();
    //             removed = true;
    //         }
    //     }
    //     return removed;
    // }

    // boolean retainAll(java.util.Collection<?> c);

    // void clear();
}
