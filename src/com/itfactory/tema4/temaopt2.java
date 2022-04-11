package com.itfactory.tema4;

import java.util.Scanner;

public class temaopt2 {
    /** 2. Se citesc doua variabile de tip String de la tastatura, din care unul va reprezenta un text oarecare,
     *  iar cel de al doilea reprezinta un keyword care se va cauta in text.
     *      Se cere sa se numere de cate ori apare keyword-ul in textul respectiv.
     */
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti textul: ");
        String nume = scanner.nextLine();
        System.out.print("Introduceti keyword: ");
        String textDeCautat = scanner.nextLine();
        int i = 0;
        //for (i=0;i<= nume.length();i++){
            //if (nume.contains(textDeCautat)){
                //System.out.println(i);
               // i++;
           // }
            //.out.println(i);
       // }
        while (nume.contains(textDeCautat)){
            i = i+1;
            System.out.println(i);
        }
    }
}

