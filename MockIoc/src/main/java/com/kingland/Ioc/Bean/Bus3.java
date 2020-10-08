package com.kingland.Ioc.Bean;

public class Bus3 implements Car {
    /**
     * print bus start
     */
    public void start() {
        System.out.println("Bus3 start!");
    }

    /**
     * print bus turnLeft
     */
    public void turnLeft() {
        System.out.println("Bus3 turn left!");
    }

    /**
     * print bus turnRight
     */
    public void turnRight() {
        System.out.println("Bus3 turn right!");
    }

    /**
     * print bus stop
     */
    public void stop() {
        System.out.println("Bus3 stop!");
    }
}
