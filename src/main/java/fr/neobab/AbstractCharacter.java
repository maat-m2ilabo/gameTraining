package fr.neobab;

public abstract class AbstractCharacter {

    protected int id;
    protected String name;
    protected String punchline;
    protected int hitPoints;
    protected int attackDmg;
    protected int armorValue;

    public AbstractCharacter(int id, String name, String punchline, int hitPoints, int attackDmg, int armorValue) {
        this.id = id;
        this.name = name;
        this.punchline = punchline;
        this.hitPoints = hitPoints;
        this.attackDmg = attackDmg;
        this.armorValue = armorValue;
    }

    protected abstract void speak(String punchline);
    protected abstract void dealDmg(AbstractCharacter enemy, int attackDmg, int armorValue);

    protected abstract void heal(AbstractCharacter self);

    public abstract int getId();

    public abstract String getName();

    public abstract String getPunchline();

    public abstract int getHitPoints();

    public abstract void setHitPoints(int hitPoints);

    public abstract int getAttackDmg();

    public abstract  int getArmorValue();

    @Override
    public abstract String toString();
}
