package com.itfactory.dowhileloop;

import java.util.Scanner;

public class dowhileex1 {

        /**
         * Se se implementeze un program in care se citeste un numar de la tastatura pana la introducerea numarului 0.
         * Fiecare numar citit se va afisa sub forma: S-a citit numarul <x>
         *
         */
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            do {
                x = scanner.nextInt();
                System.out.println("S-a citit numarul " + x);
            } while (x == 0);

        }

}
