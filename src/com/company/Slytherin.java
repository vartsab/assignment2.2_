package com.company;

public class Slytherin extends Hogwarts {

    private int cunning;
    private int determined;
    private int ambition;
    private int resourceful;
    private int thirstForPower;

    public Slytherin(String fullName, int power, int transgressionDistance, int cunning, int determined, int ambition, int resourceful, int thirstRorPower) {
        super(fullName, power, transgressionDistance);
        this.cunning = cunning;
        this.determined = determined;
        this.ambition = ambition;
        this.resourceful = resourceful;
        this.thirstForPower = thirstRorPower;
    }

    public int getCunning() { return cunning; }

    public void setCunning(int cunning) { this.cunning = cunning; }

    public int getDetermined() { return determined; }

    public void setDetermined(int determined) { this.determined = determined; }

    public int getAmbition() { return ambition; }

    public void setAmbitious(int ambitious) { this.ambition = ambitious; }

    public int getResourceful() { return resourceful; }

    public void setResourceful(int resourceful) { this.resourceful = resourceful; }

    public int getThirstRorPower() { return thirstForPower; }

    public void setThirstRorPower(int thirstRorPower) { this.thirstForPower = thirstRorPower; }

    public String toString() {
        return this.getFullName() +
                "\n\tpower: " + this.getPower() +
                "\n\ttransgression distance: " + this.getTransgressionDistance() +

                "\n\tcunning: " + this.getCunning() +
                "\n\tdetermined: " + this.getDetermined() +
                "\n\tambition: " + this.getAmbition() +
                "\n\tresourceful: " + this.getResourceful() +
                "\n\tthirst for power: " + this.getThirstRorPower() + "\n";
    }
}