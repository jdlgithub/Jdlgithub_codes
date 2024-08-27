public enum Jour {
    //Definition des constantes
    Matin(7, " C'est l'heure de se lever !"),
    Midi(12,"La journee peu commencer "),
    Après_midi(15,"A table"),
    soir(19,"Fermeture  des portes "),
    nuit(23, " Bonne nuit");

    public int heures;
    public String actus;

    //Creation du constructeur
    Jour(int heures,String actus) {
        this.heures = heures;
        this.actus = actus;
    }

}
