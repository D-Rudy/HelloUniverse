public class PlaneteTellurique extends Planet implements Habitable {
    int totalVisiteurs = 0;
    Vaisseau vaisseauActuellementAccoste;

    public PlaneteTellurique(String nom) {
        super(nom);
    }

    public Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
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
