package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Shop.BestResultNotFound;
import org.skypro.skyshop.product.Shop.SearchEngine;
import org.skypro.skyshop.basket.ProductBasket;

import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Shop.Searchable;

import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static class Main {
        public static void main(String[] args) 
            Searchable article1 = new Article("Гарри Потер" , "Жил был Гарри, и было у него много врагов");
            Searchable article2 = new Article("Джон" , "Джон - фермер");
            Searchable article3 = new Article("День ночь" , "День 12 часов, ночь всегда...");
            Searchable article4 = new Article("Котенок" , "Котенок Василий жил в деревне");
            Searchable article5 = new Article("Оно" , "Оно убило всех");
            SearchEngine searchEngine = new SearchEngine(5);
            searchEngine.add(article1);
            searchEngine.add(article2);
            searchEngine.add(article3);
            searchEngine.add(article4);
            searchEngine.add(article5);

            try {
                Product product = new Product("222", 99);
                SimpleProduct simpleProduct = new SimpleProduct("333", 77);
                DiscountedProduct discountedProduct = new DiscountedProduct("444", 34, -9);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            try {
                Searchable bestMatch = searchEngine.findBestMatch("ночь", searchEngine.getSearchables());
                if (bestMatch != null) {
                    System.out.println("Найденный объект: " + bestMatch.getSearchTerm());
                }
            } catch (BestResultNotFound e) {
                System.out.println(e.getMessage());
            }

            try {
                Searchable bestMatch = searchEngine.findBestMatch("Програмист", searchEngine.getSearchables());
                if (bestMatch != null) {
                    System.out.println("Найденный объект: " + bestMatch.getSearchTerm());
                }
            } catch (BestResultNotFound e) {
                System.out.println(e.getMessage());
         

            System.out.println(simpleProduct1.toString());
            System.out.println(discountedProduct1.toString());
            System.out.println(fixPriceProduct1.toString());
            System.out.println(productBasket.getSumOfProductBasket());
            System.out.println(productBasket.ProductBasketSpecial());


            System.out.println("Фиксированная цена: "+ fixPriceProduct1.getPrice());
        }
    }
}
