/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finallab;

import java.util.List;

/**
 *
 * @author Super
 */
class MCQQuestion extends Question {
   private List<String> options;
    private String correctOption;

    public MCQQuestion(String text, List<String> options, String correctOption) {
        super(text);
        this.options = options;
        this.correctOption = correctOption;
    }
}
