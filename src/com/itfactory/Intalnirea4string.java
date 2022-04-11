package com.itfactory;
import java.util.Scanner;
public class Intalnirea4string {
    public static void main (String[] args){

       // String numecomplet = "Daniela-Paula Rotariu";
        //int lungimenume = numecomplet.length();
        //System.out.println(lungimenume);

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
