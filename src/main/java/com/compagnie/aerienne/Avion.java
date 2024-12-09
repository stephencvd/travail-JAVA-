package com.compagnie.aerienne;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private boolean disponible;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.disponible = true;
    }

    public void affecterVol(Vol vol) {
        if (disponible) {
            disponible = false;
            System.out.println("L'avion " + immatriculation + " est affecté au vol " + vol.getNumeroVol());
        } else {
            System.out.println("L'avion " + immatriculation + " n'est pas disponible pour le vol " + vol.getNumeroVol());
        }
    }

    public void liberer() {
        disponible = true;
        System.out.println("L'avion " + immatriculation + " est maintenant disponible.");
    }

    public void verifierDisponibilite() {
        if (disponible) {
            System.out.println("L'avion " + immatriculation + " est disponible.");
        } else {
            System.out.println("L'avion " + immatriculation + " est déjà utilisé.");
        }
    }

    // Getters et setters
    public String getImmatriculation() { return immatriculation; }
    public void setImmatriculation(String immatriculation) { this.immatriculation = immatriculation; }
    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }
    public int getCapacite() { return capacite; }
    public void setCapacite(int capacite) { this.capacite = capacite; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}
