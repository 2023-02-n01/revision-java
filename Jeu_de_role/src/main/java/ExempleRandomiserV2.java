import java.util.Random;
import java.util.Scanner;

public class ExempleRandomiserV2 {

    public static void main(String[] args) {

        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
        System.out.println(randomizer(12, 18));
    }


    private static int randomizer(int min, int max) {
        Random ran = new Random();
        int result = ran.nextInt((max-min)+1) + min;
        return result;
    }

}
