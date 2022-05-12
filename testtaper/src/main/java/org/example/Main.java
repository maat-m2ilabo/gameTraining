package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.battle.battle;

class GenerateRandom {
    public static int random(int min, int max) {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
}

public class Main {
    public static void main(String[] args) {
        Hero player = new Hero("Ilgard", 400);
        //refactoriser la suite ^^
        ArrayList<Monster> enemys = new ArrayList();
        Monster Ulgrirh = new Monster("Ulgrirh", 100);
        Monster Ulgrarh = new Monster("Ulgragh", 100);
        Monster Ulgrerh = new Monster("Ulgrerh", 100);
        enemys.add(Ulgrirh);
        enemys.add(Ulgrarh);
        enemys.add(Ulgrerh);
    battle(player, enemys);
    }
}