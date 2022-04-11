package com.itfactory.ifcond;

import java.util.Random;

public class ifcondex2 {
      /**
         * Sa se genereze doua numere random intre 0 si 50
         * Daca suma acestor numere depaseste 70 se va afisa un mesaj "Suma <suma> mai mare decat 70"
         * Daca suma acestor numere este egala cu 70 se va afisa un mesaj "Suma <suma> egala cu 70"
         * Daca suma acestor numere este mai mica decat 70 se va afisa un "Suma <suma> mai mica decat 70"
         *
         */
        public static void main(String[] args)
        {
            Random random1 = new Random();
            int x = random1.nextInt(50);
            //Random random2 = new Random();
            int y = random1.nextInt(50);
            int suma = x + y;
            if (suma > 70)
            {
                System.out.println("Suma " + suma + " este mai mare decat 70");
            } else if (suma < 70)  {
                System.out.println("Suma " + suma + " este mai mica decat 70");
            }else {
                System.out.println("Suma " + suma + " este egala cu 70");
            }
        }
    }
