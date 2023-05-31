package com.mycompany.xx_rabatt;
import java.util.Scanner;
/**
 *
 * @author NikolaGjoshev
 */
public class Xx_rabatt {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Gib erste nummer ein: ");
        float umsatz = myObj.nextFloat();
        float rechnungsbetrag;
        int rabatt;

        if (umsatz > 100) {
            if (umsatz > 500) {
                rabatt = 10;
            } else {
                rabatt = 5;
            }
        } else {
            rabatt = 0;
        }

        System.out.println("Rabatt ist " + rabatt + "%");

        float rb = umsatz / 100 * rabatt;
        rechnungsbetrag = umsatz - rb;
        System.out.println("Rechnung ist " + rechnungsbetrag + "€");
    }
}
