package com.company;

public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int power, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(fullName, power, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() { return diligence; }

    public void setDiligence(int diligence) { this.diligence = diligence; }

    public int getLoyalty() { return loyalty; }

    public void setLoyalty(int loyalty) { this.loyalty = loyalty; }

    public int getHonesty() { return honesty; }

    public void setHonesty(int honesty) { this.honesty = honesty; }

    public String toString() {
        return this.getFullName() +
                "\n\tpower: " + this.getPower() +
                "\n\ttransgression distance: " + this.getTransgressionDistance() +
                "\n\tdiligence: " + this.getDiligence() +
                "\n\tloyalty: " + this.getLoyalty() +
                "\n\thonesty: " + this.getHonesty() + "\n";
    }

}