package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private int fixPrice;

   public static int countFixPriceProduct = 0;


    public FixPriceProduct(String name , int fixPrice) {
        super(name);
        this.fixPrice = fixPrice;
        countFixPriceProduct++;
    }

    @Override
    public int getPrice() {
        return fixPrice;
    }

    @Override
    public String toString() {
        return super.getName() + " : " + fixPrice;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
