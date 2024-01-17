public class Planete {
    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes = 0;
    long diametre;
    int totalVisiteurs;
    String nom;
    Vaisseau vaisseauActuellementAcoster;
    Atmosphere atmosphere=new Atmosphere();

    static void expansion (double distanceEntrePlanete){
        if(distanceEntrePlanete<14){
            System.out.println("Oh la la mais c'est super rapide");
        }
        else{
            System.out.println("Je rêve ou c'est plus rapide que la lumière ?");
        }
    }

    int revolution(int angle){
        int nombreTours = angle/360;
        System.out.println(nom + " a effectué "+ nombreTours + " tours complets autour de son étoile");
        return nombreTours;
    }

    int rotation(int angle){
        int nombreTours = angle/360;
        System.out.println(nom + " a effectué "+ nombreTours + " tours complets sur elle-même");
        return nombreTours;
    }

    void transportVaisseau(Vaisseau vaisseau){
        totalVisiteurs+=vaisseau.nbPassagers;
        if(vaisseauActuellementAcoster==null){
            vaisseauActuellementAcoster=vaisseau;
            System.out.println("Aucun vaisseau ne s'en va");
        }
        else{
            System.out.println("Un vaisseau de type "+vaisseauActuellementAcoster.type +" doit s'en aller");
        }
        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + nom + " est actuellement de " + totalVisiteurs);
    }
    Planete(String nom){
        this.nom=nom;
        nbPlanetesDecouvertes++;
    }
}
