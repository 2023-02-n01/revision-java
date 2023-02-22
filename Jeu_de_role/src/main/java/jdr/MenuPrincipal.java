package jdr;

import jdr.combatHandler.MenuCombat;
import jdr.entites.personnage.CreationPersonnage;

import java.util.Scanner;

import static jdr.entites.personnage.CreationPersonnage.personnage;


public class MenuPrincipal {


    public static void main(String[] args) {
        choixMenu();

    }
// Menu Principal (Creation perso, début du jeu, Score, Quitter le jeu)
    public static void choixMenu() {
        System.out.println("Menu:");
        System.out.println("1: Créer Personnage");
        System.out.println("2: Commencer l'Aventure");
        System.out.println("3: Afficher le Score, Gils");
        System.out.println("4: Quitter le jeu :(");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);
        int choix;

        while (true) {
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    CreationPersonnage.nouveauPerso();
                    break;

                case 2:
                    MenuCombat lancementCombat = new MenuCombat();
                    lancementCombat.debutCombat();
                    break;
                case 3:

                    System.out.println("Votre score est de : " + CreationPersonnage.personnage.getScore());
                    System.out.println("Monstres battus : " + MenuCombat.monstresBattus);
                    System.out.println("Vous avez " + personnage.getGils() + " Gils \n");
                    System.out.println("Retour au menu");
                    System.out.println("======================================");

                    choixMenu();

                case 4:
                    System.out.println("Merci d'avoir joué! <3");
                    System.exit(0);
                    break;

                default:
                    System.out.println("! Choix invalide, veuillez réessayer !");
                    System.out.println("======================================");

                    choixMenu();
                    break;

            }
        }
    }
}