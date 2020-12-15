package com.company;

import java.util.ArrayList;

public class Caisse  {
    private int id;
    private double montantTotal;

    public Caisse(int id, double montantTotal) {
        this.id = id;
        this.montantTotal = montantTotal;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }


    public String scanner(ArrayList<Chariot> chariots) {
        double total = 0;
        String result = "ID : " + this.id;
        for (Chariot chariot: chariots) {
            total += chariot.getProductTotal();
            result += "\n" + chariot.getArticleAchete().getNom() + " : " + chariot.getArticleAchete().getPrix() + " * " + chariot.getQuantiteAchete() + " = " + chariot.getProductTotal();

        }

        result += "\nTotal : " + total;
        return result;
    }
}
