package com.github.battlesystem;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Warrior warrior = new Warrior("Warrior", 200, 50);
        Wizard wizard = new Wizard("Wizard", 180, 60);
        Archer archer = new Archer("Archer", 220, 40);

        List<Integer> [] characters = new ArrayList<>();

        System.out.println("Select your character (1 - Warrior, 2 - Wizard, 3 - Archer");
        int player = sc.nextInt();
        while (!Arrays.asList(characters).contains(player)) {
            System.out.println("Select your character (1 - Warrior, 2 - Wizard, 3 - Archer");
            player = sc.nextInt();
        }
    }
}