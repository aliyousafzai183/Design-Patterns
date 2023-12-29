/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finallab;

import java.util.Map;

/**
 *
 * @author Super
 */
class ParentObserver implements Observer {
   private String parentName;

    public ParentObserver(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public void update(Exam exam) {
        System.out.println("Parent " + parentName + " received exam results notification.");
        Map<Student, Result> results = exam.getResults();
        for (Map.Entry<Student, Result> entry : results.entrySet()) {
            System.out.println("Student: " + entry.getKey().getName() +
                    ", Score: " + entry.getValue().getScore());
        }
    }
}
