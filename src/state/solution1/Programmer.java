/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package state.solution1;

public class Programmer extends Worker {
    public int pay(Employee employee) {
        System.out.println("Programmer getting paid");
        return 3000;
    }

    public void advance(Employee employee) {
        employee.setState(MANAGER);
    }
}
