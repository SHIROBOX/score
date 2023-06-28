package com.mycompany.score.model;

import java.util.Objects;

/**
 *
 * @author mbk_i
 */
public class QuestionExtensionRule {

    private Question question;
    private Rule rule;

    public QuestionExtensionRule() {
    }

    public QuestionExtensionRule(Question question, Rule rule) {
        this.question = question;
        this.rule = rule;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.question);
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
        final QuestionExtensionRule other = (QuestionExtensionRule) obj;
        return Objects.equals(this.question, other.question);
    }

}
