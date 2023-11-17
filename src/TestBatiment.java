public class TestBatiment {
    public static void main(String[] args) throws Exception {
        Batiment batiment1 = new Batiment("25 impasse de Rien", 60);

        Maison maison1 = new Maison("13 rue des chaumes", 120, 12, 60);

        Immeuble immeuble1 = new Immeuble("85 avenue du fleuve", 50, 20);

        Batiment[] batiments = new Batiment[3];

        batiments[0] = batiment1;
        batiments[1] = maison1;
        batiments[2] = immeuble1;

        for (Batiment b : batiments) {
            System.out.println(b);
        }
    }
}
