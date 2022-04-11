package com.itfactory.tema4;
import java.util.Scanner;
public class temanr1 {
/** Sa se creeze un program prin care se citeste de la tastatura un user si o parola. In prealabil, acestea trebuie sa
 * mimeze autentificarea unui user intr-un sistem.
 * Daca userul si parola sunt aceleasi cu cele prestabilite, afisati un mesaj de tipul: "Userul {user} s-a autentificat
 * in aplicatie." (Unde {user} este userul introdus).
 * In cazul in care cel putin una din valorile citite (user sau parola) nu este egala cu valoarea prestabilita,
 * se afiseaza mesajul "Credentiale gresite".
 * Aspecte:
 * 1. Pentru userul si parola prestabilite se definesc 2 stringuri in program.
 * 2. Cand se citeste de la tastatura, textul citit va fi intampinat de un mesaj similar: "Introduceti userul: " /
 * "Introduceti parola: "
 */
        public static void main(String[] args)
        {
            String user, pass;
            user = "Dana";
            pass = "Rotariu";
            Scanner scanner = new Scanner(System.in);
            boolean este1, este2;
            do {
               System.out.print("Introduceti userul: ");
               String user1 = scanner.nextLine();
               System.out.print("Introduceti parola: ");
               String pass1 = scanner.nextLine();
                este1 = user.equalsIgnoreCase(user1);
                este2 = pass.equalsIgnoreCase(pass1);
                if (este1 && este2)
                {
                    System.out.print("Userul " + user1 + " s-a autentificat in aplicatie.");
                    break;
                }else{
                    System.out.println("Credentiale gresite");
                }

            }while (!(este1 && este2));

        }
}
