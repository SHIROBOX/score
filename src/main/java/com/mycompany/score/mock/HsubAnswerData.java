package com.mycompany.score.mock;

import com.mycompany.score.model.HsubAnswer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbk_i
 */
public class HsubAnswerData {

    private List<HsubAnswer> hsubAnswers = new ArrayList<>();

    public HsubAnswerData() {

    }

    public List<HsubAnswer> getHsubAnswers() {
        return hsubAnswers;
    }

    public void setHsubAnswers(List<HsubAnswer> hsubAnswers) {
        this.hsubAnswers = hsubAnswers;
    }

}
