package com.kingland.ehm.loader;

import com.kingland.ehm.buffer.BaseBuffer;

import java.util.Scanner;

public class ConsoleLoader extends BaseLoader {
    public ConsoleLoader(BaseBuffer buffer) {
        super(buffer);
    }

    @Override
    public Object getData() {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        return a;
    }
}
