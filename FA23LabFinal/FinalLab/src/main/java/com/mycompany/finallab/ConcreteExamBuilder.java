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
class ConcreteExamBuilder implements ExamBuilder {
  private Exam exam;
    private List<Question> questions;

    public ConcreteExamBuilder() {
        this.exam = new Exam();
        this.questions = new ArrayList<>();
    }

    @Override
    public void buildMCQ(String questionText, List<String> options, String correctOption) {
        MCQQuestion mcqQuestion = new MCQQuestion(questionText, options, correctOption);
        questions.add(mcqQuestion);
    }

    @Override
    public void buildFillInTheBlank(String questionText, String correctAnswer) {
        FillInTheBlankQuestion fillInTheBlankQuestion = new FillInTheBlankQuestion(questionText, correctAnswer);
        questions.add(fillInTheBlankQuestion);
    }

    @Override
    public void buildTrueFalse(String questionText, boolean correctAnswer) {
        TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion(questionText, correctAnswer);
        questions.add(trueFalseQuestion);
    }

    @Override
    public Exam getResult() {
        for (Question question : questions) {
            exam.addQuestion(question);
        }
        return exam;
    }
}