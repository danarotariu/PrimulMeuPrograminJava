package com.itfactory;

import java.util.Random;

public class ifcondex3 {
        /**
         Vreau sa verific daca un numar este intre 1 si 25, intre 25 si 50, intre 50 si 75 sau intre 75 si 100
         1.....25......50......75.....100 ?
         */

        public static void main(String[] args) {
            Random random = new Random();
            int randomInt = random.nextInt(100);

            if(randomInt >= 50) {
                if (randomInt >= 75) {
                    System.out.println("Numarul " + randomInt + " este intre 75 si 100");
                } else {
                    System.out.println("Numarul " + randomInt + " este intre 50 si 75");
                }
            } else {
                if (randomInt <= 25) {
                    System.out.println("Numarul " + randomInt + " este intre 1 si 25");
                } else {
                    System.out.println("Numarul " + randomInt + " este intre 25 si 50");
                }
            }

        }
}
