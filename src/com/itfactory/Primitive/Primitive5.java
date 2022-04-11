package com.itfactory.Primitive;

import java.util.Scanner;
/***
 * Creati un program simplu in care sa calculati si sa afisati perimetrul unui triunghi
 *  Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);
 *
 * Ce este perimetrul unui triunghi?
 *** Este suma lungimilor laturilor
 */
public class Primitive5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introdu latura 1: ");
        int latura1 = Integer.parseInt(scanner1.nextLine());

        System.out.println("Introdu latura 2: ");
        int latura2 = Integer.parseInt(scanner2.nextLine());

        System.out.println("Introdu latura 3: ");
        int latura3 = Integer.parseInt(scanner3.nextLine());

        int perimetruTriunghi = latura1 + latura2 + latura3;

        System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);
    }
}