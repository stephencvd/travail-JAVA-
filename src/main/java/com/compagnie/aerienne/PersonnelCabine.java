package com.compagnie.aerienne;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(int id, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche, String qualification) {
        super(id, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel Cabine";
    }

    public void affecterVol(Vol vol) {
        System.out.println("Le vol " + vol.getNumeroVol() + " a été affecté au personnel cabine " + getNom());
    }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }
}
