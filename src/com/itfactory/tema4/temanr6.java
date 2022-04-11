package com.itfactory.tema4;
import java.util.Scanner;
public class temanr6 {
   /**    Se da urmatorul text:
            "Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook."
    Sa se scrie un program prin care sa se corecteze textul si sa se inlocuiasca cuvintele gresite:
    Aspecte:
            1. "NumePrenume" - se va inlocui cu numele cursantului.
            2. "testare" - se va inlocui cu tipul de curs la care participati.
            3. "facebook" - se va inlocui cu numele companiei unde participati la curs.
    */

   public static void main (String[] args){


            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti numele: ");
            String nume = scanner.nextLine();
            if (nume.length()<=25) {
                System.out.println("Persoana cu numele " + nume + " se incadreaza la dosar");
            }else{
                System.out.println("Persoana cu numele " + nume + " nu se incadreaza la dosar");

            }
        }

}
