package com.ifmo.dimrud.homeTaskLesson15.collection.compare;

import com.ifmo.dimrud.homeTaskLesson15.collection.Employee;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private String color;
    private String brand;
    private int price;

    public Car(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.price, o.price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                color.equals(car.color) &&
                brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

class ColorComparator implements Comparator<Car> {
    public int compare(Car o1, Car o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}

class BrandComparator implements Comparator<Car> {
    public int compare(Car o1, Car o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class PriceComparator implements Comparator<Car> {
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}