package Lesson_6;

public class Army {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior", 100, 35, 1.5f, 45, "Mail");
        warrior.attack();
        warrior.getDamage(900);
        warrior.run();
        System.out.println("Alive? " + warrior.isAlive());

        Archer archer = new Archer("Archer", 50, 100, 45, 65, 3f, "female");
        archer.attack();
        archer.getDamage(35);
        archer.escapeFormBattle();

    Mage mage = new Mage("Mage", 30, 60, 5.5f, "Male");
    mage.castFire();
    mage.castIce();
    mage.run();
    mage.getDamage(100);

    }

}
