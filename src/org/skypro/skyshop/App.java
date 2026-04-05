package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Shop.SearchEngine;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Shop.Searchable;
import org.skypro.skyshop.product.SimpleProduct;

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

            Searchable article1 = new Article("Гарри Потер" , " Жил был Гарри, и было у него много врагов");
            Searchable article2 = new Article("Джон" , " Джон - фермер");
            Searchable article3 = new Article("День ночь" , " День 12 часов, ночь всегда...");
            Searchable article4 = new Article("Котенок" , " Котенок Василий жил в деревне");
            Searchable article5 = new Article("Оно" , " Оно убило всех");


            SearchEngine searchEngine = new SearchEngine(5);
            searchEngine.add(article1);
            searchEngine.add(article2);
            searchEngine.add(article3);
            searchEngine.add(article4);
            searchEngine.add(article5);
            searchEngine.search(" ночь всегда ");
            System.out.println(searchEngine.search(" ночь всегда "));

            try {
                Product product = new Product("222", 99);
                SimpleProduct simpleProduct = new SimpleProduct("333", 77);
                DiscountedProduct discountedProduct = new DiscountedProduct("444", 34, -9);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }



        }
    }
}
