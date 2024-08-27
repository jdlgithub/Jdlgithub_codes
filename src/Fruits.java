public abstract   class Fruits {

    public abstract void gout();//Methode abs 1

    public abstract   int taille();//Methode abs 2

    public abstract   boolean a_des_grain();//Methode abs 3

    public void infos(){// Methode generaliser
        System.out.println("Mangez 5 fruits et legumes par jour !");
    }

    //definition nom_fruit
    private String nom_fruit;

    //Creation du constructeur
    public Fruits(String nom_fruit){
        this.nom_fruit = nom_fruit;
    }

}



