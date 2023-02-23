package jdr.entites.objets;

import java.util.Scanner;

import jdr.combatHandler.Menus.MenuCombat;
import jdr.entites.personnage.Personnage;

public class MenuObjets {

    public void main(Personnage personnage) {
        menuObjets(personnage);
    }
    public static PotionVie seringue = new PotionVie("Seringues", 5,3, 30);
    public static PotionVie medkit = new PotionVie("Medkits", 15,1, 80);
    public static PotionMana tomeMineur = new PotionMana("Tome Mineur", 20, 2, 30);
    public static PotionMana tomeMajeur = new PotionMana("Tome Majeur", 50,1, 80);
    public static PotionVie potionvieactive = new PotionVie(null,null,null,null);
    public static PotionMana potionmanaactive = new PotionMana(null,null,null,null);


    public static PotionMana getTomeMineur() {
        return tomeMineur;
    }

    public static void setTomeMineur(PotionMana tomeMineur) {
        MenuObjets.tomeMineur = tomeMineur;
    }

    public static PotionMana getTomeMajeur() {
        return tomeMajeur;
    }

    public static void setTomeMajeur(PotionMana tomeMajeur) {
        MenuObjets.tomeMajeur = tomeMajeur;
    }

    //Création des heals + switch pour choisir son heal
    private void menuObjets (Personnage personnage){
        System.out.println("1: Utiliser une seringue/ + 5 PV/ " + seringue.getNombre() + " seringues possédée(s)");
        System.out.println("2: Utiliser un Medkit/ + 15 PV/ "+ medkit.getNombre() + " medkits possédé(s)");
        System.out.println("3: Utiliser un Tome Mineur/ + 10 MP/ "+ tomeMineur.getNombre() + " Tomes Mineurs possédé(s)");
        System.out.println("4: Utiliser un Tome Majeur/ + 30 MP/ "+ tomeMajeur.getNombre() + " Tomes Majeurs possédé(s)");
        System.out.println("5: Retour");

        MenuCombat menuCombat = new MenuCombat();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {

            case 1:
                potionvieactive = seringue;
                seringue.potionMethod(personnage);

                break;

            case 2:
                potionvieactive = medkit;
                medkit.potionMethod(personnage);
                break;
            case 3:
                potionmanaactive = tomeMineur;
                tomeMineur.tomeMethod(personnage);
                break;
            case 4:
                potionmanaactive = tomeMajeur;
                tomeMajeur.tomeMethod(personnage);
                break;
            case 5:
                menuCombat.debutCombat();
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
        MenuObjets.seringue = seringue;
    }

    public PotionVie getMedkit() {
        return medkit;
    }

    public void setMedkit(PotionVie medkit) {
        MenuObjets.medkit = medkit;
    }

}
