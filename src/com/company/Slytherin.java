package com.company;

public class Slytherin extends Hogwarts {
    int cunning, determined, ambition, resourceful, thirstForPower;

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

}