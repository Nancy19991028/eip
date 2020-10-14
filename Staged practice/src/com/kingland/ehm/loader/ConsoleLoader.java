/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.ehm.loader;

import com.kingland.ehm.buffer.BaseBuffer;

import java.util.Scanner;

/**
 * @author KSC
 * @description This extends BaseLoader to get data from console
 */
public class ConsoleLoader extends BaseLoader {
    /**
     * Constructor
     * @param buffer set the designation buffer
     */
    public ConsoleLoader(BaseBuffer buffer) {
        super(buffer);
    }

    /**
     * get the data which from scanner
     * @return list to send
     */
    @Override
    public Object getData() {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        return a;
    }
}
