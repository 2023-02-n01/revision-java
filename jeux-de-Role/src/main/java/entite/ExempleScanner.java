package entite;

import java.util.Scanner;

public class ExempleScanner {

    public static void main(String[] args) {
        String nom = afficheNom();
        int min = afficheNb();
        //System.out.println(min);
    }

    public static String afficheNom(){
        System.out.println("Entrer le nom d'un personnage : ");
        Scanner sc = new Scanner(System.in);
        String nom = sc.next();

        System.out.println("Nom du personnage : " + " " + nom);

        return nom;
    }

    public static Integer afficheNb() {

        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        System.out.println(ExempleRandom.randomizer(min, max));

//        System.out.println(ExempleRandom.randomizer(max, min));
//        System.out.println(ExempleRandom.randomizer(max, min));
//        System.out.println(ExempleRandom.randomizer(max, min));
//        System.out.println(ExempleRandom.randomizer(max, min));
//        System.out.println(ExempleRandom.randomizer(max, min));
//        System.out.println(ExempleRandom.randomizer(max, min));
//        System.out.println(ExempleRandom.randomizer(max, min));


        return min;

    }
}
