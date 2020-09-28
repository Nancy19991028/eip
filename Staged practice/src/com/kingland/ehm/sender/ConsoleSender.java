package com.kingland.ehm.sender;

import com.kingland.ehm.buffer.BaseBuffer;

public class ConsoleSender extends BaseSender {
    public ConsoleSender(BaseBuffer buffer) {
        super(buffer);
    }

    @Override
    public void send(Object o) {
        System.out.println(o.toString());
    }
}
