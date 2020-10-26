package com.ifmo.dimrud.Zumba;

import java.util.Objects;

public class Fitness {
    private Client[] clientToWaterPool = new Client[20];// массив бассейна
    private Client[] clientToFitness = new Client[20];// массив тренажерного зала
    private Client[] clientToGroup = new Client[20];// массив групповых занятий
    private Abonement abonement;

    public void goToWaterPool(Client client) {
        Objects.requireNonNull(client);
        if (clientToWaterPool[19] != null) {
            System.out.println("На групповых занятиях нету мест");
            return;
        }
        if (abonement.getNumber() == 2) {
            System.out.println("Ваш абонемент не подходит");
            return;
        }
        if (DataTime.getTodayData().isAfter(abonement.getEndData())) {
            System.out.println("Ваш абонемент просрочен");
            return;
        }
        if (DataTime.getCurrenTime().isAfter(DataTime.getCloseTime()) && DataTime.getCurrenTime().isBefore(DataTime.getOpenTime())) {
            System.out.println("Фитнес зал закрыт");
            return;
        }
        for (int i = 0; i < clientToWaterPool.length; i++) {
            if (clientToWaterPool[i] == null) {
                clientToWaterPool[i] = client;
                break;

            }

        }
        client.toString();
    }

    public void goToFitness(Client client) {
        Objects.requireNonNull(client);
        if (clientToFitness[19] != null) {
            System.out.println("На групповых занятиях нету мест");
            return;
        }
        if ((abonement.getNumber() == 2) && (DataTime.getCurrenTime().isAfter(DataTime.getCloseTimeToDayAb()))) {
            System.out.println("Ваш абонемент не подходит");
            return;
        }
        if (DataTime.getTodayData().isAfter(abonement.getEndData())) {
            System.out.println("Ваш абонемент просрочен");
            return;
        }
        if (DataTime.getCurrenTime().isAfter(DataTime.getCloseTime()) && DataTime.getCurrenTime().isBefore(DataTime.getOpenTime())) {
            System.out.println("Фитнес зал закрыт");
            return;
        }
        for (int i = 0; i < clientToFitness.length; i++) {
            if (clientToFitness[i] == null) {
                clientToFitness[i] = client;
                break;
            }
        }
        client.toString();
    }

    public void goToGroup(Client client) {
        Objects.requireNonNull(client);
        if (clientToGroup[19] != null) {
            System.out.println("На групповых занятиях нету мест");
            return;
        }
        if (abonement.getNumber() == 1) {
            System.out.println("Ваш абонемент не подходит");
            return;
        }
        if ((abonement.getNumber() == 2) && (DataTime.getCurrenTime().isAfter(DataTime.getCloseTimeToDayAb()))) {
            System.out.println("Ваш абонемент не подходит");
            return;
        }
        if (DataTime.getTodayData().isAfter(abonement.getEndData())) {
            System.out.println("Ваш абонемент просрочен");
            return;
        }
        if (DataTime.getCurrenTime().isAfter(DataTime.getCloseTime()) && DataTime.getCurrenTime().isBefore(DataTime.getOpenTime())) {
            System.out.println("Фитнес зал закрыт");
            return;
        }

        for (int i = 0; i < clientToGroup.length; i++) {
            if (clientToGroup[i] == null) {
                clientToGroup[i] = client;
                break;
            }
        }
        client.toString();
    }

    public void closeFitness() {
        for (int i = 0; i < clientToWaterPool.length; i++) {
            if (clientToWaterPool[i] != null) clientToWaterPool[i] = null;
        }
        for (int i = 0; i < clientToFitness.length; i++) {
            if (clientToFitness[i] != null) clientToFitness[i] = null;
        }
        for (int i = 0; i < clientToGroup.length; i++) {
            if (clientToGroup[i] != null) clientToGroup[i] = null;
        }
    }

    public String fitnessInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("В бассейне:\n");
        for (int i = 0; i < clientToWaterPool.length; i++) {
            if (clientToWaterPool[i] != null) sb.append(clientToWaterPool[i] + "\n");
        }
        sb.append("В тренажерном зале:\n");
        for (int i = 0; i < clientToFitness.length; i++) {
            if (clientToFitness[i] != null) sb.append(clientToFitness[i] + "\n");
        }
        sb.append("На групповых занятиях:\n");
        for (int i = 0; i < clientToGroup.length; i++) {
            if (clientToGroup[i] != null) sb.append(clientToGroup[i] + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return fitnessInfo();
    }
}

