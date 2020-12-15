package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Article article1 = new Article("Lait", 5, true);
        Article article2 = new Article("Viande", 100, true);
        Article article3 = new Article("Bimo", 2, false);
        Article article4 = new Article("Café", 50, true);

        Article[] articles = {article1, article2, article3, article4};
        for (Article article: articles) {
            System.out.println(article.caracteristique());
            System.out.println("------------------");
        }

        System.out.println("======================================");

        Chariot chariot1 = new Chariot(article1, 10);
        Chariot chariot2 = new Chariot(article2, 1);
        Chariot chariot3 = new Chariot(article3, 80);
        Chariot chariot4 = new Chariot(article4, 2);

        ArrayList<Chariot> chariots = new ArrayList<>();
        chariots.add(chariot1);
        chariots.add(chariot2);
        chariots.add(chariot3);
        chariots.add(chariot4);

        for (Chariot chariot: chariots) {
            System.out.println(chariot.getArticleAchete().getNom() + " : " + chariot.getProductTotal() + " MAD");
            System.out.println("------------------");
        }

        System.out.println("======================================");


        Caisse caisse1 = new Caisse(123, 0.0);
        System.out.println(caisse1.scanner(chariots));




    }
}
