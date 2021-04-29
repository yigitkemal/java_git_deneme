package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1,"Lenovo V14",15,"8 gb ram 4gb ekran kartı",10);
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("1gb ram");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);

        Product product3 = new Product();

        System.out.println(product2.getUnitPriceAfterDiscount());

        Product[] products = {
          product1,product2,product3
        };

        Category category = new Category();

        category.setName("Basit");

        System.out.println(category.getName());


    }
}
