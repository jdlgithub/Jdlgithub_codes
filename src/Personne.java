public class Personne{

    public String nom;
    public int age;
    public double taille;

    //Creation du constructeur
    public Personne(String nom,int age,double taille) {
        this.nom = nom ;
        this.age = age;
        this.taille = taille;
    }

// Accesseurs
    public String getNom() {//Methode
        return nom;
    }

    public void setNom(String nom) {//Methode
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }






}








