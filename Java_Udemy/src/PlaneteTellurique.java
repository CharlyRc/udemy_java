public class PlaneteTellurique extends Planete implements Habitable{

    public PlaneteTellurique(String nom){
        super(nom);
    }
    Vaisseau vaisseauAccoste;
    int totalVisiteurs;

    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau){

        if(nouveauVaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre)nouveauVaisseau).desactiverArmes();

        }
        totalVisiteurs+=nouveauVaisseau.nbPassagers;

        Vaisseau vaisseauPrecedent=vaisseauAccoste;

        vaisseauAccoste=nouveauVaisseau;

        return vaisseauPrecedent;

    }
}
