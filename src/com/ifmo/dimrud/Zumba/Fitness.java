package com.ifmo.dimrud.Zumba;

import java.util.Objects;

public class Fitness {
    private Abonement[] clientToWaterPool = new Abonement[20];// массив бассейна
    private Abonement[] clientToFitness = new Abonement[20];// массив тренажерного зала
    private Abonement[] clientToGroup = new Abonement[20];// массив групповых занятий


    public void goToWaterPool(Abonement abonement) {
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
                clientToWaterPool[i] = abonement;
                break;
            }
        }
        abonement.getClient().toString();
    }

    public void goToFitness(Abonement abonement) {
        Objects.requireNonNull(abonement);
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
                clientToFitness[i] = abonement;
                break;
            }
        }
        abonement.getClient().toString();
    }

    public void goToGroup(Abonement abonement) {
        Objects.requireNonNull(abonement);
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
                clientToGroup[i] = abonement;
                break;
            }
        }
        abonement.getClient().toString();
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

