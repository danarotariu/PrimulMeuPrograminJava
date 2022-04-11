package com.itfactory.tema4;
import java.util.Scanner;
public class temanr4 {
   /** Problema 4.
    Sa se creeze un program in care se va citi de la tastatura siruri de caractere pana cand introduc textul "stop";
    Aspecte.
1. Se va folosi bucla "while"
    Simulare:
    Introduceti textul: masina
    Introduceti textul: avion
    Introduceti textul: stop
    Am iesit din program.
            ------------------------------------------------------------------------------------------------------------------------------------------
*/
   public static void main (String[] args)
   {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Introduceti textul: ");
           String nume = scanner.nextLine();
           while (!(nume.equalsIgnoreCase("stop"))) {
               System.out.print("Introduceti textul: ");
               nume = scanner.nextLine();
           }
           System.out.println("Am iesit din program.");
   }
}
