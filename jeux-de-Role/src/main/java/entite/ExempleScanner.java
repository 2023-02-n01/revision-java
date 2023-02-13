package entite;

import java.util.Scanner;

public class ExempleScanner {

    public static void main(String[] args) {
        int min = afficheNb();
        //System.out.println(min);
    }

    private static Integer afficheNb() {

        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        System.out.println(ExempleRandom.randomizer(max, min));
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
