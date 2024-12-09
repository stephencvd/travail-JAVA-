package com.compagnie.aerienne;

public class Passager extends Personne {
    private String passport;

    public Passager(int id, String nom, String adresse, String contact, String passport) {
        super(id, nom, adresse, contact);
        this.passport = passport;
    }

    public void reserverVol() {
        System.out.println("Réservation d'un vol par le passager " + getNom());
    }

    public void annulerReservation() {
        System.out.println("Annulation de la réservation pour le passager " + getNom());
    }

    public String obtenirReservations() {
        return "Liste des réservations pour " + getNom();
    }

    public String getPassport() { return passport; }
    public void setPassport(String passport) { this.passport = passport; }
}
