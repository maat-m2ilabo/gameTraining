package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.math.*;

import static org.example.battle.fight;

class GenerateRandom {
    public static int random(int min, int max) {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
}

public class Main {
    public static void main(String[] args) {
        Hero player = new Hero("Ilgard", 200);
        Monster enemy = new Monster("Ulgrirh", 200);
    fight(player, enemy);
    }
}