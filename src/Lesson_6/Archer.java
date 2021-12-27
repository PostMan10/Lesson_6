package Lesson_6;

public class Archer {

    private String name;
    private float health;
    private int mana;
    private int range;
    private int dexterity;
    private float speed;
    private int level;
    private String gender;
    private int costEscape = 45;

    public Archer(String name, float health, int mana, int range, int dexterity, float speed, String gender) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.range = range;
        this.dexterity = dexterity;
        this.speed = speed;
        this.gender = gender;
        this.level = 5;
    }

    public void attack() {
        System.out.println(name + " has attack enemy on " + dexterity * range);
    }

    public void run() {
        System.out.println(name + "moved on speed " + speed);
    }

    public void escapeFormBattle() {
        if (mana < costEscape) {
            return;
        }

        if (health < 20) {
            mana -= costEscape;
            System.out.println(name + " has escape from battle ");
        }
    }

    public void getDamage(int incomingDamage) {
        health -= incomingDamage;
        System.out.println(name + " get damage " + incomingDamage + " point");
    }

}

