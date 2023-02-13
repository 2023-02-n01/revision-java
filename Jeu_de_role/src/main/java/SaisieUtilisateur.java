import java.util.Scanner;

public class SaisieUtilisateur {

    public static String main() {

        String nom = scanNom();


        System.out.println("Nom du joueur : " + nom);
        return nom;
    }


    private static String scanNom() {
        String scan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre nom: ");
        scan = scanner.nextLine();
        return scan;
    }

/* Exemples Scan value min/max
    private static int scanMin() {
        int numMin;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer la valeur Minimum: ");
        numMin = scanner.nextInt();
        return numMin;
    }

    private static int scanMax(){
        int numMax;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer la valeur Maximum: ");
        numMax = scanner.nextInt();
        return numMax;
        // numMax = numScan.nextInt();

    }*/


}
