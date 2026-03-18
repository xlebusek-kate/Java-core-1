package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static class Main {
        public static void main(String[] args) {
//            Новое дз
            System.out.println("==================================");

            SimpleProduct simpleProduct1 = new SimpleProduct("Молоко", 100);
            DiscountedProduct discountedProduct1 = new DiscountedProduct("Картошка", 250, 50);
            FixPriceProduct fixPriceProduct1 = new FixPriceProduct("Сливки", 1000);
            System.out.println("==================================");

            System.out.println(simpleProduct1.isSpecial());
            System.out.println(discountedProduct1.isSpecial());
            System.out.println(fixPriceProduct1.isSpecial());
            System.out.println("==================================");

            ProductBasket productBasket = new ProductBasket();
            productBasket.fillingProductBasket(simpleProduct1);
            productBasket.fillingProductBasket(discountedProduct1);
            productBasket.fillingProductBasket(fixPriceProduct1);

            System.out.println(productBasket.getSumOfProductBasket());
            System.out.println("==================================");

            System.out.println(productBasket.ProductBasketSpecial());

            System.out.println(simpleProduct1.toString());
            System.out.println(discountedProduct1.toString());
            System.out.println(fixPriceProduct1.toString());
            System.out.println(productBasket.getSumOfProductBasket());
            System.out.println(productBasket.ProductBasketSpecial());

        }
    }
}
