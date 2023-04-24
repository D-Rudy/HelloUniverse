public class VaisseauDeGuerre extends Vaisseau {
    boolean armesDesactivees = false;

    void attaque(Vaisseau cible, String arme, int duree) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible car l'armement est désactivé.");
        } else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + cible.type + " en utilisant l'arme " + arme + " pendant " + duree + " minutes.");
            cible.resistanceBouclier = 0;
            cible.blindage = cible.blindage / 2;
        }

    }
    void desactiverArmes() {
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type " + type + ".");
    }
}
