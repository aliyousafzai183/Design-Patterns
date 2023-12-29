/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finallab;

/**
 *
 * @author Super
 */
public class Main {
 // Main class

    public static void main(String[] args) {
        TestingSystem testingSystem = TestingSystem.getInstance();

        // Create an exam
        ExamBuilder builder = new ConcreteExamBuilder() {};
        Exam exam = new Exam();
        exam.setBuilder(builder);
        exam.constructExam();

        // Add a parent observer
        Observer parentObserver = new ParentObserver("Parent1");
        testingSystem.addObserver(parentObserver);

        // Simulate student responses
        Student student1 = new Student("Student1");
        Response response1 = new Response(/* ... */);
        exam.submitResponse(student1, response1);

        Student student2 = new Student("Student2");
        Response response2 = new Response(/* ... */);
        exam.submitResponse(student2, response2);

        // Add the exam to the system and notify observers
        testingSystem.addExam(exam);
        testingSystem.notifyObservers(exam);
    }
}


