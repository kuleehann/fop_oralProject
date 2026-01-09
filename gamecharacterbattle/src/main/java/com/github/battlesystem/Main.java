package com.github.battlesystem;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        List<Integer> characters = new ArrayList<>();
        characters.addAll(Arrays.asList(1, 2, 3));

        System.out.print("Select your character (1 - Warrior, 2 - Wizard, 3 - Archer): ");
        int playerNum = sc.nextInt();
        while (!characters.contains(playerNum) ){
            System.out.print("Select your character (1 - Warrior, 2 - Wizard, 3 - Archer): ");
            playerNum = sc.nextInt();
        }
        characters.remove(playerNum);

        int randomOpponentIndex = r.nextInt(characters.size());
        int opponentNum = characters.get(randomOpponentIndex);

        Character player = null;
        switch(playerNum) {
            case 1 : player = new Warrior("Player (Warrior)", 200, 50); break;
            case 2 : player = new Wizard("Player (Wizard)", 180, 60); break;
            case 3 : player = new Archer("Player (Archer)", 220, 40); break;
        }

        Character opponent = null;
        switch(opponentNum) {
            case 1 : opponent = new Warrior("Opponent (Warrior)", 200, 50); break;
            case 2 : opponent = new Wizard("Opponent (Wizard)", 180, 60); break;
            case 3 : opponent = new Archer("Opponent (Archer)", 220, 40); break;
        }

        int randomPlayerTurn = r.nextInt(2);
        randomTurn(randomPlayerTurn);

        //loooooooop
        while (player.getHealthPoints() > 0 && opponent.getHealthPoints() > 0) {
            playerTurn(1,2,3,4,5,6);
        }
    }

    public static void randomTurn(int randomPlayerTurn) {
        if (randomPlayerTurn == 0)
            System.out.println("Opponent starts first.");
        else
            System.out.println("Player starts first");
    }

    public static void playerTurn(int playerEnergy, int normalAttackEnergy, int specialAttackEnergy, int normalAttackPower, int specialAttackPower, int enemyHP) {
        System.out.println("Your energy remaining: " + playerEnergy);
        System.out.print("1 - Normal attack - Energy cost: " + normalAttackEnergy + ", Power: " + normalAttackPower +"\n2 - Special move - Energy cost: " + specialAttackEnergy + ", Power: " + specialAttackPower + "\nSelect Attack: ");
        int attack = 0; //inputt???
    }

    public static boolean checkEnergyPoints(int energy, int neededEnergy) {
        if (energy < neededEnergy)
            return false;
        else
            return true;
    }

}