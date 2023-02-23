package jdr.entites.shopHandler;
import jdr.combatHandler.Menus.MenuContinuerFin;
import jdr.entites.personnage.CreationPersonnage;
import jdr.entites.objets.MenuObjets;

import java.util.Scanner;

public class Shop {

    private Integer prix;
    private Integer nombre;




    public void optionsShop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Argent de " + CreationPersonnage.personnage.getNom() + " = " + CreationPersonnage.personnage.getGils() + " G" );
        System.out.println("1: Acheter une seringue/ + 5 PV/ 30 gils");
        System.out.println("2: Acheter un Medkit/ + 15 PV/ 80 gils");
        System.out.println("3: Acheter un Tome Mineur/ + 10 MP/ 30 gils");
        System.out.println("4: Acheter un Tome Majeur/ + 30 MP/ 80 gils");
        System.out.println("5: Sortir de la boutique");
        int input = scanner.nextInt();
        switch (input) {

            case 1:
                MenuObjets.seringue.acheterPV(MenuObjets.seringue);
                shopMore();
                break;
            case 2:
                MenuObjets.medkit.acheterPV(MenuObjets.medkit);
                shopMore();
                break;
            case 3:
                MenuObjets.tomeMineur.acheterMana(MenuObjets.tomeMineur);
                shopMore();
                break;
            case 4:
                MenuObjets.tomeMajeur.acheterMana(MenuObjets.tomeMajeur);
                shopMore();
                break;
            case 5:
                MenuContinuerFin.continueMenu();
            default:
                System.out.println("! Choix invalide, veuillez réessayer !");
                optionsShop();
        }
    }

    private void shopMore(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Merci! Souhaitez vous autre chose? ");
        System.out.println("1: Rester dans la boutique");
        System.out.println("2: Quitter la boutique");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                optionsShop();
                break;
            case 2:
                MenuContinuerFin.continueMenu();
                break;
            default:
                System.out.println("! Choix invalide, veuillez réessayer !");
                shopMore();
        }



    }


}
