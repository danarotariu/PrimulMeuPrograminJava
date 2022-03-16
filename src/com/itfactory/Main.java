package com.itfactory;

import java.util.Scanner;

class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Cum te numesti? ");
        String nume = scanner.nextLine();
        System.out.println ("Bun venit, "+ nume );
   }
}
