package jdr.entites.global;

public abstract class PotionParent {

    private String nom;
    private Integer nombre;
    private Integer gils;


    public PotionParent(String nom, Integer nombre, Integer gils) {
        this.nom = nom;
        this.nombre = nombre;
        this.gils = gils;

    }

    @Override
    public String toString() {
        return "PotionParent{" +
                "nom='" + nom + '\'' +
                ", nombre=" + nombre +
                ", gils=" + gils +
                '}';
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


}
