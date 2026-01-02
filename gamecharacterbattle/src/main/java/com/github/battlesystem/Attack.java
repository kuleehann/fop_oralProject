package com.github.battlesystem;

public class Attack {
    //attributes
    private String name;
    private int power;
    private int energyCost;

    //constructor
    public Attack(String name, int power, int energyCost) {
        this.name = name;
        this.power = power;
        this.energyCost = energyCost;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }
}