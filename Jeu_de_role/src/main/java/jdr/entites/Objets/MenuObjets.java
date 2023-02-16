package jdr.entites.Objets;

import java.util.Scanner;

import jdr.entites.Personnage;

public class MenuObjets {

    public void main(Personnage personnage) {
        menuObjets(personnage);
    }


    private void menuObjets (Personnage personnage){
        System.out.println("1: Utiliser une seringue/ + 5 PV");
        System.out.println("2: Utiliser un Medkit/ + 15 PV");
        Scanner scanner = new Scanner(System.in);
        PotionVie potion = new PotionVie("seringue", 5,3);
        PotionVie medkit = new PotionVie("medkit", 15,1);
        int input = scanner.nextInt();
        switch (input) {

            case 1:
                potion.potionMethod(personnage);
                break;

            case 2:
                medkit.potionMethod(personnage);
                break;
        }


    }
}
