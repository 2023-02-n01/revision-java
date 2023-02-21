package jdr.entites.personnage;

import jdr.combathandler.Randomiser;
import jdr.MenuPrincipal;
import jdr.combathandler.SaisieUtilisateur;

import java.util.Scanner;

public class CreationPersonnage {

    public void main(String[] args) {
        nouveauPerso();


    }

    public static Personnage personnage = new Personnage();

    public static Personnage getPersonnage() {
        return personnage;
    }

    public static void setPersonnage(Personnage personnage) {
        CreationPersonnage.personnage = personnage;
    }

    public static Personnage nouveauPerso(){
        personnage.setNom(SaisieUtilisateur.main());
        personnage.setForce(Randomiser.randomizer(12, 18));
        personnage.setScore(0);
        personnage.setPointsDV(Randomiser.randomizer(20, 50));
        personnage.setMana(100);

        System.out.println(personnage);
        refairePerso();
        return personnage;
    }



    private static void refairePerso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez vous créer un nouveau personnage?'y' 'n' ");
        String yesNo ;
        yesNo = scanner.nextLine();
        switch (yesNo) {
            case "y" -> nouveauPerso();
            case "n" -> {System.out.println("Retour au menu");
            MenuPrincipal.choixMenu();}
            default -> {System.out.println("! Choix invalide, veuillez réessayer !" );
            refairePerso();}
        }

    }
}
