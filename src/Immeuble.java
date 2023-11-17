class Immeuble extends Batiment{

    private int nbAppart;

    public Immeuble(String adresse, int surfaceHabitable, int nbAppart) {
        super(adresse, surfaceHabitable);
        this.nbAppart = nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble [nbAppart = " + nbAppart + "]";
    }
}
