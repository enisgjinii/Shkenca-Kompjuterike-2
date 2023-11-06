public class Enciklopedia extends Libri {
    public int nrAutoreve;

    public Enciklopedia(String isbn, String titulli, int vitiIPublikimit, int nrAutoreve) {
        super(isbn, titulli, vitiIPublikimit);
        this.nrAutoreve = nrAutoreve;
    }

    public boolean kaDetyra() {
        return false;
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