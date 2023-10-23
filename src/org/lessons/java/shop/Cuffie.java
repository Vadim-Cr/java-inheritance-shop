package org.lessons.java.shop;

public class Cuffie extends Prodotto{
    private String color;
    private boolean isWireless=true;

    public Cuffie(String productName, String productDescription, double productPrice, String color, boolean isWireless) {
        super(productName, productDescription, productPrice);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
