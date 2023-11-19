public class Futbollisti extends Sportisti {
    private int numri;

    public Futbollisti(int id, String emri, int mosha, char gjinia, int numri) {
        super(id, emri, mosha, gjinia);
        this.numri = numri;
    }

    @Override
    public String toString() {
        return "Futbollisti " + super.toString() + "– nr: " + numri;
    }
}
