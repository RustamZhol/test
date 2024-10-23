import java.util.Scanner;
import java.util.ArrayList;

public class Equipe {
    private String nomEquipe;
    private String siege;
    private ArrayList<Joueur> listJoueurs=new ArrayList<>();

    public Equipe(String nomEquipe, String siege, ArrayList<Joueur> listJoueurs) {
        this.nomEquipe = nomEquipe;
        this.siege = siege;
        this.listJoueurs = listJoueurs;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    public void recruterJoueur(Joueur j) {
        if(listJoueurs.contains(j))
        {
            System.out.println("Impossible d'ajouter le joueurs "+j+" car ce joueur est déja présent dans l'équipe!!");
        }
        else {
            listJoueurs.add(j);
            System.out.println("Le joueur " + j + " a été ajouter avec succes!!");
        }
    }

    public void renvoyerJoueur(Joueur j) {
        if(listJoueurs.isEmpty())
            System.out.println("Impossible de supprimer le joueur, il y a personne dans l'équipe");
        else
        if(listJoueurs.contains(j)) {
            listJoueurs.remove(j);
            System.out.println("Le joueur " + j + " a été supprimer avec succes!!");
        }
    }

    public void chercherJoueur(Joueur j) {
        if(listJoueurs.contains(j))
        {
            System.out.println("Le joueur "+j+" fait partie de l'équipe");
        }
        else
            System.out.println("Le joueur "+j+" n'est pas dans l'équipe");
    }

    public void supprimerTousJoueurs() {
        if(listJoueurs.isEmpty())
            System.out.println("Il n'y a pas de joueurs dans l'équipe");
        else {
            listJoueurs.clear();
            System.out.println("Tous les joueurs de l'équipe ont été supprimer");
        }
    }

    public void updateEquipe() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez taper le nouveau nom de l'équipe");
        nomEquipe=sc.nextLine();

        System.out.println("Veuillez entrer le nouveau siege de l'équipe");
        siege=sc.nextLine();
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "nomEquipe='" + nomEquipe + '\'' +
                ", siege='" + siege + '\'' +
                ", listJoueurs=" + listJoueurs +
                '}';
    }
}
