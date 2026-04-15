package org.skypro.skyshop.product.Shop;

public interface Searchable {
    String getSearchTerm();
    String getName();
    String getContentType();
    default String getStringRepresentation() {
        return getName() + " — " + getContentType();
    }
}
