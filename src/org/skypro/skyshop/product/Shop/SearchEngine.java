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

    public int foundObject(String str, String substring) {

        int count = 0;
        int index = 0;
        int substringIndex = str.indexOf(substring, index);
        while (substringIndex != -1) {
            count++;
            index = substringIndex + substring.length();
            substringIndex = str.indexOf(substring, index);
        }
        return count;
    }

    public Searchable findBestMatch(String search, Searchable[] items) {
        if (items == null || items.length == 0 || search == null) return null;
        Searchable best = null;
        int maxCount = -1;
        for (Searchable item : items) {
            if (item == null) continue;
            String term = item.getSearchTerm();
            if (term == null) continue;
            int count = foundObject(term, search);
            if (count > maxCount) {
                maxCount = count;
                best = item;
            }
            if (best == null || maxCount == 0) {
                throw new BestResultNotFound(search);
            }
        }
        return best;
    }


}
