public class Kiwi extends Fruits implements Fruit_pellable {

    public Kiwi(String nom_fruit) {
        super(nom_fruit);
    }

    @Override
    public boolean Le_fruit_est_pellable() {
        return true;
    }

    @Override
    public String Type_de_peau() {
        return "Peau tres lisse";
    }

    @Override
    public void gout() {
        System.out.println("Le Kiwi est plutot legerement acide");

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
