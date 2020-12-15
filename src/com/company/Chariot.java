package com.company;

import java.util.ArrayList;

public class Chariot {
    private Article articleAchete;
    private int quantiteAchete;

    public Chariot() {
    }

    public Chariot(Article articleAchete, int quantiteAchete) {
        this.articleAchete = articleAchete;
        this.quantiteAchete = quantiteAchete;
    }

    public Article getArticleAchete() {
        return articleAchete;
    }

    public void setArticleAchete(Article articleAchete) {
        this.articleAchete = articleAchete;
    }

    public int getQuantiteAchete() {
        return quantiteAchete;
    }

    public void setQuantiteAchete(int quantiteAchete) {
        this.quantiteAchete = quantiteAchete;
    }

    public double getProductTotal() {
        return this.articleAchete.getPrix() * this.quantiteAchete;
    }
}
