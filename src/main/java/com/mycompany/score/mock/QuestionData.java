package com.mycompany.score.mock;

import com.mycompany.score.model.Question;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbk_i
 */
public class QuestionData {

    private List<Question> questions = new ArrayList<>();

    public QuestionData() {
        questions.add(new Question(1, "ม1-1"));
        questions.add(new Question(2, "ม1-2"));
        questions.add(new Question(3, "ม1-3"));
        questions.add(new Question(4, "ม1-4"));
        questions.add(new Question(5, "ม2-1"));
        questions.add(new Question(6, "ม2-2"));
        questions.add(new Question(7, "ม2-3"));
        questions.add(new Question(8, "ม2-4"));
        questions.add(new Question(9, "ม2-5"));
        questions.add(new Question(10, "ม2-6"));
        
        questions.add(new Question(11, "ม2-7"));
        questions.add(new Question(12, "ม2-8"));
        questions.add(new Question(13, "ม3-1"));
        questions.add(new Question(14, "ม3-2"));
        questions.add(new Question(15, "ม3-3"));
        questions.add(new Question(16, "ม3-4"));
        questions.add(new Question(17, "ม3-5"));
        questions.add(new Question(18, "ม3-6"));
        questions.add(new Question(19, "ม3-7"));
        questions.add(new Question(21, "ม5-1"));
        
        questions.add(new Question(22, "ม5-2-1"));
        questions.add(new Question(23, "ม5-2-2"));
        questions.add(new Question(24, "ม5-2-3"));
        questions.add(new Question(25, "ม5-2-4"));
        questions.add(new Question(26, "ม5-2-5"));
        questions.add(new Question(27, "ม5-2-6"));
        questions.add(new Question(41, "ม4-1"));
        questions.add(new Question(42, "ม4-2"));
        questions.add(new Question(43, "ม4-3"));
        questions.add(new Question(44, "ม4-4-1"));
        
        questions.add(new Question(45, "ม4-4-2"));
        questions.add(new Question(46, "ม4-4-3"));
        questions.add(new Question(47, "ม4-4-4"));
        questions.add(new Question(48, "ม4-4-5"));
        questions.add(new Question(49, "ม4-5-1"));
        questions.add(new Question(50, "ม4-5-2"));
        questions.add(new Question(51, "ม4-6-1"));
        questions.add(new Question(52, "ม4-6-2"));
        questions.add(new Question(53, "ม4-6-3"));
        questions.add(new Question(54, "ม4-6-4"));
        
        questions.add(new Question(55, "ม4-7"));
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

}
