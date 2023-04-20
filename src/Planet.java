public class Planet {
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs = 0;
    Atmosphere atmosphere;

    Vaisseau vaisseauActuellementAccoste;


    int rotation(int angle) {
        return angle / 360;
    }

    int revolution(int angle) {
        return angle / 360;
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
