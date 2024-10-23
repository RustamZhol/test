public class Joueur {
    private String nomJoueur;
    private int age;
    private int nbButs;

    public Joueur(String nomJoueur, int age, int nbButs) {
        this.nomJoueur = nomJoueur;
        this.age = age;
        this.nbButs = nbButs;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public int getAge() {
        return age;
    }

    public int getNbButs() {
        return nbButs;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNbButs(int nbButs) {
        this.nbButs = nbButs;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nomJoueur='" + nomJoueur + '\'' +
                ", age=" + age +
                ", nbButs=" + nbButs +
                '}';
    }
}
