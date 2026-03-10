package org.skypro.skyshop.product;
import org.skypro.skyshop.basket.ProductBasket;
public class Product {
    private final String name;
    private final int  price;

    public Product( String name,int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public String getName() {
        return name;
    }






}
