package helloUniverse;

import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {


        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12750;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83f;
        atmosphereUranus.tauxMethane = 2.5f;
        atmosphereUranus.tauxHelium = 15f;
        uranus.atmosphere = atmosphereUranus;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49528;
        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.nombrePassagers = 3;
        chasseur.blindage = 156;
        chasseur.resistanceBouclier = 2;
        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nombrePassagers = 100;
        fregate.blindage = 542;
        fregate.resistanceBouclier = 50;
        Vaisseau croiseur = new VaisseauDeGuerre("CROISEUR");
        croiseur.nombrePassagers = 35;
        croiseur.blindage = 851;
        croiseur.resistanceBouclier = 25;

        Vaisseau cargo = new VaisseauCivil("CARGO");
        cargo.nombrePassagers = 10000;
        cargo.blindage = 1520;
        cargo.resistanceBouclier = 20;
        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.nombrePassagers = 10000;
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceBouclier = 30;


        System.out.println("Quel vaisseau souhaitez-vous utiliser ?");
        Scanner input = new Scanner(System.in);
        String vaisseauChoisi = input.nextLine();
        Vaisseau vaisseau = null;
        switch (vaisseauChoisi) {

            case "CHASSEUR":
                System.out.println("Vous avez choisi le vaisseau de type CHASSEUR");
                vaisseau = chasseur;
                break;
            case "FREGATE":
                System.out.println("Vous avez choisi le vaisseau de type FREGATE");
                vaisseau = fregate;
                break;
            case "CROISEUR":
                System.out.println("Vous avez choisi le vaisseau de type CROISEUR");
                vaisseau = croiseur;
                break;
            case "CARGO":
                System.out.println("Vous avez choisi le vaisseau de type CARGO");
                vaisseau = cargo;
                break;
            case "VAISSEAU-MONDE":
                System.out.println("Vous avez choisi le vaisseau de type VAISSEAU-MONDE");
                vaisseau = vaisseauMonde;
                break;
        }

        System.out.println("Sur quelle planète téllurique souhaitez-vous vous poser ?");
        String planeteChoisie = input.nextLine();
        PlaneteTellurique planete = null;
        switch (planeteChoisie) {
            case "Mercure":
                System.out.println("Vous avez choisi la planète Mercure");
                planete = mercure;
                break;
            case "Venus":
                System.out.println("Vous avez choisi la planète Venus");
                planete = venus;
                break;
            case "Terre":
                System.out.println("Vous avez choisi la planète Terre");
                planete = terre;
                break;
            case "Mars":
                System.out.println("Vous avez choisi la planète Mars");
                planete = mars;
                break;
        }
        System.out.println("Quel tonnage souhaitez-vous embarquer ?");
        int tonnageChoisi = input.nextInt();

        System.out.println(vaisseau.emporterCargaison(tonnageChoisi) + "tonnes rejetées");
        planete.accueillirVaisseau(vaisseau);


    }
}

