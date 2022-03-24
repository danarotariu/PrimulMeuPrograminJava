package com.itfactory;

import java.util.Scanner;

public class Intalnirea2 {
    public static void main(String[] args) {
        // termen1 si termen2 este de tip integer
        int termen1 = 5;
        int termen2 = -10;
        int suma = termen1 + termen2;
        System.out.println ("Suma este " + suma);
        long longVar = 125789632145663L;
        float floatVariable = 12.35589f;
        double doubleVar = 12.35589;
        double nr1 = 5;
        double nr2= 2;
        double impartire = nr1 / nr2;
        System.out.println ("Rezultatul este " + impartire);
        boolean booleantrue = true;
        boolean booleanfalse = false;
        char charVar = 'C';
        System.out.println ((int)charVar);
        int intPrimitive = 5;
        Integer intObj = 5;
        Scanner scanner = new Scanner(System.in);
        int nrdelaTastatura = Integer.parseInt(scanner.nextLine());
        Scanner scanner1 = new Scanner(System.in);
        double nrdelaTastatura1 = Double.parseDouble(scanner1.nextLine());
    }
}
