package entite;

import Exemple.ExempleRandom;
import util.Randomiser;

public class Loup extends Monstre {
    public Loup() {
        this.setForce(Randomiser.randomizer(3, 8));
        this.setPointsDeVie(Randomiser.randomizer(5, 10));
    }

    @Override
    public String toString() {
        return "**** Loup " + " " +
                "force = " + getForce() +
                ", pointsDeVie = " + getPointsDeVie();
    }
}
