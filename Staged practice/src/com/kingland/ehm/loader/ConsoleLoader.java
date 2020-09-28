package com.kingland.ehm.loader;

import com.kingland.ehm.buffer.BaseBuffer;

public class ConsoleLoader extends BaseLoader {
    public ConsoleLoader(BaseBuffer buffer) {
        super(buffer);
    }

    @Override
    public Object getData() {
        double random = Math.random();
        return "Hello world! " + random;
    }
}
