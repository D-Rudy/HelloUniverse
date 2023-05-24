package helloUniverse;

public abstract class Planet {
    static String forme = "sphérique";
    static int nbPlaneteDecouvertes;
    String nom;
    long diametre;

    Atmosphere atmosphere;


    public Planet(String nom) {
        this.nom = nom;
        nbPlaneteDecouvertes++;
    }

    static String expension(double milliardDeKilometres) {
        if (milliardDeKilometres < 14) {
            return "Oh la la mais c'est super rapide!";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière?";
        }
    }

    int rotation(int angle) {
        return angle / 360;
    }

    int revolution(int angle) {
        return angle / 360;
    }


}
