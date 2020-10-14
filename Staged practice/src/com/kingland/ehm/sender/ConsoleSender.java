/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.ehm.sender;

import com.kingland.ehm.buffer.BaseBuffer;

/**
 * @author KSC
 * @description This extends BaseSender to send data into console
 */
public class ConsoleSender extends BaseSender {
    public ConsoleSender(BaseBuffer buffer) {
        super(buffer);
    }

    @Override
    public void send(Object o) {
        System.out.println(o.toString());
    }
}
