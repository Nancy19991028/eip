package com.kingland.ehm;

import com.kingland.ehm.buffer.BaseBuffer;
import com.kingland.ehm.buffer.LinkedListBuffer;
import com.kingland.ehm.loader.BaseLoader;
import com.kingland.ehm.loader.ConsoleLoader;
import com.kingland.ehm.sender.BaseSender;
import com.kingland.ehm.sender.ConsoleSender;

public class Main {
    public static void main(String[] args) {
        BaseBuffer buffer = new LinkedListBuffer<>(5);

        BaseLoader loader = new ConsoleLoader(buffer);
        BaseSender sender = new ConsoleSender(buffer);

        loader.setPriority(1);
        sender.setPriority(1);

        loader.start();
        sender.start();
    }
}
