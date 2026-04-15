package org.skypro.skyshop.product;


public class SimpleProduct extends Product {
    private int simplePrice;

    public SimpleProduct(String name, int simplePrice) {
        super(name);
        this.simplePrice = simplePrice;
    }

    @Override
    public int getPrice(){
        return this.simplePrice;
    }

    @Override
    public  String toString() {
        return super.getName() +" : "+ simplePrice;
    }

    @Override
    public boolean isSpecial() {
       return false;
    }

}

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


