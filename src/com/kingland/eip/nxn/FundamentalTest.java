package com.kingland.eip.nxn;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Print "Hello World".
 */

public class FundamentalTest {
    public static void main(String args[]) {
        System.out.println("hello world");
    }

    /**
     * Print the pattern below
     */

    public static class Pattern{
        public static void main(String args[]) {
            String str = new String();
            str = "**********";
            for(int i = str.length() - 1; i >= 0; i--){
                System.out.println(str);
                str = str.substring(0,i);
            }
            }
            }

    /**
     * Print the current date and time
     */
    static class TeLocalDate {

        public static void main(String[] args) {
            //Date, get year month day
            LocalDate ld = LocalDate.now();
            System.out.println(ld);

            //Time, gain time
            LocalTime lt = LocalTime.now();
            System.out.println(lt); //获得当前时间
        }
    }

    /**
     * Output the abbreviation for the corresponding month
     */
    static class Month {
    public static final int Month = 10;
    public static final String[] MonthName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void main(String[] args) {
        System.out.println(MonthName[Month - 1]);
    }
}

    /**
     * Determine if it is even and print
     */
    static class Method{
    public static void main(String[] args){
        String str = "Good Morning";
        int len = length(str);
        if (len % 2 == 0) {
            System.out.println(len);
        }
        else if(len%2==1){
            System.out.println("String is jishu!");
        }
    }



        public static int length(String s){
            if(s.indexOf(" ")!=-1&&"G".equals(s.substring(0,1))){
                String[] newStr = s.split(" ");
                for (String string : newStr) {
                    System.out.println(string);
                }
            }
            return s.length();

    }
}
}












