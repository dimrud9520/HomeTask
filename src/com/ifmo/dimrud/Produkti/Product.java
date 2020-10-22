package com.ifmo.dimrud.Produkti;

/*Список разрешенных продуктов
Класс Пищевая Ценность
Свойства: имя продукта / белки / жиры / углеводы / калории
Минимум 4 конструктора
Реализовать необходимые проверки входящих данных
Создать не менее 4 экземпляров данного класса (объектов)
Класс Мои Продукты
Свойства: разрешенное количество белков / жиров / углеводов / калорий / список разрешенных продуктов (массив)
Реализовать метод, который принимает на вход название продукта и добавляет его в список разрешенных,
если характеристики продукта полностью соответствуют заявленным разрешениям,
в противном случае сообщить, по какой причине продукт не может быть добавлен в список
Реализовать метод, который показывает список разрешенных продуктов
При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
 */
public class Product {
    private String name;
    private int proteins;// Белки
    private int fats;// Жиры
    private int carbohydrates;// Углеводы
    private int calories;// Калории


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("name==null");
        this.name = name;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        if (proteins < 0)
            throw new IllegalArgumentException("Белки<0");
        this.proteins = proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        if (fats < 0)
            throw new IllegalArgumentException("Жиры<0");
        this.fats = fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        if (carbohydrates < 0)
            throw new IllegalArgumentException("Углеводы<0");
        this.carbohydrates = carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories < 0)
            throw new IllegalArgumentException("Калории<0");
        this.calories = calories;
    }

    public Product(String name, int proteins) {
        setName(name);
        setProteins(proteins);
    }

    public Product(String name, int proteins, int fats) {
        setName(name);
        setProteins(proteins);
        setFats(fats);
    }

    public Product(String name, int proteins, int fats, int carbohydrates) {
        setName(name);
        setProteins(proteins);
        setFats(fats);
        setCarbohydrates(carbohydrates);
    }

    public Product(String name, int proteins, int fats, int carbohydrates, int calories) {
        setName(name);
        setProteins(proteins);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
    }

    @Override
    public String toString() {
        return "Название продукта: " + name + ", " +
                "Белки: " + proteins + ", " +
                "Жиры: " + fats + ", " +
                "Углеводы: " + carbohydrates + ", " +
                "Калории: " + calories + ".";
    }
}
