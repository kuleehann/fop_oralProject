package com.github.battlesystem;

public class Wizard extends Character {
    Attack normalAttack = new Attack("Magic Missile", 10, 1);
    Attack specialMove = new Attack("Wall of Fire", 60, 6);

    public Wizard(String name, int healthPoints, int energyPoints) {
        super(name, healthPoints, energyPoints);
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
