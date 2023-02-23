package jdr;

import jdr.combatHandler.Menus.MenuCombat;
import jdr.entites.personnage.CreationPersonnage;

import java.util.Scanner;

import static jdr.entites.personnage.CreationPersonnage.personnage;


public class MenuPrincipal {


    public static void main(String[] args) {
        choixMenu();

    }
// Menu Principal (Creation perso, début du jeu, Score, Quitter le jeu)
    public static void choixMenu() {
        System.out.println("+===================================+");
        System.out.println("|  Menu:                            |");
        System.out.println("|  1: Commencer l'Aventure          |");
        System.out.println("|  2: Afficher le Score, Gils, Aide |");
        System.out.println("|  3: Quitter le jeu :(             |");
        System.out.println("+===================================+");

        Scanner scanner = new Scanner(System.in);
        int choix;

        while (true) {
            choix = scanner.nextInt();

            switch (choix) {

                case 1:
                    if(personnage.getNom() == null ) {
                        CreationPersonnage.nouveauPerso();
                    }else{
                        MenuCombat lancementCombat = new MenuCombat();
                        lancementCombat.debutCombat();
                    }
                    break;
                case 2:
                    System.out.println("| Aide:");
                    System.out.println("| Début de partie: Afin de lancer une partie veuillez créer un personnage, le valider puis 'Commencer l'aventure'");
                    System.out.println("");
                    System.out.println("| Attaque: Chaque attaque prend en compte la force du personnage créé et un jet de dés (varie selon l'attaque)");
                    System.out.println("| qui ajoutera sa valeur à la force initiale, la force finale du joueur et du monstre est ensuite comparée");
                    System.out.println("| et le perdant du combat perd la différence en PV");
                    System.out.println("+=============================+");
                    System.out.println("|Votre score est de : " + CreationPersonnage.personnage.getScore());
                    System.out.println("|Monstres battus : " + MenuCombat.monstresBattus);
                    System.out.println("|Vous avez " + personnage.getGils() + " Gils");
                    System.out.println("+=============================+");
                    System.out.println("Retour au menu");
                    choixMenu();

                case 3:
                    System.out.println("Merci d'avoir joué! <3");
                    System.out.println("Score final: " + personnage.getScore());
                    System.exit(0);
                    break;

                default:
                    System.out.println("+======================================+");
                    System.out.println("|! Choix invalide, veuillez réessayer !|");
                    System.out.println("+======================================+");

                    choixMenu();
                    break;

            }
        }
    }
}