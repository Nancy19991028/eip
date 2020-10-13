package com.kingland.ehm.buffer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LinkedListBuffer<T> extends BaseBuffer {
    private final Queue<T> queue;

    private Lock lock = new ReentrantLock();//创建锁对象
    private Condition condition = lock.newCondition();//创建锁的条件，情况

    public LinkedListBuffer(int max) {
        super(max);
        this.queue = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

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
