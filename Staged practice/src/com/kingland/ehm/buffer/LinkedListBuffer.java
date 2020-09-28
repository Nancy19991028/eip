package com.kingland.ehm.buffer;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListBuffer<T> extends BaseBuffer {
    private final Queue<T> queue;

    public LinkedListBuffer(int max) {
        super(max);
        this.queue = new LinkedList<>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean add(Object o) {
        return queue.add((T) o);
    }

    @Override
    public Object poll() {
        return queue.poll();
    }
}
