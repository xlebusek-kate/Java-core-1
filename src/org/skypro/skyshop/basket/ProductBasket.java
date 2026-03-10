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

    public int getSumOfProductBasket() {
        int sum = 0;
        for (Product product : productBasket) {
            if (product != null) {
                sum += product.getPrice();
            }
        }
        return sum;
    }

    public void toPrintAllProducts() {
        for (int i = 0; i < productBasket.length; i++) {
            int count = 0;
            if (productBasket[i] == null) {
                count++;
                break;
            }
            if (count == productBasket.length - 1) {
                System.out.println("В корзине пусто!!!");
                break;
            } else {
                Product product = productBasket[i];
                System.out.println("<" + product.getName() + ">: " + "<" + product.getPrice() + ">");
            }
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

