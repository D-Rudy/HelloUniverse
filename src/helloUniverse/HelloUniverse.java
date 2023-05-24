package helloUniverse;

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

        System.out.println("la forme d'une planète est " + Planet.forme);
        System.out.println("la forme de " + mars.nom + " est " + Planet.forme);

        System.out.println(Planet.expension(10.5));
        System.out.println(Planet.expension(14.2));
        System.out.println("L'Homme à découvert " + Planet.nbPlaneteDecouvertes + " planètes.");

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage = 156;
        chasseur.resistanceBouclier = 2;

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceBouclier = 30;

        vaisseauMonde.activerBouclier();

        chasseur.activerBouclier();

        chasseur.attaque(vaisseauMonde, "Laser photoniques", 3);

        vaisseauMonde.desactiverBouclier();

        System.out.println("Durée de protection résiduelle du bouclier: " + vaisseauMonde.resistanceBouclier + " secondes.");
        System.out.println("Blindage restant: " + vaisseauMonde.blindage + " points.");

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);

        Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseurSurTerre);
        System.out.println(" le chasseur à rejeté " + chasseurSurTerre.emporterCargaison(20) + " tonnes");

        Vaisseau fregateSurTerre = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre.nombrePassagers = 100;
        terre.accueillirVaisseau(fregateSurTerre);
        System.out.println(" la fregate à rejeté " + fregateSurTerre.emporterCargaison(45) + " tonnes");
        System.out.println(" la fregate à rejeté " + fregateSurTerre.emporterCargaison(12) + " tonnes");

        Vaisseau fregateSurTerre2 = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre2.nombrePassagers = 14;
        terre.accueillirVaisseau(fregateSurTerre2);
        System.out.println(" la fregate à rejeté " + fregateSurTerre2.emporterCargaison(30) + " tonnes");

        Vaisseau vaisseauMondeSurTerre = new VaisseauCivil("VAISSEAU-MONDE");
        terre.accueillirVaisseau(vaisseauMondeSurTerre);
        System.out.println(" le vaisseau monde à rejeté " + vaisseauMondeSurTerre.emporterCargaison(1560) + " tonnes");
        System.out.println(" le vaisseau monde à rejeté " + vaisseauMondeSurTerre.emporterCargaison(600) + " tonnes");
    }
}

