package com.rkv.programs;

public class STR {

    public  String reverseStrBRM(String input){
        String output = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            output = output+ input.charAt(i);
        }
        return  output;
    }
    public  String reverseStrbuffer(String input){
        StringBuffer str = new StringBuffer(input);
        return  str.reverse().toString();
    }

    public  String reverseStrbuilder(String input){
        StringBuilder str = new StringBuilder(input);
        return  str.reverse().toString();
    }


    public static void main(String[] args) {
        STR s = new STR();
        System.out.println(s.reverseStrBRM("abc"));
        System.out.println(s.reverseStrbuffer("abc"));
        System.out.println(s.reverseStrbuilder("abc"));

        String i =  "This is text";
        String[] a = i.split(" ");
        System.out.println(a);
    }
}
