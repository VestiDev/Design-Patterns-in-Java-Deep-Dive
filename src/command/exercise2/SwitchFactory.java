/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package command.exercise2;

import java.lang.invoke.*;
import java.util.*;

public class SwitchFactory {
    private static final Map<Class<?>, MethodHandle> upMapping;

    static {
        try {
            upMapping = Map.of(
                Fan.class, MethodHandles.lookup().findVirtual(
                    Fan.class, "startRotate", MethodType.methodType(void.class)),
                Light.class, MethodHandles.lookup().findVirtual(
                    Light.class, "turnOn", MethodType.methodType(void.class))
            );
        } catch (ReflectiveOperationException e) {
            throw new Error(e);
        }
    }


    private SwitchFactory() {
    }

    public static Switch make(Fan fan) {
        return new Switch(
            fan::startRotate,
            fan::stopRotate
        );
    }

    public static Switch make(Light light) {
        return new Switch(
            light::turnOn,
            light::turnOff
        );
    }
}
