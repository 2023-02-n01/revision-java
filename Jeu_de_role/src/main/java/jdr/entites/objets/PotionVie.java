package jdr.entites.objets;
import jdr.combatHandler.Menus.MenuCombat;
import jdr.entites.personnage.CreationPersonnage;
import jdr.entites.personnage.Personnage;
import jdr.entites.shopHandler.Shop;

import static jdr.entites.objets.MenuObjets.medkit;
import static jdr.entites.objets.MenuObjets.seringue;

public class PotionVie {

    private String nom;
    private Integer pointsDV;
    private Integer nombre;
    private Integer gils;
    private Integer pointsMana;
    //public static Integer nombre2;


    public PotionVie(String nom, Integer pointsDV, Integer nombre, Integer gils) {
        this.nom = nom;
        this.pointsDV = pointsDV;
        this.nombre = nombre;
        this.gils = gils;
    }

    //Méthode de Heal (utilisée avec seringues ou Medkits)
    public void potionMethod(Personnage personnage) {
        MenuCombat lancementCombat = new MenuCombat();

        if (seringue == MenuObjets.potionvieactive && seringue.nombre > 0) {
            personnage.setPointsDV(personnage.getPointsDV() + seringue.pointsDV);

            seringue.setNombre(seringue.getNombre() - 1);
            System.out.println("Vous avez récupéré: "+ pointsDV +  "PV!");
            System.out.println(nom + " restantes: " + seringue.nombre);
            lancementCombat.debutCombat();
            } else if (medkit == MenuObjets.potionvieactive && medkit.nombre > 0){
                personnage.setPointsDV(personnage.getPointsDV() + pointsDV);
                medkit.setNombre(medkit.getNombre() - 1);
                System.out.println("Vous avez récupéré: "+ pointsDV +  "PV!");
                System.out.println(nom + " restants: " + medkit.nombre);
                lancementCombat.debutCombat();

            }else {
                System.out.println("Vous n'avez plus de " + nom +"!");
                System.out.println(nom + " restantes " + nombre);
                lancementCombat.debutCombat();

            }
        }


    public void acheterPV(PotionVie potionVie){
        Shop shop = new Shop();

        if(potionVie == seringue && CreationPersonnage.personnage.getGils() >= seringue.getGils()){
            seringue.setNombre(seringue.getNombre() + 1);
            CreationPersonnage.personnage.setGils(CreationPersonnage.personnage.getGils() - seringue.getGils());
            System.out.println(seringue.getGils() +" G payés " + CreationPersonnage.personnage.getGils() + " G Restants" );

        } else if (potionVie == MenuObjets.medkit && MenuObjets.medkit !=null && CreationPersonnage.personnage.getGils() >= MenuObjets.medkit.getGils()) {
            MenuObjets.medkit.setNombre(MenuObjets.medkit.getNombre() + 1);
            CreationPersonnage.personnage.setGils(CreationPersonnage.personnage.getGils() - MenuObjets.medkit.getGils());
            System.out.println(MenuObjets.medkit.getGils() +" G payés " + CreationPersonnage.personnage.getGils() + " G Restants" );

        } else {
            System.out.println("Vous n'avez pas assez de Gils!");
            System.out.println(" ");
            shop.optionsShop();
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


    public Integer getPointsDV() {
        return pointsDV;
    }

    public void setPointsDV(Integer pointsDV) {
        this.pointsDV = pointsDV;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getGils() {
        return gils;
    }

    public void setGils(Integer gils) {
        this.gils = gils;
    }

    public Integer getPointsMana() {
        return pointsMana;
    }

    public void setPointsMana(Integer pointsMana) {
        this.pointsMana = pointsMana;
    }
}