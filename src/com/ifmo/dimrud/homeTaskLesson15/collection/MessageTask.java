package com.ifmo.dimrud.homeTaskLesson15.collection;


import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        int low = 0, medium = 0, high = 0, urgent = 0;
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).getPriority().equals(MessagePriority.LOW)) low += 1;
            if (messageList.get(i).getPriority().equals(MessagePriority.MEDIUM)) medium += 1;
            if (messageList.get(i).getPriority().equals(MessagePriority.HIGH)) high += 1;
            if (messageList.get(i).getPriority().equals(MessagePriority.URGENT)) urgent += 1;
        }
        System.out.println("LOW: " + low);
        System.out.println("MEDIUM: " + medium);
        System.out.println("HIGH: " + high);
        System.out.println("URGENT: " + urgent);
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        int value = 0;
        for (int i = 0; i < messageList.size(); i++) {
            for (int j = 0; j < messageList.size(); j++) {
                if (messageList.get(i).getCode() == messageList.get(j).getCode())
                    value += 1;
            }
            System.out.println(messageList.get(i).getCode() + " количество сообщений для данного кода:" + value);
            value = 0;
        }
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
       /* int value = 0;
        int val = 0;
        for (int i = 0; i < messageList.size(); i++) {
            Set<Message> messageSet = new LinkedHashSet<>();
            if (messageSet.add(messageList.get(i))) {
                value += 1;
            }
        }*/
       /* int val = 0;
        for (int i = 0; i < messageList.size(); i++) {
            for (int j = 0; j < messageList.size(); j++) {
                if (messageList.get(j).equals(messageList.get(i))) {
                    val += 1;
                }
            }
        }
        System.out.println(val);
    }*/
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]


        return messageList;
    }


    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).getPriority().equals(priority)) {
                messageList.remove(i);
                i = i - 1;
            }
        }
        for (int i = 0; i < messageList.size(); i++) {
            System.out.println(messageList.get(i));
        }
        
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        List<Message> newList = new ArrayList<>();
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).getPriority().equals(priority))
                newList.add(messageList.get(i));
        }
        messageList.clear();
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }

    public static void main(String[] args) {
        // вызов методов
        List<Message> messages = MessageGenerator.generate(6);
        for (int i = 0; i < messages.size(); i++) {
            System.out.println(messages.get(i));
        }
        //countEachPriority(messages);
        // countEachCode(messages);
        //System.out.println("__");
        // removeEach(messages, MessagePriority.MEDIUM);
       // System.out.println("______");
       // removeOther(messages,MessagePriority.LOW);

    }


}

