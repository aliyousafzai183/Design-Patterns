/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finallab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Super
 */
class Exam {
    private List<Question> questions;
    private List<Observer> observers;

    public Exam() {
        this.questions = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void submitResponse(Student student, Response response) {
        // Implementation for submitting responses
    }

    public Map<Student, Result> getResults() {
        // Implementation for getting results
        Map<Student, Result> results = new HashMap<>();
        // Simulated results
        results.put(new Student("Student1"), new Result(80));
        results.put(new Student("Student2"), new Result(90));
        return results;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setBuilder(ExamBuilder builder) {
        builder.buildMCQ("Sample MCQ Question", Arrays.asList("Option A", "Option B", "Option C"), "Option A");
        builder.buildFillInTheBlank("Sample Fill in the Blank Question", "Correct Answer");
        builder.buildTrueFalse("Sample True/False Question", true);
    }

    public void constructExam() {
        notifyObservers();
    }
    
}