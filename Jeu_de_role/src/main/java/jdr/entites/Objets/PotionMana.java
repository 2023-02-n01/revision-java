package jdr.entites.Objets;

import jdr.combathandler.Attaque.MenuCombat;
import jdr.entites.personnage.Personnage;

public class PotionMana {

    String nom;
    Integer pointsMana;
    Integer nombre;

    public PotionMana(String nom, Integer pointsMana, Integer nombre){
        this.nom = nom;
        this.pointsMana = pointsMana;
        this.nombre = nombre;
    }

    public void tomeMethod(Personnage personnage) {
        MenuCombat lancementCombat = new MenuCombat();
        if (nombre > 0) {
            personnage.setMana(personnage.getMana() + pointsMana);
            nombre--;
            System.out.println("Vous avez récupéré: "+ pointsMana +  " points de Mana!");
            System.out.println(nom + " restantes: " + nombre);
            if (MenuObjets.tomeMineur != null){
                MenuObjets.tomeMineur.setNombre(nombre);
            } else if (MenuObjets.medkit != null) {
                MenuObjets.tomeMajeur.setNombre(nombre);

            }
            lancementCombat.debutCombat();
        }else{
            System.out.println("Vous n'avez plus de " + nom +"!");
            System.out.println(nom + " restantes " + nombre);
            lancementCombat.debutCombat();
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPointsMana() {
        return pointsMana;
    }

    public void setPointsMana(Integer pointsMana) {
        this.pointsMana = pointsMana;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }



}
