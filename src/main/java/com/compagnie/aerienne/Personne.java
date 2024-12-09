package com.compagnie.aerienne;

public class Personne {
    private int id;
    private String nom;
    private String adresse;
    private String contact;

    public Personne(int id, String nom, String adresse, String contact) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public String obtenirInfos() {
        return "ID: " + id + ", Nom: " + nom + ", Adresse: " + adresse + ", Contact: " + contact;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
