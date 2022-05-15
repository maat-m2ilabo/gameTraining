package org.example;

import java.util.ArrayList;

public class Ennemies {
    public abstract class Ennemies {
        public static ArrayList<Character> Create() {

            ArrayList<Character> ennemies = new ArrayList();
            Character Ulgrirh = new Character("Ulgrirh", "I", 3, 5);
            Character Ulgrarh = new Character("Ulgragh", "A", 3, 4);
            Character Ulgrerh = new Character("Ulgrerh", "E", 3, 3);
            ennemies.add(Ulgrirh);
            ennemies.add(Ulgrarh);
            ennemies.add(Ulgrerh);
            return ennemies;
        }
    }
