package com.example.test.models;

import com.example.test.interfaces.IArticle;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Article implements IArticle{

    public Article(){}

    public Article (String ID, String nameArticle, int year, String nameJournal, Doctor doctor){
        this.articleID = ID;
        this.nameArticle = nameArticle;
        this.year = year;
        this.nameJournal = nameJournal;
        this.doctor = doctor;
    }

    private String articleID;
    private String nameArticle;
    private int year;
    private String nameJournal;
    private Doctor doctor;

    private Set <Article> articles = new HashSet<>();

    public String getNameArticle() {
        return nameArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameJournal() {
        return nameJournal;
    }

    public void setNameJournal(String nameJournal) {
        this.nameJournal = nameJournal;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }


}
