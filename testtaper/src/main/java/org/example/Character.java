package org.example;


public abstract class Character {
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
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


}

class Monster extends Character {
    public Monster(int hp) {
        super(name, hp);
        setName();
    }

    private final List<String> randomName = new ArrayList<String>() {{
        add("Ulgrirh");
        add("Ulgragh");
        add("Ulgrerh");
    }};

    @java.lang.Override
    public void setName() {
        Random random = new Random();
        this.name = randomName.get(random.nextInt(0-(randomName.size -1));
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

    public Hero(String name, int hp) {
        super(name, hp);
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