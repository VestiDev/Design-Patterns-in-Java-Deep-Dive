/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package playground;

import java.util.concurrent.*;

public class PolymorphicBuilder {
    public static void main(String... args) throws InterruptedException {
        /* Project Loom
        Thread.Builder builder1 = Thread.ofPlatform()
            .daemon()
            .priority(Thread.MAX_PRIORITY)
            .name("platform-thread");
        Thread.Builder builder2 = Thread.ofVirtual()
            .scheduler(ForkJoinPool.commonPool())
            .name("virtual-thread");

        Thread platformThread = builder1.start(() ->
            System.out.println("I am " + Thread.currentThread()));
        Thread virtualThread = builder2.start(() ->
            System.out.println("I am " + Thread.currentThread()));

        platformThread.join();
        virtualThread.join();
         */
    }
}
