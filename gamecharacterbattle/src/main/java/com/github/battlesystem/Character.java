package com.github.battlesystem;

public abstract class Character {
    //attributes
    private String name;
    private int healthPoints;
    private int energyPoints;
    private Attack normalAttack;
    private Attack specialMove;

    //parameterized constructor
    public Character(String name, int healthPoints, int energyPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getHealthPoints() {
        return healthPoints;
    }
    public int getEnergyPoints() {
        return energyPoints;
    }
    public Attack getNormalAttack() {
        return normalAttack;
    }
    public Attack getSpecialMove() {
        return specialMove;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }
    public void setNormalAttack(Attack normalAttack) {
        this.normalAttack = normalAttack;
    }
    public void setSpecialMove(Attack specialMove) {
        this.specialMove = specialMove;
    }

    //abstract methods
    public abstract void normalAttack(Character opponent);
    public abstract void specialMove(Character opponent);

}
