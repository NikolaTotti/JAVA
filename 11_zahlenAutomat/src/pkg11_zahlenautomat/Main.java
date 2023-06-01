package pkg11_zahlenautomat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int an = 0, en = 0, wu = 0, ink = 0; // 
        int zahler = 0;
        double konto, spielanzahl;
        String nochmal;
        boolean spiel = true;
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Wie vielle geld müssten sie einzahlen: ");
        konto = eingabe.nextDouble();
        spielanzahl = konto / 1.17;
        System.out.println("Sie konnen " + (int) spielanzahl + " spilen ");
        System.out.printf("Sie haben rest geld %.2f%n", (konto - (int) spielanzahl * 1.17));
        while (konto >= 1.17 && spiel == true) {

            System.out.println("Geben Sie bitte nur positive Zahlen ein!!!!!!");
            System.out.print("Anfang: \t");
            an = eingabe.nextInt();
            if (an >= 0) {
                System.out.print("Ende: \t");
                en = eingabe.nextInt();
                if (an < en) {
                    System.out.print("Schrit: \t");
                    ink = eingabe.nextInt();

                    if (ink + an < en && ink > 0) {
                        System.out.print("Wunch: \t");
                        wu = eingabe.nextInt();

                        if (wu > an) {

                            while (an <= en) {
                                if (wu > an && wu < an + ink) {
                                    System.out.println(an);
                                    System.out.print(wu + " ist Ihre wunch zahl. Sie befindet sich nach " + (wu - an) + " sekunden");
                                    System.out.println("");
                                    an += ink;

                                } else if (an == wu) {
                                    System.out.println(an + " Ihre wunch Zahl");
                                    an += ink;
                                } else {

                                    System.out.println(an);
                                    an += ink;
                                }
                            }

                        } else {
                            System.out.println("Wunch ist kleiner als anfang");
                        }

                    } else {
                        System.out.println("Schrit ist zu groß oder schrit ist gleich 0");
                    }
                } else {
                    System.out.println("Ende kann nicht gleich oder kleiner als anfang");
                }
            } else {
                System.out.println("Anfang muss großer als 0 sein");
            }
            zahler++;
            konto = konto - 1.17;
            System.out.print("\u001B[34mMochten Sie weiter spielen: (Ja/Nein)\u001B[0m \t");
            nochmal = eingabe.next();
            switch (nochmal.toLowerCase()) {
                case "ja":
                    spiel = true;
                    break;
                case "nein":
                    spiel = false;

                    break;
                default:
                    System.out.println("Ungültige eingabe");
            }
        }
        if (konto < 1.17) {
            System.out.println("Sie haben nicht genug geld");
            System.out.printf("Sie habe noch %.2f%n", konto);
            System.out.println("Sie habe " + zahler + " mal gespielt");
        } else {
            System.out.printf("Sie habe noch %.2f%n", konto);
            System.out.println("Sie habe " + zahler + " mal gespielt");
        }
    }
}
