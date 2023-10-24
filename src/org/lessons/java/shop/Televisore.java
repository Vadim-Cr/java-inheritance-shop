package org.lessons.java.shop;

public class Televisore extends Prodotto{
    private double dimensionTv;
    private boolean smartTv=true;


    public Televisore(String productName, String productDescription, double productPrice, double dimensionTv, boolean smartTv) {
        super(productName, productDescription, productPrice);
        this.dimensionTv = dimensionTv;
        this.smartTv = smartTv;
    }

    public double getDimensionTv() {
        return dimensionTv;
    }

    public void setDimensionTv(int dimensionTv) {
        this.dimensionTv = dimensionTv;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }
}
