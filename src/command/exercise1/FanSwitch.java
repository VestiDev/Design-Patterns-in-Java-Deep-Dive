/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package command.exercise1;

public class FanSwitch extends Switch {
    private final Fan fan;

    public FanSwitch(Fan fan) {
        this.fan = fan;
    }

    public void flipUp() {
        fan.startRotate();
    }

    public void flipDown() {
        fan.stopRotate();
    }
}
