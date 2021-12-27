package Lesson_6;

public class Mage {

    private String name;
    private float health;
    private int mana;
    private float speed;
    private String gender;
    private int level;

    private int costFire = 20;
    private int costIce = 40;

    public Mage(String name, float health, int mana, float speed, String gender) {
        this.level = 10;
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.speed = speed;
        this.gender = gender;


    }

    public void castFire() {
        if (mana >= costFire) {
            mana -= costFire;
            System.out.println(name + " created fire");
        } else {
            System.out.println(name + " not enought mana > " + mana + "/" + costFire);
        }
    }

    public void castIce() {
        if (mana >= costIce) {
            mana -= costIce;
            System.out.println(name + " created ice");
        } else {
            System.out.println(name + " not enought mana > " + mana + "/" + costIce);
        }
    }

    public void run() {
        System.out.println(name + "moved on speed " + speed);
    }

    public void getDamage(int incomingDamage) {
        health -= incomingDamage;
        System.out.println(name + " get damage " + incomingDamage + " point");
    }

}


