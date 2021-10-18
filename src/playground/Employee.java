/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package playground;

import java.lang.ref.*;

public class Employee {
    public enum Position {TESTER,PROGRAMMER,MANAGER}
    private int salary = 1000;
    private int bankBalance = 2000;
    private Position position = Position.TESTER;

    public void pay() {
        bankBalance += salary;
    }

    public void promote() {
        switch (position) {
            case TESTER -> {
                position = Position.PROGRAMMER; salary += 400;
            }
            case PROGRAMMER -> {
                position = Position.MANAGER; salary *= 3;
            }
            case MANAGER -> salary *= 1.5;
        }
    }

    public Memento createMemento() {
        return new MementoImpl(salary, bankBalance, position, this);
    }

    public void setMemento(Memento m) {
        MementoImpl mi = (MementoImpl) m;
        if (this != mi.originator.get())
            throw new IllegalArgumentException("Impersonation detected");
        this.salary = mi.salary;
        this.bankBalance = mi.bankBalance;
        this.position = mi.position;
    }

    private record MementoImpl(int salary, int bankBalance,
                               Position position,
                               Reference<Employee> originator) implements Memento {
        MementoImpl(int salary, int bankBalance, Position position,
                    Employee originator) {
            this(salary, bankBalance, position, new WeakReference<>(originator));
        }
    }
}




