public class TestBatiment {
    public static void main(String[] args) throws Exception {
        Batiment batiment1 = new Batiment("25 impasse de Rien", 60);
        Batiment batiment2 = new Batiment("158 avenue de non", 80);

        Maison maison1 = new Maison("13 rue des chaumes", 20, 12, 60);
        Maison maison2 = new Maison("25 rue de la pomme", 150, 27, 300);

        Immeuble immeuble1 = new Immeuble("85 avenue du fleuve", 50, 20);

        //Création du tableau de batiment contenant maison1
        Batiment[] tabbatiments = new Batiment[1];
        tabbatiments[0] = maison1;

        System.out.println(" ");
        System.out.println("-------------------------------------------------------Quartier-------------------------------------------------------");
        //Création du quartier
        Quartier quartier1 = new Quartier(tabbatiments);

        System.out.println("quartier1 avant l'ajout de maison2");
        System.out.println(quartier1.toString());

        System.out.println(" ");

        System.out.println("Ajout de maison2 dans quartier1");
        quartier1.ajoutBatiment(maison2);

        System.out.println(" ");

        System.out.println("quartier1 après l'ajout de maison2");
        System.out.println(quartier1.toString());
        System.out.println("----------------------------------------------------------------------------------------------------------------------");       

        System.out.println(" ");
        System.out.println("---Méthode surface Total Jardin et Habitable---");
        Maison[] tabmaisons = new Maison[2];
        tabmaisons[0] = maison1;
        tabmaisons[1] = maison2;

        System.out.println("Surface habitable totale : " + surfaceHabitableTotale(tabmaisons));
        System.out.println("Surface jardin totale : " + surfaceJardinTotale(tabmaisons));
        System.out.println("-----------------------------------------------");

        System.out.println(" ");
        System.out.println("----Categorie Batiment----");
        System.out.println("maison1 est de catégorie "+maison1.categorie());
        System.out.println("maison2 est de catégorie "+maison2.categorie());
        System.out.println("--------------------------");

        System.out.println(" ");
        System.out.println("----Comparer Batiment----");
        System.out.println(batiment1.comparer(batiment2));
        System.out.println("-------------------------");

        System.out.println(" ");
        System.out.println("----Plus Grand Batiment Quartier----");
        System.out.println(quartier1.plusGrandBatiment());
        System.out.println("------------------------------------");

    }

    public static double surfaceHabitableTotale(Maison[] tabMaison) {
        double surfaceTotale = 0;
        for (Maison maison : tabMaison) {
            if (maison != null) {
                surfaceTotale += maison.getSurfaceHabitable();
            }
        }
        return surfaceTotale;
    }

    public static double surfaceJardinTotale(Maison[] tabMaison) {
        double surfaceTotale = 0;
        for (Maison maison : tabMaison) {
            if (maison instanceof Maison) {
                surfaceTotale += maison.getSurfaceJardin();
            }
        }
        return surfaceTotale;
    }
}
