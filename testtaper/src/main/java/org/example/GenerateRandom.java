package org.example;

public class GenerateRandom {
    public static int random(int min, int max) {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
}
