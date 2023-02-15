package jdr.entites.creatures;

import jdr.entites.global.EtreVivant;

import java.util.HashSet;

public class Monstre extends EtreVivant {



    public Monstre(String nom, Integer force, Integer pointsDV) {

        super(nom, force, pointsDV);



    }
   

    @Override
    public String toString() {
        return "Monstre{" +
                "nom=" + super.getNom() +
                "force=" + super.getForce() +
                ", PointsDV=" + super.getPointsDV() +
                '}';


    }

}
