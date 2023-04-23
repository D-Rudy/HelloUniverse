public class HelloUniverse {
    public static void main(String... args) {


        Planet mercure = new Planet("Mercure");
        mercure.matiere = "tellurique";
        mercure.diametre = 4880L;

        Planet venus = new Planet("Venus");
        venus.matiere = "tellurique";
        venus.diametre = 12100L;

        Planet terre = new Planet("Terre");
        terre.matiere = "tellurique";
        terre.diametre = 12750L;

        Planet mars = new Planet("Mars");
        mars.matiere = "tellurique";
        mars.diametre = 6792L;

        Planet jupiter = new Planet("Jupiter");
        jupiter.matiere = "gazeuse";
        jupiter.diametre = 142984L;

        Planet saturne = new Planet("Saturne");
        saturne.matiere = "gazeuse";
        saturne.diametre = 120536L;

        Planet uranus = new Planet("Uranus");
        uranus.matiere = "gazeuse";
        uranus.diametre = 51118L;
        uranus.atmosphere = new Atmosphere();
        uranus.atmosphere.tauxHydrogene = 83f;
        uranus.atmosphere.tauxMethane = 2.5f;
        uranus.atmosphere.tauxHelium = 15f;

        Planet neptune = new Planet("Neptune");
        neptune.matiere = "gazeuse";
        neptune.diametre = 49528L;

        System.out.println("la forme d'une planète est " + Planet.forme);
        System.out.println("la forme de " + mars.nom + " est " + mars.forme);

        System.out.println(Planet.expension(10.5));
        System.out.println(Planet.expension(14.2));
        System.out.println("L'Homme à découvert " + Planet.nbPlaneteDecouvertes + " planètes.");

        VaisseauDeGuerre vaisseauDeGuerre = new VaisseauDeGuerre();
        vaisseauDeGuerre.type = "Chasseur";
        vaisseauDeGuerre.blindage = 156;
        vaisseauDeGuerre.resistanceBouclier = 2;

        VaisseauCivil vaisseauCivil = new VaisseauCivil();
        vaisseauCivil.type = "Vaisseau-Monde";
        vaisseauCivil.blindage = 4784;
        vaisseauCivil.resistanceBouclier = 30;

        vaisseauCivil.activerBouclier();

        vaisseauDeGuerre.activerBouclier();

        vaisseauDeGuerre.attaque(vaisseauCivil, "Laser photoniques", 3);

        vaisseauCivil.desactiverBouclier();

        System.out.println("Durée de protection résiduelle du bouclier: " + vaisseauCivil.resistanceBouclier + " secondes.");
        System.out.println("Blindage restant: " + vaisseauCivil.blindage + " points.");
    }
}

