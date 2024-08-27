import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int age = 18;
        switch (age) {
            case 17:
                System.out.println("Vous serez bientot majeur");     // != negation ; && et  || ou
                break;
            case 18:
                System.out.println("Vous etes tout juste majeur ");
                break;
            case 8:
                System.out.println("Vous etes un enfant");
                break;
            default:
                System.out.println("Il n'ya rein  a redire sur votre age");
        }

        System.out.println("Je m'appele jdl et j'ai " + age + " ans.");

        System.out.println();

        int Porte_monnaie = 1000;
        //int Prix_telephone = 9000;
        if (Porte_monnaie < 9000) {
            System.out.println("Vous ne pouvez pas acheter ce telephone il est trop cher pour vous");
        } else {
            System.out.println("Vous avez les moyens necessaire pou vous fare plaisir acheter le donc !");
        }

        System.out.println();

        String[] noms = {"jaques", "Jdl", "Patrik"}; // creation du tableau noms
        System.out.println(noms[2]);//Affichage du tableau crée

        int[] nombre = {100, 240, 300, 47};
        System.out.println(nombre[1]);
        int moyenne_du_tableau = (nombre[0] + nombre[1] + nombre[2] + nombre[3]) / nombre.length;
        System.out.println(moyenne_du_tableau);


        // LA commande lenght permet de compter le nombre d'element d'u tableau
        int element_noms = noms.length;
        System.out.println(element_noms);

        System.out.println();

        //Emboiter plusieurs tableau dans un seul
        int[][] Element = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Element.length);
        System.out.println(Element[1][2]);

        System.out.println();

        // La boucle for
        for (int i = 0; i < 10; i++) {
            System.out.println("Tour de boucle numero " + i);
        }

        for (String names : noms) {
            System.out.println(names);
        }

        //La boucle while
        int i = 1;
        while (i != 12) {
            i++;
            System.out.println("Boucle en chaine numero " + i);
        }

        System.out.println();

        //Appel de la fonction Afficher_message
        Afficher_message("Jdl");
        //Appel de la fonction Calcul_nombre
        Calcul_de_nombre(125, 24);


        //Creation des objets
        Personne personne_1 = new Personne("Jdl", 20, 2.01);
        Personne personne_2 = new Personne("Patrik", 45, 1.75);
        //Bien etant que le nom de l'objet soit defini on peut le MAj avec personne_x.setX()

        //Mise a jour de l'age de la personne 2 et la taille de la persone 1
        personne_2.setAge(28);
        personne_1.setTaille(1.95);


        //Affichage des infos_personne
        System.out.println("nom:" + personne_1.getNom() + "  age:" + personne_1.getAge() + " ans" + "  Taille:" + personne_1.getTaille() + " m");
        System.out.println("nom:" + personne_2.getNom() + "  age:" + personne_2.getAge() + " ans" + "  Taille:" + personne_2.getTaille() + " m");

        System.out.println();


        //L'heritage

        //Creation d'une pomme
        Pomme pomme = new Pomme();
        pomme.gout();
        pomme.infos();

        //Creation d'un ananas
        Ananas ananas = new Ananas();
        ananas.gout();
        ananas.infos();

        //Creation d'un instant dans la journee
        Jour moment_1 = Jour.Midi;
        Jour moment_2 = Jour.Matin;

        //Mise a jour de moment_1
        moment_1 = Jour.soir;

        //Affichage des moments de la journee
        System.out.println("Il est " + Jour.Midi + " et il est environ " + Jour.Midi.heures + "h. " + Jour.Midi.actus);
        System.out.println("Maintenant nous sommes le " + moment_1 + " et il est " + moment_1.heures + "h. " + moment_1.actus);
        System.out.println("C'est le " + moment_2 + " il est " + moment_2.heures + "h." + moment_2.actus);

        // totlowercase() permert de mettre tout une chaine de caractere en majuscule.

        //Automatsaton
//        for (Jour moment: Jour.values()){
//
//            System.out.println("C'est le " + moment + " il est " + moment.heures + "h." + moment.actus);

        System.out.println();

        // Les array lists

        ArrayList Liste_1 = new ArrayList();//Liste globale
        ArrayList<Integer> Liste_2 = new ArrayList<>();//Tableau specifique

        //Enumeration__ajout des elements
        Liste_1.add(7);
        Liste_1.add(27);
        Liste_1.add("Jdl");
        Liste_1.add(12.7);
        Liste_2.add(123);
        Liste_2.add(67);

        //Suppression d'element
        Liste_1.remove(1);


        //Affichage
        System.out.println(Liste_1.get(2));// Le Liste.get() permet de selectionner les element de la liste
        System.out.println(Liste_2);

        //Les hashmaps

        //Creation de l'hashmap
        Map<String, Integer> donnees = new HashMap<>();

        //Insertion des donnees
        donnees.put("Hervé", 23);
        donnees.put("Sasha", 18);

        //Affichage
        System.out.println(donnees.get("Sasha"));// affiche specifiquement la valeur associer a Sasha

        System.out.println();


        // Creatipn de compte bancaire
        Mode_de_paiement compte_1 = new Mode_de_paiement("JDl", 20500, '£');
        compte_1.Solde();

        Mode_de_paiement compte_2 = new Mode_de_paiement("Patrik", 3000, " euro");
        compte_2.Solde();

        System.out.println();

        //Creation d'une banque
        Banque Banque_1 = new Banque("UBA afrique");
        System.out.println("Nouvelle banque crée :" + Banque_1.nom_banque);

        //Affichage des info de la transaction
        Banque_1.Transfert_argent(compte_1, compte_2, 2000);


        // Les chronometres

        //Creation d'un  chronometre
        Timer Chronometre = new Timer();

       int time = 10;

        Chronometre.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time: " + time);
                if (time == 1){
                    cancel();
                }
//                time--;
            }
        },3000,1000);//Durée de 1s avant d'afficher le mesage donc 1000 ms


        // Les fichiers

        //Creation d'un nouveau fichier
        File fichier_1 = new File("C://Users/minec/Desktop/Fichier_1.txt");

        //Creation d'un dossier
        File Dossier_1 = new File("C://Users/minec/Desktop/Dossier_1/");
        Dossier_1.mkdir();


        if (!fichier_1.exists()){
            try{
                fichier_1.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }





    }private static void Afficher_message(String message){// Void cad ne renvoie rien en sortie
        System.out.println("Ceci est le premier message afficher \"" +
                "de cette nouvelle fonction concu par " + message);

        //Surface d'un rectangle
    }private static  int Calcul_de_nombre(int Longueur, int largeur){
        System.out.println("Cette fonction a pour but de calculer la surface des rectangles");
        int Surface = Longueur*largeur;
        System.out.println("La surface de ce rectangle est de " + Surface + " metre carre");
        return Surface;
    }


//Debut utilisation spring boot








}














