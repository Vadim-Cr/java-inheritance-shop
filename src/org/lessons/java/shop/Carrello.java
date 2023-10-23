package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("che prodotto vuoi comprare? (smartphone/televisore/cuffie)");
        String tipoProdotto = scan.nextLine();
//      METODO SWITCH
    switch (tipoProdotto){
        case "smartphone":
            System.out.println("Hai scelto Smartphone, dimmi il nome:");
            String tipoProdotto = scan.nextLine();
            Smartphone sony = new Smartphone("sony", "sony experia",566.00, "128 Gb");
            break;
        case "televisore":
            System.out.println("Hai scelto Televisore.");
            break;
        case "cuffie":
            System.out.println("Hai scelto cuffie.");
            break;
        default:
            System.out.println("Scelta non valida, riprova!.");
    }


        scan.close();
    }
}
