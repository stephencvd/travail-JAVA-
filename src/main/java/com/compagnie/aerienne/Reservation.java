package com.compagnie.aerienne;

public class Reservation {
    private int numeroReservation;
    private String dateReservation;
    private String statut;

    public Reservation(int numeroReservation, String dateReservation, String statut) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public void confirmerReservation() {
        statut = "Confirmée";
        System.out.println("Réservation " + numeroReservation + " confirmée.");
    }

    public void annulerReservation() {
        statut = "Annulée";
        System.out.println("Réservation " + numeroReservation + " annulée.");
    }

    public void modifierReservation(String nouveauStatut) {
        statut = nouveauStatut;
        System.out.println("Statut de la réservation " + numeroReservation + " modifié en : " + nouveauStatut);
    }


    public int getNumeroReservation() { return numeroReservation; }
    public void setNumeroReservation(int numeroReservation) { this.numeroReservation = numeroReservation; }
    public String getDateReservation() { return dateReservation; }
    public void setDateReservation(String dateReservation) { this.dateReservation = dateReservation; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
}
