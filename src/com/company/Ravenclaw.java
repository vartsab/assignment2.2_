package com.company;

public class Ravenclaw extends Hogwarts {
    int intelligence, wisdom, wit, creativity;

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

}