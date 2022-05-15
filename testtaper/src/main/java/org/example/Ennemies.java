package org.example;

import java.util.ArrayList;
import java.util.List;
public abstract class Ennemies {
    public static ArrayList<Monster> Create(int ennemiesNumber) {

        ArrayList<Monster> ennemies = new ArrayList();
        for (int i = 0; i < ennemiesNumber; i++) {
            ennemies.add(new Monster (100));
        }

        return ennemies;
    }




}
