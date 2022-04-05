package com.itfactory;
import java.util.Scanner;
public class tema3opt3 {
    /**3. Scrieti un program in care creati o consola interactiva prin care userul poate sa
     *  aleaga optiuni de la 1 la 3. La start-ul programului, va trebui sa apara un mesaj cu optiunile
     *  posibile.
    * a) Pentru optiunea 1, userul va trebui sa introduca un numar de la 1 la 10. Daca numarul
     * nu este in acest interval se va afisa un mesaj de eroare.
    * b) Pentru optiunea 2 userul va trebui sa introduca doua numere intregi si se va afisa
     * suma acestora
    * c) Pentru optiunea 3 userul va trebui sa introduca un numar intreg pozitiv (se va face verificarea)
     iar pe baza acestuia se vor afisa toate numerele de la 0 pana la acesta.
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o optiune cu valoarea intre 1 si 3: ");
        int x = scanner.nextInt();
        int y;
        switch (x) {
            case 1:
                System.out.println("Introdu o valoare intre 1 si 10");
                y = scanner.nextInt();
                if ((y < 1) || (y > 10)) {
                    System.out.println("eroare");
                }
                break;
            case 2:
                System.out.println("Introdu primul numar: ");
                y = scanner.nextInt();
                System.out.println("Introdu al doilea numar: ");
                int z = scanner.nextInt();
                int sum = y + z;
                System.out.println("Suma celor doua numere este: " + sum);
            break;
            case 3:
                System.out.println("Introdu un numar intreg pozitiv: ");
                y = scanner.nextInt();
                if (y > 0) {
                    int i;
                    for (i = 0; i <= y; i++) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println("Numarul introdus nu este pozitiv");
                }
            break;
        }

    }
}
