package com.mycompany.xx01_veruruecktelogik;

import java.util.Scanner;

public class Xx01_verurueckteLogik {

    public static void main(String[] args) {
        int zahl;
        char buchstabel;
        String text;
        String alien;
        Scanner abfrage = new Scanner(System.in);
        System.out.print("Bitte giben Sie eine verrückten Zahl ein: ");
        zahl = abfrage.nextInt();
        System.out.print("Bitte geben Sie ein verrückte Buchstabel ein: ");
        buchstabel = abfrage.next().charAt(0);
        text = abfrage.nextLine();
        System.out.print("Bitte geben Sie ein verrückte Text ein: ");
        text = abfrage.nextLine();
        System.out.print("Glaubst du ob Aliens existieren (J/N) :");
        alien = abfrage.nextLine();
        if (alien.equals("Ja") || alien.equals("Nein")) {
        } else {
            System.out.println("Falsch!!!!");
        }
        if (zahl > 10 && buchstabel == 'A') {
            System.out.println("Wow, du hast eine große Zahl und den Buchstaben A gewählt. Das ist verrückt!!!");
        } else if (zahl < 0 || buchstabel == 'B') {
            System.out.println("Eine negative Zahl oder der Buchstabe B? Das ist verrückt!!!");
        }
        if (text.equals("Hallo")) {
            System.out.println("Du hast Hallo eingegeben.Verrückt!!!");
        } else if (text.equals("Welt")) {
            System.out.println("Du hast Welt eingegeben.Verrückt!!!");
        } else {
            System.out.println("Du hast etwas anderes eingegeben. Ziemlich verrückt!!!");
        }
        if (alien.equals("Ja")) {
            System.out.println("Sie glauben an Aliens!!!");
        } else {
            System.out.println("Sie glauben nicht in Aliens!!!");
        }
    }
}
