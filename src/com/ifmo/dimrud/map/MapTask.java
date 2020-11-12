package com.ifmo.dimrud.map;

import com.ifmo.dimrud.homeTaskLesson15.collection.Employee;

import java.util.*;

public class MapTask {
    public static void main(String[] args) {
        // TODO:: написать статический метод, который приннимает на вход мапу (firstTaskMap) и город (city)
        //  и формирует список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";
        getLogin(firstTaskMap, city);


        // TODO:: дан список слов (words).
        //  Написать метод, который будет возвращать количество
        //  одинаковых слов с списке
        //  в виде Map<String, Integer>,
        //  где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");
        uniqWords(words);


        // TODO:: дана мапа (customerMap).
        //  Написать метод, который принимает на вход агрументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели,
        //  возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));


        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод:
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  3. написать метод, который выводит в консоль топ 10 самых частых слов
        //  4. Вывести частоту встречаемости букв анг алфавита в данном тексте. Вывести в процентах для каждой буквы

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        percentageOfLetters(text);


    }
    //Задание 1:

    public static HashMap<String, String> getLogin(HashMap<String, String> map, String city) {
        HashMap<String, String> loginToCity = new HashMap<>();
        for (Map.Entry<String, String> count : map.entrySet()) {
            if (count.getValue().equals(city)) {
                loginToCity.put(count.getKey(), count.getValue());
            }
        }
        return loginToCity;
    }
    //Задание 2

    public static void uniqWords(List<String> wordsList) {
        int value = 0;
        HashMap<String, Integer> word = new HashMap<>();
        for (int i = 0; i < wordsList.size(); i++) {
            for (int j = 0; j < wordsList.size(); j++) {
                if (wordsList.get(i).equals(wordsList.get(j)))
                    value += 1;
            }
            if (word.containsKey(wordsList.get(i)))
                value = 0;
            else {
                word.put(wordsList.get(i), value);
                value = 0;
            }
        }
        for (Map.Entry<String, Integer> count : word.entrySet()) {
            System.out.println(count.getKey() + " " + count.getValue());
        }
    }

    //Задание 3

    public static HashMap<String, Customer> getByAge(
            HashMap<String, Customer> map,
            int from, int to
    ) {
        HashMap<String, Customer> newMap = new HashMap<>();
        for (Map.Entry<String, Customer> entry : map.entrySet()) {
            if (entry.getValue().getAge() >= from &&
                    entry.getValue().getAge() < to) {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        return newMap;
    }
    //Задание 4.1

    public static Integer word(String text, String word) {
        String text2 = text.toLowerCase();
        String[] textMassive = text2.split(" ");
        List<String> arrayCollection = new ArrayList<>(Arrays.asList(textMassive));
        int value = 0;
        for (int i = 0; i < arrayCollection.size(); i++) {
            if (arrayCollection.get(i).equals(word))
                value += 1;
        }
        return value;
    }

    //Задание 4.2

    public static void wordToGroup(String text) {
        String text2 = text.toLowerCase();
        String[] textMassive = text2.split(" ");
        List<String> arrayCollection = new ArrayList<>(Arrays.asList(textMassive));
        List<String> wordToGroup = new ArrayList<>();
        for (int i = 0; i < arrayCollection.size(); i++) {
            if (arrayCollection.get(i).length() == i)
                wordToGroup.add(arrayCollection.get(i));
        }
        for (String count : wordToGroup) {
            System.out.println(count);
        }
    }

    //Задание 4.3

    public static void topTen(String text) {
        String text2 = text.toLowerCase();
        String[] textMassive = text2.split(" ");
        List<String> arrayCollection = new ArrayList<>(Arrays.asList(textMassive));
        Map<Integer, String> topTen = new TreeMap<>();
        int value = 0;
        for (int i = 0; i < arrayCollection.size(); i++) {
            for (int j = 0; j < arrayCollection.size(); j++) {
                if (arrayCollection.get(i).equals(arrayCollection.get(j)))
                    value += 1;
            }
            if (topTen.containsValue(arrayCollection.get(i))) {
                value = 0;
            } else {
                topTen.put(value, arrayCollection.get(i));
                value = 0;
            }
        }
        for (Map.Entry<Integer, String> entry : topTen.entrySet()) {
            System.out.println(entry);
        }
    }

    //Задание 4.4

    public static void percentageOfLetters(String text) {
        String text2 = text.toLowerCase();
        String[] textMassive = text2.split(" ");
        List<String> arrayCollection = new ArrayList<>(Arrays.asList(textMassive));
        int value=0;
        for (char c = 'a'; c <= 'z'; c++) {
            for(int i=0;i< arrayCollection.size();i++){
                for(int j=0;j<arrayCollection.get(i).length();j++){
                    if(c==arrayCollection.get(i).charAt(j))
                        value+=1;
                }
            }
            System.out.println(c+" "+value);
            value=0;
        }
    }


}
