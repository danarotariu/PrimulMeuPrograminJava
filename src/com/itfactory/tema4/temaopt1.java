package com.itfactory.tema4;
import java.util.Scanner;
public class temaopt1 {
    /**1. Creati un program prin care, avand un text introdus la tastatura, sa se numere cate caractere mici are textul
     * si cate caractere mari are acel text. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti textul: ");
        String textuldat = scanner.nextLine();
        int upperCase = 0;
        int lowerCase = 0;
        char[] caracter = textuldat.toCharArray();
        for(char caracter1 : caracter) {
            if(caracter1 >='A' && caracter1 <='Z') {
                upperCase++;
            } else if (caracter1 >= 'a' && caracter1 <= 'z') {
                lowerCase++;
            } else {
                continue;
            }
        }
        System.out.println("Numarul caracterelor mici este " + lowerCase + " si numarul caracterelor mari este " + upperCase);
    }
}
