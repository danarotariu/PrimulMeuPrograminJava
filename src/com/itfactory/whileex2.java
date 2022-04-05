package com.itfactory;
import java.util.Random;

public class whileex2 {
           /**
         * Se se genereze numere intr-o bucla, intre 0 si 100 pana cand numarul este mai mic decat 50
         */
        public static void main(String[] args)
        {
            Random random = new Random();
            int x = random.nextInt(100+1);
            //System.out.println("Numarul generat este: " + x);
            //int x=0;
            while (x < 50) {
                System.out.println("Numarul generat este: " + x);
                x = random.nextInt(100 + 1);
            }
        }

}
