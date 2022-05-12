package org.example;

import java.util.ArrayList;
import java.util.List;
import static org.example.Battle.battle;


public class Main {
    public static void main(String[] args) {
        Hero player = new Hero("Ilgard", 600);
        ArrayList<Monster> ennemies = Ennemies.Create(3);
        System.out.println(player.getName());
        battle(player, ennemies);

    }
}