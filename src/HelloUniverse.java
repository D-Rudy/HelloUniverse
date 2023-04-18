public class HelloUniverse {
    public static void main(String... args) {
        short annee = 1805;
        String maChaine = "En %d, les planètes du système solaire étaient au nombre de %d";
        System.out.println("Hello Universe!");
        int nbPlanete;

        if (annee < 1600 || annee > 2020) {
            System.out.printf("Le programme ne peut pas fournir de résultat pour l'année %d", annee);
        } else {
            if (annee < 1700) {
                nbPlanete = 7;
            } else if (annee < 1800) {
                nbPlanete = 8;
            } else if (annee < 2006) {
                nbPlanete = 9;
            } else {
                nbPlanete = 8;
            }
            System.out.printf(maChaine, annee, nbPlanete);
        }

    }

}

