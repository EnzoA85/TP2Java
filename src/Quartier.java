import java.util.Arrays;

public class Quartier {
    private Batiment[] tBatiments;

    //constructeur de la classe quartier
    public Quartier(Batiment[] tBatiments) {
        this.tBatiments = tBatiments;
    }

    //getteur qui permet de retourner le tableau de la classe quartier
    public Batiment[] gettBatiments() {
        return tBatiments;
    }

    //setteur qui permet de définir un tableau de batiement pour la classe quartier
    public void settBatiments(Batiment[] tBatiments) {
        this.tBatiments = tBatiments;
    }

    //Méthode toString afin d'afficher un quartier
    @Override
    public String toString() {
        return "Quartier [tBatiments=" + Arrays.toString(tBatiments) + "]";
    }

    //Méthode ajoutBatiment permettant d'ajouter un batiment à un quartier
    public void ajoutBatiment(Batiment nouveauBatiment) {
        //Crée un nouveau tableau avec une taille augmentée par rapport à celui de base de la classe en gardant le contenue de l'ancien tableau
        Batiment[] nouveauTBatiments = Arrays.copyOf(tBatiments, tBatiments.length + 1);
        //Ajoute le nouveau bâtiment à la dernière position du nouveau tableau
        nouveauTBatiments[tBatiments.length] = nouveauBatiment;
        //Remplace l'ancien tableau par le nouveau tableau
        tBatiments = nouveauTBatiments;
    }

    //Méthode afficherBatiment permettant d'afficher les batiments de catégorie suppérieur ou égale à ce que l'ont demande
    public void afficherBatiments(int cat) {
        //Parcourt chaque bâtiment dans le tableau tBatiments
        for (Batiment batiment : tBatiments) {
            //Vérifie si la catégorie du bâtiment est supérieure ou égale à la catégorie spécifiée
            if (batiment.categorie() >= cat) {
                //Affiche le bâtiment s'il appartient à la catégorie spécifiée ou à une catégorie supérieure
                System.out.println(batiment);
            }
        }
    }

    public Batiment plusGrandBatiment() {
        Batiment plusGrand = tBatiments[0];
        for (int i = 1; i < tBatiments.length; i++) {
            plusGrand = plusGrand.comparer(tBatiments[i]);
        }
        return plusGrand;
    }
}
