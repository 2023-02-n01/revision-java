package util;

import java.util.Random;

public class Randomiser {

    public static int randomizer(int min, int max){
        Random random = new Random();
        int nbAleatoire = random.nextInt(max - min + 1) + min;
        return nbAleatoire;
    }

}
