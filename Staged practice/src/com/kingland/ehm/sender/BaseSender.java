package com.kingland.ehm.sender;

import com.kingland.ehm.buffer.BaseBuffer;

public abstract class BaseSender<T> extends Thread {
    private final BaseBuffer buffer;

    protected BaseSender(BaseBuffer buffer) {
        this.buffer = buffer;
    }

    public abstract void send(T t);

    @Override
    public void run() {
        while (true) {
            if (buffer.size() > 0) {
                send((T) buffer.poll());
            }
        }
    }
}
