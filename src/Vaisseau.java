public class Vaisseau {
    String type;
    int nombrePassagers;
    int blindage;
    int resistanceBouclier;

    void activerBouclier() {
        System.out.println("Activation du bouclier d'un vaisseau de type " + type + ".");
    }
    void desactiverBouclier() {
        System.out.println("Désactivation d'un bouclier d'un vaisseau de type " + type + ".");
    }
}
