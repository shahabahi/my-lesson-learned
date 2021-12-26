package com.api;

public class Babak {
    private static String babak1;
    private static void babakMethod(Babak babak){
        babak.babak1="Hi Babak";
        System.out.println(babak1);
    }

    public static void main(String[] args) {
        babakMethod(new Babak());
    }
}
