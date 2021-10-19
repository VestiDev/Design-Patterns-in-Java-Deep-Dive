/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package playground;

import eu.javaspecialists.books.dynamicproxies.*;

import java.util.*;

public class CollectionDemo {
    public static void main(String... args) {
        Collection<Integer> numbers = List.of(1, 2, 3, 4);
        ImmutableCollection<Integer> numbers2 =
            Proxies.filter(ImmutableCollection.class, numbers);
        System.out.println("numbers2 = " + numbers2);
        // numbers2.remove(3);
        numbers.remove(3);
    }
}
