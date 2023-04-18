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

        Planet neptune = new Planet();
        neptune.nom = "Neptune";
        neptune.matiere = "gazeuse";
        neptune.diametre = 49528L;

        Planet planetX = new Planet();

        System.out.println(planetX.nom + " est une planète " + planetX.matiere + " de " + planetX.diametre + " km de diamètre");
        System.out.println(jupiter.nom + " est une planète " + jupiter.matiere + " de " + jupiter.diametre + " km de diamètre");
    }
}

