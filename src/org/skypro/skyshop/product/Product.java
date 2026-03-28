package org.skypro.skyshop.product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Shop.Searchable;

public class Product implements Searchable {
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

    @Override
    public String getSearchTerm() {
        return this.name;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getStringRepresentation() {
        return Searchable.super.getStringRepresentation();
    }
}
