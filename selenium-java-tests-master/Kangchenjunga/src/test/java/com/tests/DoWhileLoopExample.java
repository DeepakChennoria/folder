package com.tests;

/**
 * Created by dpk on 5/26/2016.
 */
public class DoWhileLoopExample {
    public static void main(String args[]){
        int i=10;
        do{
            System.out.println(i);
            i--;
        }while(i>10);

        while(i>10){
            System.out.println(i);
            i--;
        }
    }
}
