package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] productBasket = new Product[5];

    public void fillingProductBasket(Product newProduct) {
        for (int i = 0; ; i++) {
            if (i < productBasket.length && productBasket[i] == null) {
                productBasket[i] = newProduct;
                System.out.println("Добавлено!");
                break;
            }
            if (i >= productBasket.length) {
                System.out.println("Невозможно добавить продукт");
                break;
            }
        }
    }

    public void getPrice(Product newProduct) {
        for (int i = 0; i < productBasket.length; i++) {
            if (productBasket[i] == null) {
                productBasket[i] = newProduct;
                break;
            }
        }
    }

    public int getSumOfProductBasket() {
        int sum = 0;
        int count = 0;
        for (Product product : productBasket) {
            if (product == null) {
                count++;
                break;
            }
            if (product != null) {
                sum += product.getPrice();
            }
            count++;
        }
        return sum / count;
    }

    public void toPrintAllProducts() {
        for (int i = 0; i < productBasket.length; i++) {
            if (productBasket[i] == null) {
                System.out.println("В корзине пусто!!!");
                break;
            }
            Product product = productBasket[i];
            System.out.println("<" + product.getName() + ">: " + "<" + product.getPrice() + ">");
        }
        System.out.println("Итого: <" + getSumOfProductBasket() + ">");
    }

    public boolean foundProduct(String nameProduct) {
        boolean isItTrue = false;
        for (Product product : productBasket) {
            if (product == null) {
                break;
            }
            isItTrue = product.getName().equals(nameProduct);
            if (isItTrue == true) {
                break;
            }
        }
        System.out.println(isItTrue);
        return isItTrue;
    }

    public void clearArrays() {
        for (int i = 0; i < productBasket.length; i++) {
            Product product = productBasket[i];
            productBasket[i] = null;
        }
    }

}

