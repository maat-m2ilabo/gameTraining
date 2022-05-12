package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static org.example.Battle.battle;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Good day to you, master. How shall I call you?");
        //no limit à la longueur du nom. It's not a bug, it's a feature!
        //Si ça devait ne plus être amusant (we are not amused), penser à limiter avec un if userName.length...
        String userName = scanner.nextLine();
        Hero player = new Hero(userName, 600);
        ArrayList<Monster> ennemies = Ennemies.Create(3);
        battle(player, ennemies);

    }
}