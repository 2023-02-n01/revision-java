package jdr.entites.Objets;

import java.util.Scanner;

import jdr.entites.personnage.Personnage;

public class MenuObjets {

    public void main(Personnage personnage) {
        menuObjets(personnage);
    }
    static PotionVie seringue = new PotionVie("Seringues", 5,3);
    static PotionVie medkit = new PotionVie("Medkits", 15,1);
    static PotionMana tomeMineur = new PotionMana("Tome Mineur", 20, 2);
    static PotionMana tomeMajeur = new PotionMana("Tome Majeur", 50,1);

    int moins1 = 1;


    //Création des heals + switch pour choisir son heal
    private void menuObjets (Personnage personnage){
        System.out.println("1: Utiliser une seringue/ + 5 PV");
        System.out.println("2: Utiliser un Medkit/ + 15 PV");
        System.out.println("3: Utiliser un Tome Mineur/ + 10 MP");
        System.out.println("4: Utiliser un Tome Majeur/ + 30 MP");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {

            case 1:
                seringue.potionMethod(personnage);
                break;

            case 2:
                medkit.potionMethod(personnage);
                break;
            case 3:
                tomeMineur.tomeMethod(personnage);
                break;
            case 4:
                tomeMajeur.tomeMethod(personnage);
                break;
            default:
                System.out.println("! Choix invalide, veuillez réessayer!");
                System.out.println("=====================================");
                menuObjets(personnage);
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
