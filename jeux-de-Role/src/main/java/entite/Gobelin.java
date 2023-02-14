package entite;

import Exemple.ExempleRandom;
import util.Randomiser;

public class Gobelin extends Monstre {
    public Gobelin(){
        this.setForce(Randomiser.randomizer(5, 10));
        this.setPointsDeVie(Randomiser.randomizer(10, 15));
    }

    @Override
    public String toString() {
        return "**** Gobellin " + " " +
                "force = " + getForce() +
                ", pointsDeVie = " + getPointsDeVie();
    }
}
