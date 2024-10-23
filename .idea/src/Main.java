import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Joueur> listJ=new ArrayList<>();

        Equipe e=new Equipe("Canadiens","145 henri bourassa", listJ);

        Joueur j1=new Joueur("Messi",35,45);
        Joueur j2=new Joueur("Ronaldo",28,50);
        Joueur j3=new Joueur("Leblanc",32,60);
        Joueur j4=new Joueur("Mohamed",20,45);
        Joueur j5=new Joueur("Éric",24,45);

        e.recruterJoueur(j1);
        e.recruterJoueur(j2);
        e.recruterJoueur(j3);
        e.recruterJoueur(j4);
        e.recruterJoueur(j5);

        e.renvoyerJoueur(j1);
        e.renvoyerJoueur(j2);

        //e.supprimerTousJoueurs();
        e.updateEquipe();

        System.out.println(e);

    }
}