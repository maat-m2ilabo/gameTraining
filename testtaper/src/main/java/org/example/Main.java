package org.example;

import java.math.*;

class GenerateRandom {
    public static int random(int min, int max) {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
}


class Warrior{
    private String name;
    private int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void takeHit(int receivedDamage){
        int newHealth = this.hp - receivedDamage;
        setHp(newHealth);
        if (this.hp > 0) {
            System.out.println("You're DEAD mate. Sorry");
        }
        else {
            System.out.println("You now have " + this.hp + " left");
        }
    }

    public int attack(){
        int damage = GenerateRandom.random(0, 20);
        return damage;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}