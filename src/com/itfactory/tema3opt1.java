package com.itfactory;
import java.util.Scanner;
public class tema3opt1 {

    /** 1. Scrieti un program in care, folosind o bucla (? decideti voi care)
    o sa cititi de la tastatura numere intregi pana la intalnirea unui numar divizibil cu 7.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
         do {
             System.out.println("introduceti numarul: ");
             x = scanner.nextInt();
             y = x % 7;
             System.out.println("Restul este: " + y);
         } while (!(y == 0));

        System.out.println("Numarul " + x + " este divizibil cu 7");
    }
}
