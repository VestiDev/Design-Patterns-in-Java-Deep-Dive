/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package playground;

import java.lang.ref.*;

public class EmployeeTest {
    public static void main(String... args) throws InterruptedException {
        Employee heinz = new Employee();
        heinz.promote();
        heinz.promote();
        heinz.promote();
        heinz.promote();
        heinz.promote();
        System.out.println(heinz.createMemento());
        Cleaner cleaner = Cleaner.create();
        cleaner.register(heinz, () -> System.out.println("Heinz was cleaned"));
        Memento m = heinz.createMemento();
        heinz = null;
        for (int i = 0; i < 10; i++) {
            System.gc();
            Thread.sleep(100);
        }
        Employee cameron = new Employee();
        cameron.setMemento(m);
        System.out.println(cameron.createMemento());
    }
}
