/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.ehm.sender;

import com.kingland.ehm.buffer.BaseBuffer;

/**
 * @author KSC
 * @description Base Sender
 */
public abstract class BaseSender<T> extends Thread {
    private final BaseBuffer buffer;

    protected BaseSender(BaseBuffer buffer) {
        this.buffer = buffer;
    }

    public abstract void send(T t);

    @Override
    public void run() {
        while (true) {
            send((T) buffer.poll());
        }

    }
}
