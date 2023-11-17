public class Batiment {

    private String adresse;
    private int surfaceHabitable;

    //Constructeur de la classe batiment
    public Batiment(String adresse, int surfaceHabitable) {
        this.adresse = adresse;
        this.surfaceHabitable = surfaceHabitable;
    }

    //getteur qui retourne l'adresse d'un batiment
    public String getAdresse() {
        return adresse;
    }

    //setteur qui permet de définir une adresse d'un batiment
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    //getteur qui retourne la surface habitale d'un batiment
    public int getSurfaceHabitable() {
        return surfaceHabitable;
    }

    //setteur qui permet de définir une surface habitable d'un batiment
    public void setSurfaceHabitable(int surfaceHabitable) {
        this.surfaceHabitable = surfaceHabitable;
    }

    //Méthode toString afin d'afficher un batiment
    @Override
    public String toString() {
        return "Batiment [adresse = " + adresse + ", surfaceHabitable = " + surfaceHabitable + "]";
    }

    //Méthode catégorie retournant 1,2 ou 3 en fonction de la surface habitale
    public int categorie() {
        if (this.surfaceHabitable<30) {
            return 1;
        } else {
            if (this.surfaceHabitable<=70){
                return 2;
            }
        }
        //Si il n'y a pas eu de return plutôt c'est que la surface est forcément supérieur à 70 donc de catégorie 3
        return 3;
    }

    //Méthode comparer deux batiment en fonction de la surface habitable et retourne celui qui à la plus grande
    public Batiment comparer(Batiment autreBatiment) {
        //Comparaison des deux batiments
        if (this.surfaceHabitable > autreBatiment.getSurfaceHabitable()) {
            return this;
        } else {
            return autreBatiment;
        }
    }
}