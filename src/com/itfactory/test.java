package com.itfactory;

import java.util.*;

public class test {
    public int sum (int a, int b) {
        return a + b;
    }
    public int dif (int a, int b) {
        return a - b;
    }
    public static void main (String [] args){
        test m = new test();
        Scanner scanner = new Scanner (System.in);
        Scanner scanner1 = new Scanner (System.in);
        int x = scanner.nextInt();
        int y = scanner1.nextInt();
        int result = m.sum(x,y);
        int result1 = m.dif(x,y);
        System.out.println("sum is " + result);
        System.out.println("dif is " + result1);
    }
}
