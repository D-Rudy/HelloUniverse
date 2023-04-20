public class Planet {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs = 0;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAccoste;
    static String forme = "sphérique";

    int rotation(int angle) {
        return angle / 360;
    }

    int revolution(int angle) {
        return angle / 360;
    }

    static String expension(double milliardDeKilometres) {
        if (milliardDeKilometres < 14) {
            return "Oh la la mais c'est super rapide!";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière?";
        }
    }

    Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
        totalVisiteurs += vaisseau.nombrePassagers;

        if (vaisseauActuellementAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println("Le vaisseau " + vaisseauActuellementAccoste.type + " s'en va.");
        }
        Vaisseau vaisseauPrecedent = vaisseauActuellementAccoste;
        vaisseauActuellementAccoste = vaisseau;

        return vaisseauPrecedent;
    }

}
