package jdr.entites.personnage;

import jdr.combatHandler.Menus.MenuCombat;
import jdr.combatHandler.Randomiser;
import jdr.MenuPrincipal;
import jdr.combatHandler.SaisieUtilisateur;

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
        personnage.setGils(50);
        MenuCombat.monstresBattus = 0;

        System.out.println(personnage);
        refairePerso();
        return personnage;
    }



    private static void refairePerso() {
        MenuCombat lancementCombat = new MenuCombat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez vous recréer un personnage avec de nouvelles stats?'y' 'n' ");
        String yesNo ;
        yesNo = scanner.nextLine();
        switch (yesNo) {
            case "y" -> nouveauPerso();
            case "n" -> {System.out.println("Début de l'aventure");
            lancementCombat.debutCombat();}
            default -> {System.out.println("! Choix invalide, veuillez réessayer !" );
            refairePerso();}
        }

    }
}
