package com.itfactory.tema4;

public class temanr7 {
    /** Se da urmatorul text:
     "avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina"
     Scrieti un program prin care sa se inlcouiasca primele 5 instante ale cuvantului "avion" cu cuvantul "racheta"
     si primele 3 instante ale cuvantului "masina" cu cuvantul "autobuz" din textul dat.
     Aspecte.
     2. Output: racheta racheta racheta racheta racheta avion avion avion , autobuz autobuz autobuz masina masina masina masina
     */
    public static void main(String[] args) {
        String mesaj = "avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina";
        String replacemesage1= mesaj.replaceFirst("avion avion avion avion avion","racheta racheta racheta racheta racheta");
        String replacemesage2= replacemesage1.replaceFirst("masina masina masina","autobuz autobuz autobuz");
        System.out.println(replacemesage2);
    }
}
