package entite;

import Exemple.Personnage;

public abstract class EtreVivant {
    private Integer force;
    private Integer pointsDeVie;

    public EtreVivant() {
    }

    public Integer getForce() {
        return force;
    }

    public void setForce(Integer force) {
        this.force = force;
    }

    public Integer getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(Integer pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

}
