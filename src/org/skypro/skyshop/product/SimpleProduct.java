package org.skypro.skyshop.product;

public class SimpleProduct {
    String name;
    int price;

    public SimpleProduct(String name, int price) {
        chekPrice(price);
        this.name = name;
        this.price = price;
    }
    public void chekPrice(int price){
        if (price <= 0) throw new IllegalArgumentException("ошибка в цене простого ");
    }
}

