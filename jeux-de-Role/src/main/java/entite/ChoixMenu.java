package entite;

public class ChoixMenu {

    public static void main(String[] args) {
       afficherMenu();
    }
    public static void afficherMenu(){
        System.out.println("Votre choix :");

        System.out.println("1 - Créer un personnage");
        System.out.println("2 - Combattre une créature");
        System.out.println("3 - Afficher score");
        System.out.println("4 - Sortir");
    }
}
