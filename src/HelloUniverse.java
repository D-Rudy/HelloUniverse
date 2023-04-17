public class HelloUniverse {
    public static void main(String... args) {
        short annee = 2021;
        String maChaine = "En %d, les planètes du système solaire étaient au nombre de %d";
        System.out.println("Hello Universe!");
        int nbPlanete = 0;

        if (annee < 2006) {
            nbPlanete = 9;
        }else{
            nbPlanete = 8;
        }
        System.out.printf(maChaine, annee, nbPlanete);
    }

}
