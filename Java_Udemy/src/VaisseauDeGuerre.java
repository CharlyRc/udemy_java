public class VaisseauDeGuerre extends Vaisseau{

    boolean armesDesactivees;
     void attaque(Vaisseau vaisseauAttaque,String armeUtilisee,int dureeAttaque){

        if(armesDesactivees){
            System.out.println("Attaque impossible, l'armement est désactivé");
            activerBouclier();
        }
        else{
            System.out.println("Un vaisseau de type "+ type + " attaque un vaisseau de type " + vaisseauAttaque.type + " en utilisant l'arme "+ armeUtilisee + " pendant " + dureeAttaque + " minutes" );
            vaisseauAttaque.resistanceDuBouclier=0;
            vaisseauAttaque.blindage = vaisseauAttaque.blindage/2;
            desactiverBouclier();
        }
    }

    void desactiverArmes(){
         armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type" + type);
    }
}

