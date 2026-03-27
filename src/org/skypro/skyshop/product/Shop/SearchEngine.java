package org.skypro.skyshop.product.Shop;

public class SearchEngine {
    private Searchable[] searchables;

    public SearchEngine(int size) {
        this.searchables = new Searchable[size]; // Инициализируем поле класса
    }

    public boolean search(String string) {
        Searchable[] newSearchables = new Searchable[5];
        int resultCount = 0;
        for (int i = 0; i < searchables.length; i++) {
            Searchable searchable = searchables[i];
            if (searchable != null && searchable.getSearchTerm().contains(string)) {
                if (resultCount < newSearchables.length) {
                    newSearchables[resultCount] = searchable;
                    resultCount++;
                    break;
                } else {
                    break;
                }
            }
        }
        return true;
    }

    public void add(Searchable newSearchable) {
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null)
                searchables[i] = newSearchable;
            break;
        }
    }

}
