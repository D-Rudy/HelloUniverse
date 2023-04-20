public class HelloUniverse {
    public static void main(String... args) {


        Planet mercure = new Planet();
        mercure.nom = "Mercure";
        mercure.matiere = "tellurique";
        mercure.diametre = 4880L;

        Planet venus = new Planet();
        venus.nom = "Venus";
        venus.matiere = "tellurique";
        venus.diametre = 12100L;

        Planet terre = new Planet();
        terre.nom = "Terre";
        terre.matiere = "tellurique";
        terre.diametre = 12750L;

        Planet mars = new Planet();
        mars.nom = "Mars";
        mars.matiere = "tellurique";
        mars.diametre = 6792L;

        Planet jupiter = new Planet();
        jupiter.nom = "Jupiter";
        jupiter.matiere = "gazeuse";
        jupiter.diametre = 142984L;

        Planet saturne = new Planet();
        saturne.nom = "Saturne";
        saturne.matiere = "gazeuse";
        saturne.diametre = 120536L;

        Planet uranus = new Planet();
        uranus.nom = "Uranus";
        uranus.matiere = "gazeuse";
        uranus.diametre = 51118L;
        uranus.atmosphere = new Atmosphere();
        uranus.atmosphere.tauxHydrogene = 83f;
        uranus.atmosphere.tauxMethane = 2.5f;
        uranus.atmosphere.tauxHelium = 15f;

        Planet neptune = new Planet();
        neptune.nom = "Neptune";
        neptune.matiere = "gazeuse";
        neptune.diametre = 49528L;

        Planet planetX = new Planet();

        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("fregate");
        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.nom + " est actuellement " + mars.totalVisiteurs);

        System.out.println(uranus.nom + " est composée de :");
        System.out.println(uranus.atmosphere.tauxHydrogene + "% d'hydrogène");
        System.out.println(uranus.atmosphere.tauxMethane + "% de méthane");
        System.out.println(uranus.atmosphere.tauxHelium + "% d'hélium");
        System.out.println(uranus.atmosphere.tauxAzote + "% d'azote");
        System.out.println(uranus.atmosphere.tauxArgon + "% d'argon");
        System.out.println(uranus.atmosphere.tauxDioxydeCarbone + "% de dioxyde de carbone");
        System.out.println(uranus.atmosphere.tauxSodium + "% de sodium");

    }
}

