package com.ifmo.dimrud.Produkti;

public class MyProduct {
    private Product[] okProduct;
    private int proteinsOk = 500;// Белки
    private int fatsOk = 500;// Жиры
    private int carbohydratesOk = 500;// Углеводы
    private int caloriesOk = 500;// Калории
    private int elPr;

    public MyProduct(int elPr) {
        this.okProduct = new Product[elPr];
    }

    public void addProduct(Product product) {
        if (product.getCalories() > caloriesOk) {
            System.out.println("У продукта " + product.getName() + " калории выше нормы");
            return;
        } else if (product.getCarbohydrates() > caloriesOk) {
            System.out.println("У продукта " + product.getName() + " углеводы выше нормы");
            return;
        } else if (product.getFats() > fatsOk) {
            System.out.println("У продукта " + product.getName() + " жиры выше нормы");
            return;
        } else if (product.getProteins() > proteinsOk) {
            System.out.println("У продукта " + product.getName() + " белки выше нормы");
            return;
        }
        if (product != null) {
            for (int i = 0; i < okProduct.length; i++) {
                if (okProduct[i] == null)
                    okProduct[i] = product;
                break;
            }
        }
    }

    public String myProductInfo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < okProduct.length; i++) {
            if (okProduct[i] != null) sb.append(okProduct[i] + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return myProductInfo();
    }
}