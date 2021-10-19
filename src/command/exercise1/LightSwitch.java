/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package command.exercise1;

public class LightSwitch extends Switch {
    private final Light light;

    public LightSwitch(Light light) {
        this.light = light;
    }

    public void flipUp() {
        light.turnOn();
    }

    public void flipDown() {
        light.turnOff();
    }
}
