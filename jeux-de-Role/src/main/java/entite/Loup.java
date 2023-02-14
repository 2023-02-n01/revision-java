package entite;

import Exemple.ExempleRandom;

public class Loup {


    public static void afficherCreature() {

        CaracteristiqueCreature newCreature = new CaracteristiqueCreature();
            newCreature.setCreature("Loup");
            newCreature.setForce(ExempleRandom.randomizer(3, 8));
            newCreature.setPointsVie(ExempleRandom.randomizer(5, 10));

            System.out.println(newCreature);
    }
}
