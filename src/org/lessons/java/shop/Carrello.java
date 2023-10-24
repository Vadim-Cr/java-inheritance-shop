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
            System.out.println("Hai scelto di inserire un Smartphone, dimmi il nome:");
            String nomeSmartphone = scan.nextLine();
            System.out.println("ora inserisici una descrizione:");
            String descrizioneSmartphone = scan.nextLine();
            System.out.println("ora inserisici un prezzo:");
            Double prezzoSmartphone =Double.parseDouble(scan.nextLine());
            System.out.println("ora inserisici una memoria:");
            String memoriaSmartphone = scan.nextLine();

            Smartphone sony = new Smartphone(nomeSmartphone,
                    descrizioneSmartphone,prezzoSmartphone, memoriaSmartphone);
            break;
        case "televisore":
            System.out.println("Hai scelto di inserire una Televisione, dimmi il nome:");
            String nomeTV = scan.nextLine();
            System.out.println("ora inserisici una descrizione:");
            String descrizioneTV = scan.nextLine();
            System.out.println("ora inserisici un prezzo:");
            Double prezzoTV =Double.parseDouble(scan.nextLine());
            System.out.println("ora inserisici una dimensione:");
            Double dimensioniTV =Double.parseDouble(scan.nextLine());
            System.out.println("lo vuoi Smart? (true se sì, false se no)");
            Boolean smartTv =scan.nextBoolean();

            Televisore LG = new Televisore (nomeTV,
                    descrizioneTV,prezzoTV, dimensioniTV, smartTv);
            break;
        case "cuffie":
            System.out.println("Hai scelto di inserire delle cuffie, dimmi il nome:");
            String nomeAudio = scan.nextLine();
            System.out.println("ora inserisici una descrizione:");
            String descrizioneAudio = scan.nextLine();
            System.out.println("ora inserisici un prezzo:");
            Double prezzoAudio =Double.parseDouble(scan.nextLine());
            System.out.println("ora inserisici un colore:");
            String colorAudio = scan.nextLine();
            System.out.println("lo vuoi Smart? (true se sì, false se no)");
            Boolean wirelessAudio =scan.nextBoolean();

            Cuffie buzz = new Cuffie (nomeAudio,
                    descrizioneAudio,prezzoAudio, colorAudio, wirelessAudio);
            break;
        default:
            System.out.println("Scelta non valida, riprova!.");
    }

        scan.close();
    }
}
