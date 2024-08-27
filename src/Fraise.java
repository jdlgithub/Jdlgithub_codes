public class Fraise extends Fruits {


    public Fraise(String nom_fruit){
       super("fraise");

    }
    @Override
    public void gout() {
        System.out.println("La fraise a un gout legerement sucré");

    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean a_des_grain() {
        return true;
    }
}
