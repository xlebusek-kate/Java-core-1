package org.skypro.skyshop.product;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Shop.Searchable;

public class Product implements Searchable {
    private final String name;
    private final int price;

    public Product(String name, int price)  {
            chekPrice(price);
            chekName(name);
            this.name = name;
            this.price = price;

    }

    public void chekName(String name) throws  IllegalArgumentException{
        if (name == null || name.isBlank()) throw new IllegalArgumentException("ошибка в имени продукта");
    }
    public void chekPrice(int price){
        if (price <= 0) throw new IllegalArgumentException("ошибка в цене продукта");
    }

    public int getPrice() {
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
