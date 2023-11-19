public class Vrapuesi extends Atleti {
    private int distanca;

    public Vrapuesi(int id, String emri, int mosha, char gjinia, int nrMedaljeve, int distanca) {
        super(id, emri, mosha, gjinia, nrMedaljeve);
        this.distanca = distanca;
    }

    @Override
    public String toString() {
        return "Vrapuesi i distances " + distanca + " m - " + super.toString();
    }
}
