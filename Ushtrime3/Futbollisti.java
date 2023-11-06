public class Futbollisti extends Sportisti {
    public boolean garonIndividualisht() {
        return true;
    }

    private int numri;

    public Futbollisti(int id, String emri, String mosha, char gjinia, int numri) {
        super(id, emri, mosha, gjinia);
        this.numri = numri;
    }

    public int getNumri() {
        return numri;
    }

    public void setNumri(int numri) {
        this.numri = numri;
    }

    public String toString() {
        return "Futbollisti " + super.toString() + " -nr " + numri;
    }
}