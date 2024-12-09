package com.compagnie.aerienne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Personne> personnes = new ArrayList<>();
        List<Vol> vols = new ArrayList<>();
        List<Avion> avions = new ArrayList<>();
        List<Aeroport> aeroports = new ArrayList<>();
        List<Reservation> reservations = new ArrayList<>();

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Ajouter un passager");
            System.out.println("2. Ajouter un pilote");
            System.out.println("3. Ajouter un personnel cabine");
            System.out.println("4. Ajouter un vol");
            System.out.println("5. Ajouter un avion");
            System.out.println("6. Ajouter un aéroport");
            System.out.println("7. Réserver un vol pour un passager");
            System.out.println("8. Afficher les statistiques des vols");
            System.out.println("9. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom : ");
                    String nomPassager = scanner.nextLine();
                    System.out.print("Adresse : ");
                    String adressePassager = scanner.nextLine();
                    System.out.print("Contact : ");
                    String contactPassager = scanner.nextLine();
                    System.out.print("Numéro de passeport : ");
                    String passport = scanner.nextLine();
                    personnes.add(new Passager(personnes.size() + 1, nomPassager, adressePassager, contactPassager, passport));
                    break;

                case 2:
                    System.out.print("Nom : ");
                    String nomPilote = scanner.nextLine();
                    System.out.print("Adresse : ");
                    String adressePilote = scanner.nextLine();
                    System.out.print("Contact : ");
                    String contactPilote = scanner.nextLine();
                    System.out.print("Numéro Employé : ");
                    int numeroEmployePilote = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Date d'embauche : ");
                    String dateEmbauchePilote = scanner.nextLine();
                    System.out.print("Licence : ");
                    String licence = scanner.nextLine();
                    System.out.print("Heures de vol : ");
                    int heuresDeVol = scanner.nextInt();
                    scanner.nextLine();
                    personnes.add(new Pilote(personnes.size() + 1, nomPilote, adressePilote, contactPilote, numeroEmployePilote, dateEmbauchePilote, licence, heuresDeVol));
                    break;

                case 3:
                    System.out.print("Nom : ");
                    String nomCabine = scanner.nextLine();
                    System.out.print("Adresse : ");
                    String adresseCabine = scanner.nextLine();
                    System.out.print("Contact : ");
                    String contactCabine = scanner.nextLine();
                    System.out.print("Numéro Employé : ");
                    int numeroEmployeCabine = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Date d'embauche : ");
                    String dateEmbaucheCabine = scanner.nextLine();
                    System.out.print("Qualification : ");
                    String qualification = scanner.nextLine();
                    personnes.add(new PersonnelCabine(personnes.size() + 1, nomCabine, adresseCabine, contactCabine, numeroEmployeCabine, dateEmbaucheCabine, qualification));
                    break;

                case 4:
                    System.out.print("Numéro du vol : ");
                    int numeroVol = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Origine : ");
                    String origine = scanner.nextLine();
                    System.out.print("Destination : ");
                    String destination = scanner.nextLine();
                    System.out.print("Date et heure de départ : ");
                    String dateHeureDepart = scanner.nextLine();
                    System.out.print("Date et heure d'arrivée : ");
                    String dateHeureArrivee = scanner.nextLine();
                    System.out.print("État (Planifié/Annulé) : ");
                    String etat = scanner.nextLine();
                    vols.add(new Vol(numeroVol, origine, destination, dateHeureDepart, dateHeureArrivee, etat));
                    break;

                case 5:
                    System.out.print("Immatriculation : ");
                    String immatriculation = scanner.nextLine();
                    System.out.print("Modèle : ");
                    String modele = scanner.nextLine();
                    System.out.print("Capacité : ");
                    int capacite = scanner.nextInt();
                    scanner.nextLine();
                    avions.add(new Avion(immatriculation, modele, capacite));
                    break;

                case 6:
                    System.out.print("Nom de l'aéroport : ");
                    String nomAeroport = scanner.nextLine();
                    System.out.print("Ville : ");
                    String ville = scanner.nextLine();
                    System.out.print("Description : ");
                    String description = scanner.nextLine();
                    aeroports.add(new Aeroport(nomAeroport, ville, description));
                    break;

                case 7:
                    System.out.println("Liste des passagers disponibles :");
                    for (Personne p : personnes) {
                        if (p instanceof Passager) {
                            System.out.println(p.getId() + ". " + p.getNom());
                        }
                    }
                    System.out.print("Choisissez un passager par ID : ");
                    int passagerId = scanner.nextInt();
                    scanner.nextLine();
                    Passager passager = (Passager) personnes.get(passagerId - 1);

                    System.out.println("Liste des vols disponibles :");
                    for (Vol vol : vols) {
                        System.out.println(vol.getNumeroVol() + ". " + vol.getOrigine() + " -> " + vol.getDestination());
                    }
                    System.out.print("Choisissez un vol par numéro : ");
                    int volNumero = scanner.nextInt();
                    scanner.nextLine();
                    Vol volChoisi = null;
                    for (Vol vol : vols) {
                        if (vol.getNumeroVol() == volNumero) {
                            volChoisi = vol;
                            break;
                        }
                    }
                    if (volChoisi != null) {
                        passager.reserverVol();
                        Reservation reservation = new Reservation(reservations.size() + 1, "2023-12-05", "En attente");
                        reservations.add(reservation);
                        reservation.confirmerReservation();
                    }
                    break;

                case 8:
                    Statistiques.afficherStatistiquesVols(vols);
                    Statistiques.afficherDestinationsPopulaires(vols);
                    break;

                case 9:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Option invalide.");
                    break;
            }
        }
    }
}
