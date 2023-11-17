class Maison extends Batiment{

    private int nbPieces;
    private float surfaceJardin;

    public Maison(String adresse, int surfaceHabitable, int nbPieces, float surfaceJardin) {
        super(adresse, surfaceHabitable);
        this.nbPieces = nbPieces;
        this.surfaceJardin = surfaceJardin;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public float getSurfaceJardin() {
        return surfaceJardin;
    }

    public void setSurfaceJardin(float surfaceJardin) {
        this.surfaceJardin = surfaceJardin;
    }

    //Méthode toString afin d'afficher une maison
    @Override
    public String toString() {
        return "Maison [nbPieces = " + nbPieces + ", surfaceJardin = " + surfaceJardin + "]";
    }
}
