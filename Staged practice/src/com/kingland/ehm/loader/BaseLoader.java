package com.kingland.ehm.loader;

import com.kingland.ehm.buffer.BaseBuffer;

public abstract class BaseLoader<T> extends Thread {
    private final BaseBuffer buffer;

    protected BaseLoader(BaseBuffer buffer) {
        this.buffer = buffer;
    }

    public abstract T getData();

    @Override
    public void run() {
        while (true) {
            if (buffer.size() < buffer.getMax()) {
                buffer.add(getData());
            }
        }
    }
}
