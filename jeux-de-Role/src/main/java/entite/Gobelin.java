package entite;

import Exemple.ExempleRandom;

public class Gobelin {
    public static void main(String[] args) {
        CaracteristiqueCreature newCreature = new CaracteristiqueCreature();

        newCreature.setCreature("Gobelin");
        newCreature.setForce(ExempleRandom.randomizer(5, 10));
        newCreature.setPointsVie(ExempleRandom.randomizer(10, 15));

        System.out.println(newCreature);
    }
}
