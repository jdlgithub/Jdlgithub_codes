public class Banque {
    //Parametres
    String nom_banque;


    //Creation du constructeur
    public Banque(String nom_banque){
        this.nom_banque = nom_banque;
    }
    //Recuperation du nom de la banque
    public String getNom_banque() {
        return nom_banque;
    }
    public <T,S>void Transfert_argent(Mode_de_paiement<T> Compte_source,Mode_de_paiement<S> Compte_receveur,int montant) {
    //Transfert d'argent est une methode generique avec 2 objets generique en option
        if(Compte_source.Porte_feuille >= montant){
            //La transaction est faisable

            //Retrait d'argent
            Compte_source.Retrait_argent(montant);
            //Reception d'agent
            Compte_receveur.Ajout_argent(montant);

            //Confirmation de la transaction
            System.out.println(Compte_source.Utilisateur + " a envoyé " + montant + Compte_source.Devise + " a " + Compte_receveur.Utilisateur + "." );
            System.out.println("Merci de votre confiance et votre patience. Uba vous remercie.");

            //Affichage des nouveaux montants
            System.out.println(Compte_source.Utilisateur + " vous avez maintenant " + Compte_source.Porte_feuille + Compte_source.Devise + " dans votre compte.");
            System.out.println(Compte_receveur.Utilisateur + " vous avez maintenant " + Compte_receveur.Porte_feuille + Compte_receveur.Devise + " dans votre compte.");


        }

        else{
            System.err.println("Desolé le comte de " + Compte_source.Utilisateur + " n'as pas le montant necessaire pour effecter cette transaction.");//err permet de cree une ereur a afficher
            System.err.println("Veillez verifier votre solde et reesayer !");
        }




    }


}
