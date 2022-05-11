package org.example;

import com.sun.source.tree.WhileLoopTree;

import java.math.*;

class GenerateRandom {
    public static int random(int min, int max) {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }
}

/*Classe du guerrier, faudrait le mettre dans un fichier à part une fois qu'on aura vu ça ^^ */
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
        if (this.hp <= 0) {
            System.out.println("You're DEAD mate. Sorry");
        }
        else {
            System.out.println("You now have " + this.hp + " HP left");
        }
    }

    public int attack(){
        int damage = GenerateRandom.random(0, 20);
        return damage;
    }

    public Warrior(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
}

class Monster extends Warrior{
    public void takeHit(int receivedDamage){
        int newHealth = this.getHp() - receivedDamage;
        setHp(newHealth);
        if (getHp() <= 0) {
            System.out.println("The beast was slain. Congratulations, mighty hero!");
        }
        else {
            System.out.println("The creature now has " + getHp() + " HP left. Keep fighting!");
        }
    }

    public Monster(String name, int hp) {
        super(name, hp);
    }
}


public class Main {
    public static void main(String[] args) {
        Warrior player = new Warrior("Ilgard", 200);
        Monster enemy = new Monster("Ulgrirh", 200);

        do {
            enemy.takeHit(player.attack());
            if (enemy.getHp() > 0) {
                player.takeHit(enemy.attack());
            }

        }
        while (player.getHp() > 0 && enemy.getHp() > 0);
    }

}