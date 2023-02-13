import entite.ChoixMenu;
import entite.Personnage1;

import java.util.Scanner;

public class JeuxDeRole {

    public static void main(String[] args) {

        ChoixMenu.afficherMenu();
        choix();

    }

    public static void choix(){
        Scanner sc = new Scanner(System.in);


        while (true){
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Choix 1 : ");
                    Personnage1.main();

                    ChoixMenu.afficherMenu();
                    break;

                case 2:
                    System.out.println("Choix 2 : ");
                    System.out.println("Vous avez choisi le ....");

                    ChoixMenu.afficherMenu();

                    break;

                case 3:
                    System.out.println("Choix 3 : ");
                    System.out.println("Votre score est de :" + " " + Personnage1.personnage1.getScore());

                    ChoixMenu.afficherMenu();
                    break;

                case 4:
                    System.out.println("Choix 4 : ");
                    System.out.println(" Sortir ");
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
