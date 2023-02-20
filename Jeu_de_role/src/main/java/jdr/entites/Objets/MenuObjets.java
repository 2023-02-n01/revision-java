package jdr.entites.Objets;

import java.util.Scanner;

import jdr.entites.Personnage;
import jdr.entites.Objets.PotionVie.*;

public class MenuObjets {

    public void main(Personnage personnage) {
        menuObjets(personnage);
    }
    static PotionVie seringue = new PotionVie("Seringues", 5,3);
    static PotionVie medkit = new PotionVie("Medkits", 15,1);
    int moins1 = 1;


    //Création des heals + switch pour choisir son heal
    private void menuObjets (Personnage personnage){
        System.out.println("1: Utiliser une seringue/ + 5 PV");
        System.out.println("2: Utiliser un Medkit/ + 15 PV");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {

            case 1:
                seringue.potionMethod(personnage);
                break;

            case 2:
                medkit.potionMethod(personnage);
                break;
        }


    }
    public PotionVie getSeringue() {
        return seringue;
    }

    public void setSeringue(PotionVie seringue) {
        this.seringue = seringue;
    }

    public PotionVie getMedkit() {
        return medkit;
    }

    public void setMedkit(PotionVie medkit) {
        this.medkit = medkit;
    }
}
