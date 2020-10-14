/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.ehm.loader;

import com.kingland.ehm.buffer.BaseBuffer;

/**
 * @author KSC
 * @description Base Loader
 */
public abstract class BaseLoader<T> extends Thread {
    /**
     * The designation buffer where loader should store data
     */
    private final BaseBuffer buffer;

    protected BaseLoader(BaseBuffer buffer) {
        this.buffer = buffer;
    }

    public abstract T getData();

    /**
     * get data from source
     * @return data to store
     */
    @Override
    public void run() {
        while (true) {
            buffer.add(getData());
        }

    }
}
