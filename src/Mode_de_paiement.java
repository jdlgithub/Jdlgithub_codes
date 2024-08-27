import org.w3c.dom.ls.LSOutput;

public class Mode_de_paiement<T> {//T (types de donnees) est un objet generique

    public String Utilisateur;
    public double Porte_feuille;
    public T Devise;

    //creation du constructeur
    public Mode_de_paiement(String utilisateur,double porte_feuille,T devise){

        this.Utilisateur = utilisateur;
        this.Porte_feuille = porte_feuille;
        this.Devise = devise;
    }
    //Recuperation des donnees
    public String getUtilisateur() {
        return Utilisateur;
    }

    public double getPorte_feuille() {
        return Porte_feuille;
    }

    public T getDevise() {
        return Devise;
    }

    //Ajout d'argent dans le compte
     public  void Ajout_argent(int montant){
        this.Porte_feuille += montant ;

     }
    //Retrait de l'argent dans le compte
    public  void Retrait_argent(int montant){
        this.Porte_feuille -= montant ;

    }

    //Affiche le montant du compte
    public void Solde(){
        System.out.println("Vous avez " + Porte_feuille +  Devise + " dans votre compte.");

    }





}
