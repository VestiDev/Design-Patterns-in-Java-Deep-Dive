/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package state.exercise1;

public class ManagerState extends State {
    public int pay(StateModifier sm) {
        System.out.println("Paying lots of $$$ to manager");
        return 30000;
    }

    public void advance(StateModifier sm) {
        sm.setState(new RetireeState());
    }

    public void fire(StateModifier sm) {
        sm.setState(new EndState());
    }
}
