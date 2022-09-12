package com.rkv.programs.sep13;

import java.sql.SQLOutput;

public class Ssep13 {

    public static void rev1(String input){
        String rev = "";
        System.out.println("Original input is"+input);
        for (int i = input.length()-1; i >=0 ; i--) {
            rev = rev + input.charAt(i);
        }
        System.out.println("Reverse is "+rev);
    }

    public static void rev2(String s){
        System.out.println("Input is : "+s);
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        System.out.println("reversed : "+str);
    }

    public static void rev3(String inp){
        System.out.println("Input is : "+inp);
        StringBuilder strb = new StringBuilder(inp);
        strb.reverse();
        System.out.println("reversed is : "+strb);
    }

}
