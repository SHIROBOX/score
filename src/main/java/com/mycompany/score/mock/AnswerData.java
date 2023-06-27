package com.mycompany.score.mock;

import com.mycompany.score.model.Answer;
import com.mycompany.score.model.Question;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbk_i
 */
public class AnswerData {

    private List<Answer> answers = new ArrayList<>();

    public AnswerData() {
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

}
