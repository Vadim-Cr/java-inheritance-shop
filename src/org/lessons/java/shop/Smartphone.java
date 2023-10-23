package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {

    private int codeIMEI;
    private String phoneMemory;


    public Smartphone(String productName, String productDescription, double productPrice, String phoneMemory) {
        super(productName, productDescription, productPrice);
        this.codeIMEI = new Random().nextInt(1000000000);
        this.phoneMemory = phoneMemory;
    }

    public int getCodeIMEI(){
        return codeIMEI;
    }

    public String getPhoneMemory(){
        return phoneMemory;
    }

    public void setPhoneMemory(String phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

}
