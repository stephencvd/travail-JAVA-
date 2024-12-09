package com.compagnie.aerienne;

public abstract class Employe extends Personne {
    private int numeroEmploye;
    private String dateEmbauche;

    public Employe(int id, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche) {
        super(id, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public abstract String obtenirRole();

    // Getters et setters
    public int getNumeroEmploye() { return numeroEmploye; }
    public void setNumeroEmploye(int numeroEmploye) { this.numeroEmploye = numeroEmploye; }
    public String getDateEmbauche() { return dateEmbauche; }
    public void setDateEmbauche(String dateEmbauche) { this.dateEmbauche = dateEmbauche; }
}
