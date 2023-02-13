import entite.Personnage1;

import java.util.Scanner;

public class JeuxDeRole {

    public static void main(String[] args) {

        System.out.println("1. Créer un personnage");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Choix 1 : ");
                    Personnage1.main();
                    break;

        }
    }
}
