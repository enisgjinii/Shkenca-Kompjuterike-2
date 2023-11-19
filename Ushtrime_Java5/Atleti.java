public abstract class Atleti extends Sportisti {
    private int nrMedaljeve;

    public Atleti(int id, String emri, int mosha, char gjinia, int nrMedaljeve) {
        super(id, emri, mosha, gjinia);
        this.nrMedaljeve = nrMedaljeve;
    }

    @Override
    public String toString() {
        return super.toString() + " me " + nrMedaljeve + " medalje";
    }
}
