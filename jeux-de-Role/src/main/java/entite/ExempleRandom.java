package entite;

import java.util.Random;

public class ExempleRandom {


    public static void main(String[] args) {
        // génération d'un nombre entre 12 et 18
        Random random = new Random();

        int force = random.nextInt(12, 18);
        System.out.println(force);


        int pointsVie = random.nextInt(20,50);
        System.out.println(pointsVie);

    }
    public static int randomizer(int min, int max){
        Random random = new Random();
        int nbAleatoire = random.nextInt(max - min + 1) + min;
        return nbAleatoire;
    }

}
