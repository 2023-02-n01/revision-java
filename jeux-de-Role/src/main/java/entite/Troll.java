package entite;

import Exemple.ExempleRandom;
import util.Randomiser;

public class Troll extends Monstre{
    public Troll() {
        this.setForce(Randomiser.randomizer(10, 15));
        this.setPointsDeVie(Randomiser.randomizer(20, 30));
    }

    @Override
    public String toString() {
        return "**** Troll " + " " +
                "force = " + getForce() +
                ", pointsDeVie = " + getPointsDeVie();
    }
}
