public class HelloUniverse {
    public static void main(String... args) {
        int annee = 2006;
        System.out.println("Hello Universe!");
        int nbPlanete = 9;

        if(annee >=2006){
            nbPlanete = 8;
        }
        System.out.printf("En %d, les planètes du système solaire étaient au nombre de %d", annee, nbPlanete);
    }

}
