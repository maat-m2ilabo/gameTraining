package fr.neobab;

public class Fighter extends AbstractCharacter {

    public Fighter(int id, String name, String punchline, int hitPoints, int attackDmg, int armorValue) {
        super(id, name, punchline, hitPoints, attackDmg, armorValue);
    }

    @Override
    protected void speak(String punchline) {
        System.out.println(punchline);
    }

    @Override
    protected void dealDmg(AbstractCharacter enemy, int attackDmg, int armorValue) {
        int enemyHitPoints = enemy.getHitPoints();
        enemyHitPoints = attackDmg - armorValue;
        enemy.setHitPoints(enemyHitPoints);
        System.out.println("Dans les dents ! Prends tes " + attackDmg + " points de dégats ! ");
    }

    @Override
    protected void heal(AbstractCharacter self) {
        int min = 1;
        int max = 20;
        int d20 = (int)Math.floor(Math.random()*(max-min+1)+min);
        if (d20 == 20) {
            self.hitPoints += 20;
        }
        System.out.println("Vos soins échouent.");
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPunchline() {
        return punchline;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }


    @Override
    public int getAttackDmg() {
        return attackDmg;
    }

    @Override
    public int getArmorValue() {
        return armorValue;
    }

    @Override
    public String toString() {
        return "\n Fighter{" +
                "name='" + name + '\'' +
                ", punchline='" + punchline + '\'' +
                ", hitPoints=" + hitPoints +
                ", attackDmg=" + attackDmg +
                ", armorValue=" + armorValue +
                '}';
    }
}
