package com.compagnie.aerienne;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;
    private List<Vol> volsDepart;
    private List<Vol> volsArrivee;

    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
        this.volsDepart = new ArrayList<>();
        this.volsArrivee = new ArrayList<>();
    }

    public void ajouterVolDepart(Vol vol) {
        volsDepart.add(vol);
        System.out.println("Le vol " + vol.getNumeroVol() + " a été ajouté comme départ de l'aéroport " + nom);
    }

    public void ajouterVolArrivee(Vol vol) {
        volsArrivee.add(vol);
        System.out.println("Le vol " + vol.getNumeroVol() + " a été ajouté comme arrivée à l'aéroport " + nom);
    }

    public void afficherVols() {
        System.out.println("Vols au départ de " + nom + " :");
        for (Vol vol : volsDepart) {
            System.out.println("- Vol " + vol.getNumeroVol() + " à destination de " + vol.getDestination());
        }

        System.out.println("Vols à l'arrivée à " + nom + " :");
        for (Vol vol : volsArrivee) {
            System.out.println("- Vol " + vol.getNumeroVol() + " en provenance de " + vol.getOrigine());
        }
    }

    // Getters et setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
