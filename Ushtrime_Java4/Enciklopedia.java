
public class Enciklopedia extends Libri {

    public boolean kaDetyra() {
        return false;
    }

    public boolean eshteDigjitale() {
        return false;
    }

    private int nrAutoreve;

    public Enciklopedia(String isbn, String titulli, int vitiIPublikimit, int nrFaqeve, int nrAutoreve) {
        super(isbn, titulli, vitiIPublikimit, nrFaqeve);
        this.nrAutoreve = nrAutoreve;
    }

    public int getNrAutoreve() {
        return nrAutoreve;
    }

    public void setNrAutoreve(int nrAutoreve) {
        this.nrAutoreve = nrAutoreve;
    }

    public String toString() {
        return "Enciklopedia: " + super.toString() + " ka " + nrAutoreve + " autore";
    }
}
