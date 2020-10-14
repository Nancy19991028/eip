/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.ehm.buffer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author KSC
 * @description The buffer used Linked List which can add and poll elements
 */
public class LinkedListBuffer<T> extends BaseBuffer {
    private final Queue<T> queue;

    /**
     * Create a lock object
     */
    private Lock lock = new ReentrantLock();

    /**
     * Conditions for creating locks
     */
    private Condition condition = lock.newCondition();

    public LinkedListBuffer(int max) {
        super(max);
        this.queue = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    /**
     * Create a lock for the Add loop
     * @param o to add
     */
    @Override
    public void add(Object o) {
        try {
            lock.lock();
            while (queue.size() == getMax()) {
                try {
                    System.out.println("add await before");
                    condition.await();
                    System.out.println("add await after");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.add((T) o);
            System.out.println("add signal before");
            condition.signal();
            System.out.println("add signal after");

        } finally {
            lock.unlock();
        }

    }

    /**
     * Create a lock for the Poll loop
     * @return the first element
     */
    @Override
    public Object poll() {
        T poll;
        try {
            lock.lock();
            while (queue.size() == 0) {
                try {
                    System.out.println("poll await before");
                    condition.await();
                    System.out.println("poll await after");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            poll = queue.poll();
            System.out.println("poll signal before");
            condition.signal();
            System.out.println("poll signal after");

        } finally {
            lock.unlock();
        }

        return poll;
    }
}
