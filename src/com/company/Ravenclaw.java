package com.company;

public class Ravenclaw extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, int power, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(fullName, power, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() { return intelligence; }

    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    public int getWisdom() { return wisdom; }

    public void setWisdom(int wisdom) { this.wisdom = wisdom; }

    public int getWit() { return wit; }

    public void setWit(int wit) { this.wit = wit; }

    public int getCreativity() { return creativity; }

    public void setCreativity(int creativity) { this.creativity = creativity; }

    @Override
    public String toString() {
        return this.getFullName() +
                "\n\tpower: " + this.getPower() +
                "\n\ttransgression distance: " + this.getTransgressionDistance() +
                "\n\tintelligence: " + this.getIntelligence() +
                "\n\twisdom: " + this.getWisdom() +
                "\n\twit: " + this.getWit() +
                "\n\tcreativity: " + this.getCreativity() + "\n";
    }

}