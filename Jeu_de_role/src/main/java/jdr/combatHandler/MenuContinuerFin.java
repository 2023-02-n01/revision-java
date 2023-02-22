package jdr.combatHandler;

import jdr.MenuPrincipal;

import java.util.Scanner;
import jdr.entites.shopHandler.Shop;

import static jdr.entites.personnage.CreationPersonnage.personnage;

public class MenuContinuerFin {

    public static void main(String[] args) {

    }

    public static void continueMenu(){
        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Continuer à se battre  Pv restants :" + personnage.getPointsDV());
        System.out.println("2: Battre en retraite (+10 points)");
        System.out.println("3: Afficher Score, Gils");
        input = scanner.nextInt();
        switch (input){
            case 1:
                MenuCombat lancementCombat = new MenuCombat();
                lancementCombat.debutCombat();
                break;
            case 2:
                finRetraite();
                //Créer méthode sortie de combat + incrémentation score
            case 3:
                System.out.println("Votre score est de : " + personnage.getScore());
                System.out.println("Vous avez " + personnage.getGils() + " Gils");
                System.out.println("Monstres battus : " + MenuCombat.monstresBattus);
                System.out.println("======================================");
                continueMenu();
            default:
                System.out.println("! Choix invalide, veuillez réessayer ! \n");

                continueMenu();
        }
    }

    public static void rencontreShop(){
        int random;
        String input;
        Scanner scanner = new Scanner(System.in);
        random = Randomiser.randomizer(1,10);
        Shop shop = new Shop();
        if (random >= 6){
            System.out.println(" ");
            System.out.println("( ˇ෴ˇ ) $$$");
            System.out.println("Vous passez devant un magasin, voulez vous entrer? 'y' 'n' ");
            input = scanner.nextLine();
            switch (input) {
                case "y" -> shop.optionsShop();
                case "n" -> continueMenu();
            }


        }else {
            continueMenu();
        }
    }

    private static void finRetraite(){
        personnage.setScore(personnage.getScore() + 10);
        System.out.println("Vous choisissez de rebrousser chemin et de garder votre vie.");
        System.out.println("Votre score final est de :"+ personnage.getScore());
        System.out.println("Monstres battus : " + MenuCombat.monstresBattus);
        System.exit(0);

    }
}
