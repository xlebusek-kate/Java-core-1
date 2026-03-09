package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static class Main {
        public static void main(String[] args) {
            Product product1 = new Product("Яблоко" , 100);
            Product product2 = new Product("Апельсин", 90);
            Product product3 = new Product("Манго", 50);
            Product product4 = new Product("Малина", 300);
            Product product5 = new Product("Кукуруза", 150);
            Product product6 = new Product("Банан", 200);
            ProductBasket productBasket = new ProductBasket();
            productBasket.fillingProductBasket(product1);
            productBasket.fillingProductBasket(product2);
            productBasket.fillingProductBasket(product3);
            productBasket.fillingProductBasket(product4);
            productBasket.fillingProductBasket(product5);
            productBasket.fillingProductBasket(product6);

            productBasket.toPrintAllProducts();

            productBasket.getSumOfProductBasket();

            productBasket.foundProduct("Кукуруза");

            productBasket.foundProduct("Банан");

            productBasket.clearArrays();

            productBasket.toPrintAllProducts();

            productBasket.getSumOfProductBasket();

            productBasket.foundProduct("Кукуруза");



        }
    }
}
