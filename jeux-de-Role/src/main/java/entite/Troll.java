package entite;

import Exemple.ExempleRandom;

public class Troll {
    public static void main(String[] args) {
        CaracteristiqueCreature newCreature = new CaracteristiqueCreature();

        newCreature.setCreature("Troll");
        newCreature.setForce(ExempleRandom.randomizer(10, 15));
        newCreature.setPointsVie(ExempleRandom.randomizer(20, 30));

        System.out.println(newCreature);
    }
}
