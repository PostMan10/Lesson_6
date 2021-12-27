package Lesson_6;

public class Warrior {

    private String name;
    private int health;
    private int defence;
    private float speed;
    private int strenght;
    private String gender;
    private int level;

    public Warrior(String name, int health, int defence, float speed, int strenght, String gender) {
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.speed = speed;
        this.strenght = strenght;
        this.gender = gender;
        this.level = 1;
    }

    public void attack() {
        System.out.println(name + "attack enemy on " + strenght * level);
    }

    public void run() {
        System.out.println(name + " moved to speed " + speed);
    }

    public void getDamage(int incomingDamage) {
        float tmpDmg = incomingDamage - defence / 2;
        health -= tmpDmg;
        System.out.println(name + " get damage is " + tmpDmg);
    }

    public boolean isAlive() {
        return health > 0;
    }

}
