package com.example.demoasdasdqw.test;



public class jhgdskaf {

    public static void main(String[] args) {

        String hello="hello";

        String aklsjh = aklsjhd(hello);
        System.out.println(aklsjh);//olleh

    }

    public static String aklsjhd(String hello){

        if (hello==null||hello.length()<=1){
            return hello;
        }

        return aklsjhd(hello.substring(1))+hello.charAt(0);
    }

}
