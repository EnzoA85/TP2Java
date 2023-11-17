public class Batiment {

    private String adresse;
    private int surfaceHabitable;

    public Batiment(String adresse, int surfaceHabitable) {
        this.adresse = adresse;
        this.surfaceHabitable = surfaceHabitable;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getSurfaceHabitable() {
        return surfaceHabitable;
    }

    public void setSurfaceHabitable(int surfaceHabitable) {
        this.surfaceHabitable = surfaceHabitable;
    }

    @Override
    public String toString() {
        return "Batiment [adresse = " + adresse + ", surfaceHabitable = " + surfaceHabitable + "]";
    }
}