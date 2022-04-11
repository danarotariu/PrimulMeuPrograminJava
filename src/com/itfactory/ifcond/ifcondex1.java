package com.itfactory.ifcond;

import java.util.Scanner;

public class ifcondex1 {
    /**
     * Se citeste un numar de la tastatura. Sa se afiseze un mesaj afirmativ daca numarul este mai mare ca 10
     * In caz contrar se va afisa un mesaj negativ.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduceti un numar: ");
        int x = scanner.nextInt();
        if (x > 10) {
            System.out.println("Numarul este mai mare decat 10");
        } else {
            System.out.println("Numarul este mai mic decat 10");
        }
    }
}