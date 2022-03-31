package com.itfactory;

import java.util.Random;

public class Intalnirea3 {
    public static void main(String[] args) {
        /* Random random = new Random();
        int randomInt = random.nextInt(100);

         if(randomInt < 50) {
            if(randomInt < 25) {
                System.out.println("Numarul " + randomInt + " este mai mic decat 25");
            } else {
                System.out.println("Numarul " + randomInt + " este intre 25 si 50");
            }
        } else {
            if (randomInt < 75) {
                System.out.println("Numarul  " + randomInt + " este intre 50 si 75");
            } else  {
                System.out.println("Numarul " + randomInt + " este intre 75 si 99");
            }
        } */
        /* int x = 0;
        while (x<=100){
                System.out.println(x);
                x++;
               do.. while(condition) executa cel putin o data comanda
        } */

       /* for(int i = 0; i<=100; i++)
        {
            System.out.println(i);
        }*/
        Random random = new Random();
        int limitaInferioara = 0;
        int limitaSuperioara = 15;

        for(int i = limitaInferioara; i < limitaSuperioara; i++)
        {
            int x = random.nextInt(limitaSuperioara + 1);
            if (i == x)
            {
                System.out.println("S-a facut un match: " + i + " : " + x);
            }
        }
    }
}
