package com.itfactory;

public class tema3opt2 {
   /** 2. Scrieti un program in care afisati toate numerele intregi de la -100 la 100,
    mai putin cele divizibile cu 2 sau cu 3.
    */
   public static void main(String[] args) {
       int i;
       for  (i=-100; i <= 100; i++) {
           int y = i % 2;
           int z = i % 3;
           if (!(y == 0) && !(z == 0)) {
               System.out.println(i);
           }

       }
   }
}
