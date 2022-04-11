package com.itfactory.tema4;
import java.util.Scanner;
public class temanr3 {
  /**  Sa se creeze un program in care se calculeaza pretul unei cantitati de produse. Pentru aceasta se vor citi urmatoarele
3 variabile: numele produsului, pretul produsului si cantitatea.
    Se cere ca in functie de datele introduse sa se calculeze pretul final. Se va afisa un mesaj similar: "Pentru produsele
    de tip {nume produs} si cantitatea {cantitate} , pretul este de {pret calculat}";
    Aspecte:
   1. "Cumpar atatea produse cu numele pe care il citesc si calculez pretul total"
            ------------------------------------------------------------------------------------------------------------------------------------------
*/
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti numele produsului: ");
            String numep = scanner.nextLine();
            System.out.print("Introduceti pretul produsului: ");
            int pretp = Integer.parseInt(scanner.nextLine());
            System.out.print("Introduceti cantitatea produsului: ");
            int cantitatep = Integer.parseInt(scanner.nextLine());
            int pretCalculat= pretp * cantitatep;
            System.out.print("Pentru produsele de tip " + numep + " si cantitatea " + cantitatep + " , pretul este de " + pretCalculat);
        }
}

