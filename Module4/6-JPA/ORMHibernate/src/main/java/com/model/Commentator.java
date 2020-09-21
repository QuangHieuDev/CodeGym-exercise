package com.model;

import javax.persistence.*;

@Entity
@Table
public class user {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int evaluate;
    private String author;
    private String feedback;

    public user() {
    }

    public user(int evaluate, String author, String feedback) {
        this.evaluate = evaluate;
        this.author = author;
        this.feedback = feedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(int evaluate) {
        this.evaluate = evaluate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
