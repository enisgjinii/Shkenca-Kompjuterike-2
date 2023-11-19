public abstract class Libri extends Publikimi {

    // public boolean eshteDigjitale() {
    // return false;
    // }

    private int nrFaqeve;

    public Libri(String isbn, String titulli, int vitiIPublikimit, int nrFaqeve) {
        super(isbn, titulli, vitiIPublikimit);
        this.nrFaqeve = nrFaqeve;
    }

    public int getNrFaqeve() {
        return nrFaqeve;
    }

    public void setNrFaqeve(int nrFaqeve) {
        this.nrFaqeve = nrFaqeve;
    }

    public abstract boolean kaDetyra();

    public String toString() {
        return super.toString() + " me " + nrFaqeve + " faqe";
    }

}