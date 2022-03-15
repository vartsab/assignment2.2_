package com.company;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String fullName, int power, int transgressionDistance, int nobility, int honour, int bravery) {
        super(fullName, power, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() { return nobility; }

    public void setNobility(int nobility) { this.nobility = nobility; }

    public int getHonour() { return honour; }

    public void setHonour(int honour) { this.honour = honour; }

    public int getBravery() { return bravery; }

    public void setBravery(int bravery) { this.bravery = bravery; }

    @Override
    public String toString () {
        return this.getFullName() +
                "\n\tpower: " + this.getPower() +
                "\n\ttransgression distance: " + this.getTransgressionDistance() +
                "\n\tnobility: " + this.getNobility() +
                "\n\thonour: " + this.getHonour() +
                "\n\tbravery: " + this.getBravery() + "\n";
    }

}