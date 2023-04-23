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
        System.out.println("la forme de " + mars.nom + " est " + mars.forme);

        System.out.println(Planet.expension(10.5));
        System.out.println(Planet.expension(14.2));
        System.out.println("L'Homme à découvert " + Planet.nbPlaneteDecouvertes + " planètes.");

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.type = "Chasseur";
        chasseur.blindage = 156;
        chasseur.resistanceBouclier = 2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "Vaisseau-Monde";
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

    }
}

