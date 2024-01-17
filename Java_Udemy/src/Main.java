public class Main {
    public static void main(String[] args) {

        PlaneteTellurique planeteMercure = new PlaneteTellurique("Mercure");
        planeteMercure.diametre=4880;

        PlaneteTellurique planeteVenus = new PlaneteTellurique("Venus");
        planeteVenus.diametre= 12100;
        planeteVenus.rotation(1250);

        PlaneteTellurique planeteTerre = new PlaneteTellurique("Terre");
        planeteTerre.diametre=12756;

        PlaneteTellurique planeteMars = new PlaneteTellurique("Mars");
        planeteMars.diametre=6792;
        planeteMars.rotation(-684);

        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.type = "Fregate";
        nouveauVaisseau.nbPassagers=9;
        planeteMars.transportVaisseau(nouveauVaisseau);
        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.type = "Croiseur";
        autreVaisseau.nbPassagers=42;
        planeteMars.transportVaisseau(autreVaisseau);

        PlaneteGazeuze planeteJupiter = new PlaneteGazeuze("Jupiter");
        planeteJupiter.diametre=142984;
        System.out.println(planeteJupiter.nom + " est une planète avec un diamètre de " + planeteJupiter.diametre+" kilomètres.");

        PlaneteGazeuze planeteSaturne = new PlaneteGazeuze("Saturne");
        planeteSaturne.diametre=120536;

        PlaneteGazeuze planeteUranus = new PlaneteGazeuze("Uranus");
        planeteUranus.diametre=51118;
        planeteUranus.atmosphere.tauxHydrogene=83;
        planeteUranus.atmosphere.tauxHelium=15;
        planeteUranus.atmosphere.tauxMethane=83;
        System.out.println("L'atmosphère de Uranus est composée :");
        System.out.println("A " + planeteUranus.atmosphere.tauxHydrogene + "% d'hydrogène");
        System.out.println("A " + planeteUranus.atmosphere.tauxArgon + "% d'argon");
        System.out.println("A " + planeteUranus.atmosphere.tauxAzote + "% d'azote");
        System.out.println("A " + planeteUranus.atmosphere.tauxDioxydeCarbonne + "% de dioxyde de carbonne");
        System.out.println("A " + planeteUranus.atmosphere.tauxHelium + "% d'helium");
        System.out.println("A " + planeteUranus.atmosphere.tauxMethane + "% de methane");
        System.out.println("A " + planeteUranus.atmosphere.tauxSodium + "% de sodium");


        PlaneteGazeuze planeteNeptune = new PlaneteGazeuze("Neptune");
        planeteNeptune.diametre=49532;
        planeteNeptune.revolution(-3542);

        System.out.println("La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de "+planeteMars.nom+" est : " + Planete.forme);

        Planete.expansion(10.5);
        Planete.expansion(14.2);

        Vaisseau chasseur = new VaisseauDeGuerre();
        chasseur.type="Chasseur";
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;

        Vaisseau vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type="Vaisseau-Monde";
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;
        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();

        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde,"lasers photoniques",3);
        vaisseauMonde.desactiverBouclier();
        System.out.println("Résistance du bouclier du vaisseau-monde : "+ vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage restant du vaisseau-monde est de : " + vaisseauMonde.blindage);
        System.out.println("Il y a " +Planete.nbPlanetesDecouvertes+" planètes");

        planeteMars.accueillirVaisseau(vaisseauMonde);
        planeteMars.accueillirVaisseau(chasseur);

    }
}