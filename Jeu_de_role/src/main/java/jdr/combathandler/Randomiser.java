package jdr.combathandler;

import java.util.Random;

public class Randomiser {

    public static void main(String[] args) {

        int force = randomizer(12, 18);
        int pdv = randomizer(20, 50);


    }


    public static int randomizer(int min, int max) {
        Random ran = new Random();
        int result = ran.nextInt((max-min)+1) + min;
        return result;
    }

}
