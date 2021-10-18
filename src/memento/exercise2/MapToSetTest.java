/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package memento.exercise2;

import java.util.*;
import java.util.concurrent.*;

public class MapToSetTest {
    public static void main(String... args) {
        Map<String, String> names = new ConcurrentHashMap<>(Map.of("Peter", "Pan",
            "Heinz", "Kabutz", "William", "Gates"));
        Set<String> firstNames1 = names.keySet();
        Set<String> firstNames2 = names.keySet();
        System.out.println(firstNames1 == firstNames2); // true

    }
}
