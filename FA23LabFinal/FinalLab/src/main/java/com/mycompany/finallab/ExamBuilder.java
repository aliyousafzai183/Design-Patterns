/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.finallab;

import java.util.List;

/**
 *
 * @author Super
 */
interface ExamBuilder {
    void buildMCQ(String questionText, List<String> options, String correctOption);
    void buildFillInTheBlank(String questionText, String correctAnswer);
    void buildTrueFalse(String questionText, boolean correctAnswer);
    Exam getResult();
}