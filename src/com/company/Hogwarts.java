package com.company;

public class Hogwarts {
    private String fullName;
    private int power, transgressionDistance;

    public Hogwarts(String fullName, int power, int transgressionDistance) {
        this.fullName = fullName;
        this.power = power;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    public int getTransgressionDistance() { return transgressionDistance; }
    public void setTransgressionDistance(int transgressionDistance) { this.transgressionDistance = transgressionDistance; }

}