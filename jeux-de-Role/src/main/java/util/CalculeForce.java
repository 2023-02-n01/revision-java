package util;

import entite.Monstre;
import entite.Personnage;

public class CalculeForce {
    int calculeAttaqPersonnage;
    int calculeAttaqMonstre;
    int plusFort;
    int quantiteDegats;
    public void calculerForce(Personnage personnage, Monstre monstre) {

        do {
            calculeAttaqPersonnage = personnage.getForce() + Randomiser.randomizer(1, 10);
            calculeAttaqMonstre = monstre.getForce() + Randomiser.randomizer(1, 10);

            plusFort = Math.max(calculeAttaqPersonnage, calculeAttaqMonstre);

            // Celui dont l’attaque est la plus forte remporte le tour;

            if (plusFort == calculeAttaqMonstre){

                quantiteDegats = calculeAttaqMonstre - calculeAttaqPersonnage;
                personnage.setPointsDeVie(personnage.getPointsDeVie() - quantiteDegats);


                System.out.println("Points de vie Personnage :" + personnage.getPointsDeVie());

            } else if (plusFort == calculeAttaqPersonnage) {
                personnage.setScore(personnage.getScore() + monstre.getScore());
                quantiteDegats = calculeAttaqPersonnage - calculeAttaqMonstre;
                monstre.setPointsDeVie(monstre.getPointsDeVie() - quantiteDegats);

                System.out.println("Points de vie Monstre :" + monstre.getPointsDeVie());

            } else {
                System.out.println("Egalite");
            }

            if (plusFort == calculeAttaqPersonnage) {
                System.out.println("Le vainqueur est : " + personnage.getNom() + " *** Score : " + personnage.getScore());
            } else {
                System.out.println("Le vainqueur est : " + monstre);
            }
        } while (personnage.getPointsDeVie() > 0 && monstre.getPointsDeVie() > 0);
    }
}
