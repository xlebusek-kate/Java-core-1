package org.skypro.skyshop.article;

import org.skypro.skyshop.product.Shop.Searchable;

public class Article implements Searchable {

    private final String name;
    private final String text;

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", text: " + text;
    }

    public String getText() {
        return text;
    }

    public String getSearchTerm() {
        return name + " " + text;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }
}

