package com.compagnie.aerienne;

public class Vol {
    private int numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private Aeroport aeroportDepart;
    private Aeroport aeroportArrivee;

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
    }

    public void setAeroportDepart(Aeroport aeroport) {
        this.aeroportDepart = aeroport;
        aeroport.ajouterVolDepart(this);
    }

    public void setAeroportArrivee(Aeroport aeroport) {
        this.aeroportArrivee = aeroport;
        aeroport.ajouterVolArrivee(this);
    }


    public int getNumeroVol() { return numeroVol; }
    public String getOrigine() { return origine; }
    public String getDestination() { return destination; }
    public String getDateHeureDepart() { return dateHeureDepart; }
    public String getDateHeureArrivee() { return dateHeureArrivee; }
    public String getEtat() { return etat; }
    public void setEtat(String etat) { this.etat = etat; }
}
