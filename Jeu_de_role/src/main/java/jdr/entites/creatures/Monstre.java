package jdr.entites.creatures;

import jdr.entites.global.EtreVivant;

public class Monstre extends EtreVivant {



    public Monstre(String nom, Integer force, Integer pointsDV, Integer score, Integer gils) {

        super(nom, force, pointsDV, score, gils);



    }
   

    @Override
    public String toString() {
        return "Monstre{" +
                "nom=" + super.getNom() +
                ", force=" + super.getForce() +
                ", PointsDV=" + super.getPointsDV() +
                ", score=" + super.getScore() +
                ", gils=" + super.getGils() +
                '}';


    }

}
