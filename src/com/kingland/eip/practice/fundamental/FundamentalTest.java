/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.practice.fundamental;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Four exercises with the Java foundation
 */
public class FundamentalTest {
    public static void main(String args[]) {
        //Print "Hello World".
        System.out.println("hello world");
        //Set the number of stars and print.
        final int num = 10;
        String star = "*";
        for (int i = 0; i < num; i++) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(star);
            }
            System.out.println();
        }
        //Print the current date and time below the pattern.
        System.out.println("localTime: " + LocalDate.now() + " " + LocalTime.now());
        //Set the initial month to October.
        printMonth(10);
        //Returns the length of "Good Morning" to determine if the length is even.
        String str = "Good Morning";
        int length = stringMethod(str);
        if (length % 2 == 0)
            System.out.println(length);
        else
            System.out.println("String is odd");
    }

    /**
     * An abbreviation for the corresponding month printed in different months.
     *
     * @param num month
     */
    public static void printMonth(int num) {
        switch (num) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            default:
                System.out.println("Dec");
                break;
        }
    }

    /**
     * Split the string and determine if its length is odd or even.
     *
     * @param str string
     * @return String length
     */
    public static int stringMethod(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.contains(" ") || str.startsWith("G")) {
                String[] strArray = str.split(" ");
                for (String item : strArray) {
                    System.out.println(item);
                }
            }
            return str.length();
        }
        return -1;
    }
}
