import java.util.Random;
import java.util.Scanner;

public class ExempleRandomiser {

    public static void main(String[] args) {
        Integer numMin;
        Integer numMax;

        Scanner numScan = new Scanner(System.in);
        System.out.println("Veuillez entrer la valeur Minimum: ");
        numMin = numScan.nextInt();
        System.out.println("Veuillez entrer la valeur Maximum: ");
        numMax = numScan.nextInt();

        Random ran = new Random();
        int result = ran.nextInt((numMax-numMin)+1) +numMin ;


        System.out.println("Resultat : " + result);
    }
}
