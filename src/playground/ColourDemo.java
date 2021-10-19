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

public class ColourDemo {
    public static void main(String... args) {
        List<String> colours = List.of(
            "red", "green", "yellow", "cyan", "purple", "orange"
        );
        Function<String, String> upperCaser = String::toUpperCase;
        System.out.println("upperCaser = " + upperCaser);
        List<String> bigColours = colours.stream()
            .map(upperCaser).toList();
        System.out.println("bigColours = " + bigColours);
    }
}
