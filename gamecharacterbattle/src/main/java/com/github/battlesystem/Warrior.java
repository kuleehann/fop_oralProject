package com.github.battlesystem;

public class Warrior extends Character {
    Attack normalAttack = new Attack("Slash", 15, 5);
    Attack specialMove = new Attack("Power Strike", 30, 15);

    public Warrior(String name, int healthPoints, int energyPoints, Attack normalAttack, Attack specialMove) {
        super(name, healthPoints, energyPoints, normalAttack, specialMove);
    }

    //methods
    public void normalAttack(Character opponent) {
        if (this.getEnergyPoints() < this.getNormalAttack().getEnergyCost()) {
            System.out.println(this.getName() + " does not have enough energy to perform " + this.getNormalAttack().getName());
            return;
        }
        opponent.setHealthPoints(opponent.getHealthPoints() - this.getNormalAttack().getPower());
    }

    public void specialMove(Character opponent) {
        if (this.getEnergyPoints() < this.getSpecialMove().getEnergyCost()) {
            System.out.println(this.getName() + " does not have enough energy to perform " + this.getSpecialMove().getName());
            return;
        }
        opponent.setHealthPoints(opponent.getHealthPoints() - this.getSpecialMove().getPower());
    }
}