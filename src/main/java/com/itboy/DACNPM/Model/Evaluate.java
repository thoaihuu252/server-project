package com.itboy.DACNPM.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Evaluate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEvaluate;
    private String contentEvaluate;
    private int starEvaluate;
    private int num_like;
    private Date dateEvaluate;

    public Evaluate(long idEvaluate, String contentEvaluate, int starEvaluate, int like, Date dateEvaluate) {
        this.idEvaluate = idEvaluate;
        this.contentEvaluate = contentEvaluate;
        this.starEvaluate = starEvaluate;
        this.num_like = like;
        this.dateEvaluate = dateEvaluate;
    }

    public Evaluate() {

    }

    public long getIdEvaluate() {
        return idEvaluate;
    }

    public void setIdEvaluate(long idEvaluate) {
        this.idEvaluate = idEvaluate;
    }

    public String getContentEvaluate() {
        return contentEvaluate;
    }

    public void setContentEvaluate(String contentEvaluate) {
        this.contentEvaluate = contentEvaluate;
    }

    public int getStarEvaluate() {
        return starEvaluate;
    }

    public void setStarEvaluate(int starEvaluate) {
        this.starEvaluate = starEvaluate;
    }

    public int getNum_like() {
        return num_like;
    }

    public void setNum_like(int like) {
        this.num_like = like;
    }

    public Date getDateEvaluate() {
        return dateEvaluate;
    }

    public void setDateEvaluate(Date dateEvaluate) {
        this.dateEvaluate = dateEvaluate;
    }
}

