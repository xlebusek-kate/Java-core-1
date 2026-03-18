package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
     private int discountedPrice;

     public static int countDiscountedProduct = 0;
    public DiscountedProduct(String name, int discountedPrice, int sale) {
        super(name);
        this.discountedPrice = discountedPrice;
        this.sale = sale;
        countDiscountedProduct++;
    }

    private final int sale;

    @Override
    public int getPrice() {
        return this.discountedPrice * (100 - this.sale) / 100;
    }

    @Override
    public String toString() {
        return super.getName() +" : "+  discountedPrice + "(" + sale + "%)";
    }
    @Override
    public boolean isSpecial() {
        return true;
    }
}
