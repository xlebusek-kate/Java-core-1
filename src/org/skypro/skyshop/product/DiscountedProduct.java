package org.skypro.skyshop.product;

public class DiscountedProduct {
    String name;
    int price;
    int discount ;

    public DiscountedProduct(String name, int price, int discount ) {
        chekIndex(discount );
        chekPrice(price);
        this.name = name;
        this.price = price;
        this.discount  = discount ;
    }
    public void chekPrice(int price){
        if (price <= 0) throw new IllegalArgumentException("ошибка в цене странного");
    }
    public void chekIndex(int discount ){
        if(discount   < 0 || discount  > 100) throw new IllegalArgumentException("ошибка в процентах");
    }

}
