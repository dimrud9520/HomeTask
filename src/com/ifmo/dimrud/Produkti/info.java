package com.ifmo.dimrud.Produkti;

import java.util.Arrays;

public class info {
    public static void main(String[] args)
    {
        Product a=new Product("Пончики",123,432,121);
        Product b=new Product("Картошка",123,432,121,212);
        Product c=new Product("Торт",123,432,121,21);
        Product d=new Product("Курица",123,432,121,343);
        MyProduct one=new MyProduct(4);
        one.addProduct(a);
        one.addProduct(b);
        one.addProduct(c);
        one.addProduct(d);
        System.out.println(one);
    }
}
