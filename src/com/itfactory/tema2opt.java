package com.itfactory;

/* Probleme optionale.
 * 1. Creati un proiect in Java in care sa aveti urmatorul pachet default: "com.itfactory".
 * Sa se creeze o clasa (numele il veti alege voi) in care sa aveti o metoda main.
 * Cerinta este sa cititi doua numere de la tastatura si sa afisati restul impartirii lor.
 * Exemplu: Daca citim 10 si 3, restul impartirii lui 10 la 3 va fi 1. (Puteti sa va uitati peste impartirea cu rest pentru a intelege restul impartirii).


 2. Extindeti problema 1 prin a afisa inmultirea celor doua numere si impartirea (cu virgula) a celor doua numere.
 */
import java.util.Scanner;

public class tema2opt {
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Introdu deimpartitul ");
        double nr1 = Integer.parseInt(scanner1.nextLine());

        System.out.println("Introdu impartitorul: ");
        double nr2 = Integer.parseInt(scanner2.nextLine());

        double Impartire = nr1 / nr2;
        System.out.println("Rezultatul impartirii este: " + Impartire);

        double restImpartire = nr1 % nr2;
        System.out.println("Restul impartirii este: " + restImpartire);
    }
}
