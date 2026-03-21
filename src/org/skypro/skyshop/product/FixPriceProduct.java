package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 150 ;

   public static int countFixPriceProduct = 0;


    public FixPriceProduct(String name) {
        super(name);
        countFixPriceProduct++;
    }

    @Override
    public int getPrice() {
        return FIXED_PRICE ;
    }

    @Override
    public String toString() {
        return super.getName() + " : " + FIXED_PRICE ;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
