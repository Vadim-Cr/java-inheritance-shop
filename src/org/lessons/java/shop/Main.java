package org.lessons.java.shop;

public class Main {
  public static void main(String[] args) {

      Prodotto prodotto1 = new Prodotto("Primo",
              "Questo è il primo prodotto", 17);
      Prodotto prodotto2 = new Prodotto("Secondo",
              "Questo è il secondo prodotto", 18);
      Prodotto prodotto3 = new Prodotto("Terzo",
              "Questo è il terzo prodotto", 19);

   System.out.println("il tuo prodotto è: " + prodotto1.fullProductName() +
           " e il suo prezzo senza iva è: " + prodotto1.getProductPrice() +
           " mentre con IVA è: " + String.format("%.2f", prodotto1.vatPrice()));

  System.out.println("il tuo prodotto è: " + prodotto2.fullProductName() +
           " e il suo prezzo senza iva è: " + prodotto2.getProductPrice() +
           " mentre con IVA è: " + String.format("%.2f", prodotto2.vatPrice()));

  System.out.println("il tuo prodotto è: " + prodotto3.fullProductName() +
           " e il suo prezzo senza iva è: " + prodotto3.getProductPrice() +
           " mentre con IVA è: " + String.format("%.2f", prodotto3.vatPrice()));
  }
 }
