public class Planet {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs = 0;

    int rotation(int angle) {
        return angle / 360;
    }

    int revolution(int angle) {
        return angle / 360;
    }

    void accueillirVaisseau(int nbHumains) {
        totalVisiteurs += nbHumains;
    }

    void accueillirVaisseau(String vaisseau) {
        if (vaisseau.equalsIgnoreCase("CHASSEUR")) {
            totalVisiteurs += 3;
        } else if (vaisseau.equalsIgnoreCase("FREGATE")) {
            totalVisiteurs += 12;
        } else if (vaisseau.equalsIgnoreCase("CROISEUR")) {
            totalVisiteurs += 50;
        }
    }
}
