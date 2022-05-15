package org.example;

import java.util.ArrayList;
import java.util.List;
public abstract class Ennemies {
    public static ArrayList<Monster> Create(int ennemiesNumber) {

        ArrayList<Monster> ennemies = new ArrayList();
        Monster Ulgrirh = new Monster("Ulgrirh", 100, 5, 5);
        Monster Ulgrarh = new Monster("Ulgragh", 100, 5, 6);
        Monster Ulgrerh = new Monster("Ulgrerh", 100, 5, 7);
        ennemies.add(Ulgrirh);
        ennemies.add(Ulgrarh);
        ennemies.add(Ulgrerh);
        return ennemies;
    }
}
