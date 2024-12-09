package com.compagnie.aerienne;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    public Pilote(int id, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche, String licence, int heuresDeVol) {
        super(id, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }

    public void affecterVol(Vol vol) {
        System.out.println("Le vol " + vol.getNumeroVol() + " a été affecté au pilote " + getNom());
    }

    public String getLicence() { return licence; }
    public void setLicence(String licence) { this.licence = licence; }
    public int getHeuresDeVol() { return heuresDeVol; }
    public void setHeuresDeVol(int heuresDeVol) { this.heuresDeVol = heuresDeVol; }
}
