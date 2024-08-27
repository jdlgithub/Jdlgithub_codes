public class Ananas extends Fruits implements  Fruit_pellable {

//Creation du constructeur
    public Ananas(){
        super("ananas");
    }
    @Override
    public void gout() {
        System.out.println("L'ananas a un gout très sucré et un peu acide");

    }

    @Override
    public String Type_de_peau() {
        return "Peau piquante et rigide";
    }

    @Override
    public boolean Le_fruit_est_pellable() {
        return true;
    }

    @Override
    public int taille() {
        return 7;
    }

    @Override
    public boolean a_des_grain() {
        return false;
    }
}
