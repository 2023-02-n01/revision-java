package jdr.entites.creatures;

import jdr.combathandler.Randomiser;

public class CreationCreatures {



    public static Loup creationLoup() {
        Loup loup = new Loup("Loup ",0,0, 1);
        loup.setForce(Randomiser.randomizer(3, 8));
        loup.setPointsDV(Randomiser.randomizer(5, 10));
        System.out.println(loup);
        return loup;
    }

    public static Gobelin creationGobelin(){
        Gobelin gobelin = new Gobelin("Gobelin ",0,0, 2);
        gobelin.setForce(Randomiser.randomizer(5, 10));
        gobelin.setPointsDV(Randomiser.randomizer(10, 15));
        System.out.println(gobelin);
        return gobelin;
    }

    public static Troll creationTroll() {
        Troll troll = new Troll("Troll ",0,0, 5);
        troll.setForce(Randomiser.randomizer(10, 15));
        troll.setPointsDV(Randomiser.randomizer(20, 30));
        System.out.println(troll);
        return troll;
    }

}
