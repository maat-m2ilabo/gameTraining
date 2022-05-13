package org.example;

import java.util.ArrayList;
import java.util.List;
public abstract class Ennemies {
    public static ArrayList<Monster> Create(int ennemiesNumber) {

        ArrayList<Integer> takenNames = new ArrayList<>();
        ArrayList<Monster> ennemies = new ArrayList();
        for (int i = 0; i < ennemiesNumber; i++) {
            boolean y = false;
            while(y == false) {
                int random = GenerateRandom.random(0, (Monster.getRandomNameList().size()-1));
                if (!takenNames.contains(random)) {
                    String name = Monster.getRandomNameList().get(random);
                    takenNames.add(random);
                    ennemies.add(new Monster(name, 100));
                    y = true;
                }
            }
        }

        return ennemies;
    }




}
