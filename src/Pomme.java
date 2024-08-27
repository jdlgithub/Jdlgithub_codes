public class Pomme extends  Fruits{
//Pour heriter d'une super classe ou classe mere, il suffit de cree une classe fille
// Et de rajouter extends+ nom de la calsse mere maintenant implementer les methodes
//De la classe mere et la on peut directement les utiliser


    public Pomme(){
        super("pomme");
    }
    @Override
    public void gout() {
        System.out.println("La pomme a un gout sucré naturel");

    }

    @Override
    public int taille() {
        return 2;
    }

    @Override
    public boolean a_des_grain() {
        return true;
    }
}
