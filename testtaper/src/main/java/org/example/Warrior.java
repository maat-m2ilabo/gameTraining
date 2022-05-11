package org.example;

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
        super(name, hp) ;
    }
}

class Hero extends Warrior{
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

    public Hero(String name, int hp) {
        super(name, hp);
    }
}