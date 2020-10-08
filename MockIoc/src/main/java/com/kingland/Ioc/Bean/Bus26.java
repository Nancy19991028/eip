package com.kingland.Ioc.Bean;

public class Bus26 implements Car{
    /**
     * print car start
     */
    public void start() {
        System.out.println("Bus26 start!");
    }

    /**
     * print car turnLeft
     */
    public void turnLeft() {
        System.out.println("Bus26 turn left!");
    }

    /**
     * print car turnRight
     */
    public void turnRight() {
        System.out.println("Bus26 turn right!");
    }

    /**
     * print car stop
     */
    public void stop() {
        System.out.println("Bus26 stop!");
    }
}
