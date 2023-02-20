package jdr.entites.Objets;
import jdr.combathandler.MenuCombat;
import jdr.entites.Personnage;
import jdr.combathandler.MenuCombat.*;
import jdr.MenuPrincipal.*;
import jdr.entites.Objets.MenuObjets.*;

public class PotionVie {

    private String nom;
    private Integer pointsDV;
    private Integer nombre;
    //public static Integer nombre2;

    public PotionVie(String nom, Integer pointsDV, Integer nombre) {

        this.nom = nom;
        this.pointsDV = pointsDV;
        this.nombre = nombre;
    }
//Méthode de Heal (utilisée avec seringues ou Medkits)
    public void potionMethod(Personnage personnage) {
        MenuCombat lancementCombat = new MenuCombat();
        if (nombre > 0) {
            personnage.setPointsDV(personnage.getPointsDV() + pointsDV);
            nombre--;
            System.out.println("Vous avez récupéré: "+ pointsDV +  "PV!");
            System.out.println(nom + " restantes: " + nombre);
            if (MenuObjets.seringue != null){
            MenuObjets.seringue.setNombre(nombre);
            } else if (MenuObjets.medkit != null) {
                MenuObjets.medkit.setNombre(nombre);

            }
            lancementCombat.debutCombat();
        }else{
            System.out.println("Vous n'avez plus de" + nom +"!");
            System.out.println(nom + " restantes " + nombre);
            lancementCombat.debutCombat();
        }
    }

  /*  public void medkitMethod (Personnage personnage) {
        if (nombre > 0) {
            personnage.setPointsDV(personnage.getPointsDV() + pointsDV);
            medkit.setNombre(medkit.getNombre() - 1);
            System.out.println("Vous avez récupéré 15 PV!!");
            System.out.println("Medkits restants" + medkit.getNombre());
        }else{
            System.out.println("Vous n'avez plus de Medkits!");
            System.out.println("Medkits restants" + medkit.getNombre());
        }
    }*/




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPointsDV() {
        return pointsDV;
    }

    public void setPointsDV(Integer pointsDV) {
        this.pointsDV = pointsDV;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }
}