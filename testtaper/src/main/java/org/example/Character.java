package org.example;


import java.util.Scanner;

public abstract class Character {
    private String name;
    private int hp;

    private int posX;
    private int posY;

    private String token;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

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

    public int attack(){
        int damage = GenerateRandom.random(0, 20);
        return damage;
    }

    public void move(Map map){
        Scanner scan = new Scanner(System.in);
        System.out.println("Which way?");
        System.out.println("z - top  |  s - bottom  |  q - left  |  d - right");
        String choice = scan.nextLine();
        map.setGrid(posX, posY, "X");
        switch (choice) {
            case "z":
                posX -= 1;
                break;
            case "s":
                posX += 1;
                break;
            case "q":
                posY -= 1;
                break;
            case "d":
                posY += 1;
                break;
        }
        map.setGrid(posX, posY, token);
    }


}

class Monster extends Character {
    public Monster(String name, int hp,int x, int y) {
        this.setName(name);
        this.setHp(hp);
        setPosX(x);
        setPosY(y);
        setToken(String.valueOf(name.charAt(0)));
    }

    public void takeHit(int receivedDamage){
        int newHealth = this.getHp() - receivedDamage;
        setHp(newHealth);
        if (getHp() <= 0) {
            System.out.println("The beast was slain. Congratulations, mighty hero!");
        }
        else {
            System.out.println("The creature received a devastating blow, and lost " + receivedDamage + " HP. Keep fighting!");
        }
    }


}

class Hero extends Character {

    public Hero(String name, int hp, int x, int y) {
        this.setName(name);
        this.setHp(hp);
        setPosX(x);
        setPosY(y);
        setToken(String.valueOf(name.charAt(0)));
    }
    public void flee(){
        System.out.println("You coward, there's no honor in flight");
        int fleeAttempt = GenerateRandom.random(0,1);
        if (fleeAttempt == 0){
            System.out.println("You managed to fail your attempt. How pathetic is that?");
        }
        else {
            System.out.println("You ran away... May you live to fight another day");
            System.exit(0);
        }
    }

    public void takeHit(int receivedDamage){
        int newHealth = getHp() - receivedDamage;
        setHp(newHealth);
        if (getHp() <= 0) {
            System.out.println("You're DEAD mate. Sorry");
        }
        else {
            System.out.println("You received " + receivedDamage + " damage points");
        }
    }

}