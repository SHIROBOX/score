package com.mycompany.score.model;

import java.util.Objects;

/**
 *
 * @author mbk_i
 */
public class Question {

    private Integer id;
    private String questionDisplay;

    public Question() {
    }

    public Question(Integer id, String questionDisplay) {
        this.id = id;
        this.questionDisplay = questionDisplay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionDisplay() {
        return questionDisplay;
    }

    public void setQuestionDisplay(String questionDisplay) {
        this.questionDisplay = questionDisplay;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Question other = (Question) obj;
        return Objects.equals(this.id, other.id);
    }
    
    

}
