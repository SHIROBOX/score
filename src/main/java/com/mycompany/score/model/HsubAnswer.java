package com.mycompany.score.model;

import java.util.Objects;

/**
 *
 * @author mbk_i
 */
public class HsubAnswer {

    private String hcode;
    private Question question;
    private Answer answer;

    public HsubAnswer() {
    }

    public HsubAnswer(String hcode, Question question, Answer answer) {
        this.hcode = hcode;
        this.question = question;
        this.answer = answer;
    }

    public String getHcode() {
        return hcode;
    }

    public void setHcode(String hcode) {
        this.hcode = hcode;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.hcode);
        hash = 17 * hash + Objects.hashCode(this.question);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HsubAnswer other = (HsubAnswer) obj;
        if (!Objects.equals(this.hcode, other.hcode)) {
            return false;
        }
        return Objects.equals(this.question, other.question);
    }

}
