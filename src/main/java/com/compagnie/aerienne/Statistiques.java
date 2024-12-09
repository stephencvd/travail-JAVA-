package com.compagnie.aerienne;

import java.util.HashMap;
import java.util.List;

public class Statistiques {

    public static void afficherStatistiquesVols(List<Vol> vols) {
        int volsPlanifies = 0;
        int volsAnnules = 0;

        for (Vol vol : vols) {
            if ("Planifié".equalsIgnoreCase(vol.getEtat())) {
                volsPlanifies++;
            } else if ("Annulé".equalsIgnoreCase(vol.getEtat())) {
                volsAnnules++;
            }
        }

        System.out.println("Statistiques des vols :");
        System.out.println("- Vols planifiés : " + volsPlanifies);
        System.out.println("- Vols annulés : " + volsAnnules);
    }

    public static void afficherDestinationsPopulaires(List<Vol> vols) {
        HashMap<String, Integer> destinationCount = new HashMap<>();

        for (Vol vol : vols) {
            destinationCount.put(vol.getDestination(),
                    destinationCount.getOrDefault(vol.getDestination(), 0) + 1);
        }

        System.out.println("Destinations populaires :");
        destinationCount.forEach((destination, count) ->
                System.out.println("- " + destination + " : " + count + " vols"));
    }
}
