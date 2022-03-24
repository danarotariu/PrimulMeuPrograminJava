package com.itfactory;

import java.util.Scanner;

/***
 * Creati un program simplu in care sa calculati si sa afisati aria unui dreptunghi.
 * Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Aria dreptunghiului este: " + arieDreptunghi);
 *
 * Ce este aria unui dreptunghi?
 *** Este produsul lungimii si al latimii
 */
public class Primitive6
{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Introdu lungimea dreptunghiului: ");
        int lungimea = Integer.parseInt(scanner1.nextLine());

        System.out.println("Introdu latimea dreptunghiului: ");
        int latimea = Integer.parseInt(scanner2.nextLine());

       int arieDreptunghi =lungimea * latimea;

        System.out.println("Perimetrul triunghiului este: " + arieDreptunghi);
    }
}
