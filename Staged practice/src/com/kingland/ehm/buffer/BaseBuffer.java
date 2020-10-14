/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.ehm.buffer;

/**
 * @author KSC
 * @description The base class of all buffers
 */
public abstract class BaseBuffer<T> {
    private final int max;

    protected BaseBuffer(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public abstract int size();

    public abstract void add(Object o);

    public abstract Object poll();
}