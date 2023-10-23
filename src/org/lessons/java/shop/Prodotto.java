package org.lessons.java.shop;

import java.security.PublicKey;
import java.util.Random;

public class Prodotto {
// Attributi
    private int productCode;
    private  String productName;
    private String productDescription;
    private double productPrice;
    private double productVat;

//    COSTRUTTORE

public Prodotto(String productName, String productDescription, double productPrice) {
    this.productCode= new Random().nextInt(10000);  // Genera un numero random per il codice;
    this.productName= productName;
    this.productDescription= productDescription;
    this.productPrice= productPrice;
    this.productVat = 0.22; //IVA predefinita
    }

//    Il codice prodotto sia accessibile solo in lettura, il suo Getter
public int getProductCode (){
    return productCode;
}
// getter e setter per il nome
    public String getProductName (){
        return productName;
    }

    public void setProductName (String productName){
        this.productName = productName;
    }
// getter e setter per la descrizione
    public String getProductDescription (){
        return productDescription;
    }

    public void setProductDescription (String productDescription){
        this.productDescription = productDescription;
    }
// getter e setter per il prezzo
    public double getProductPrice (){
        return productPrice;
    }

    public void setProductPrice (double productPrice){
        this.productPrice = productPrice;
    }


//  Metodo per avere il prezzo Ivato
    public double vatPrice(){
    return productPrice + (productPrice*productVat);
    }
//  Metodo per avere il nome esteso, codice concatenato con nome
    public String fullProductName() {
    return productCode + "-" + productName;
    }
}
