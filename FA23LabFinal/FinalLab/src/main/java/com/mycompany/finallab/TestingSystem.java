/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finallab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Super
 */
class TestingSystem {
   private static TestingSystem instance;
    private List<Exam> examList;
    private List<Admin> admins;
    private List<Observer> observers;

    private TestingSystem() {
        examList = new ArrayList<>();
        admins = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static TestingSystem getInstance() {
        if (instance == null) {
            instance = new TestingSystem();
        }
        return instance;
    }

    public void addExam(Exam exam) {
        examList.add(exam);
    }

    public void removeExam(Exam exam) {
        examList.remove(exam);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Exam exam) {
        for (Observer observer : observers) {
            observer.update(exam);
        }
    }
}
