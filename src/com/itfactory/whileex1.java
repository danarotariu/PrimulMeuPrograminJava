package com.itfactory;

import java.util.Scanner;

public class whileex1 {
        /**
         * Sa se citeasca de la tastatura numere pana la introducerea numarului 0.
         * Se cere sa se foloseasca bucla while.
         */
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu numarul: ");
            int x = scanner.nextInt();
            while(x!=0 ) {
                System.out.println("Am citit: " + x);
                System.out.print("Introdu numarul: ");
                x = scanner.nextInt();
            }
            System.out.println("S-a introdus numarul 0. Ies din bucla");
        }
    }

