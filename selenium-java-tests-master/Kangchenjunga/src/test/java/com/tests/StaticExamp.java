package com.tests;

/**
 * Created by dpk on 5/21/2016.
 */
public class StaticExamp {
    static int a = 5;
    static int b=6;

    static void setValMeth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialized.");
        b = a * 5;
    }

    public static void main(String args[]) {
        setValMeth(50);
    }
}
