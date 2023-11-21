package Ushtrime_Java6;

public class Enciklopedia extends Libri {
    private int nrAutoreve;

    public Enciklopedia(String isbn, String titulli, int vitiIPublikimit, int nrAutoreve) {
        super(isbn, titulli, vitiIPublikimit);
        this.nrAutoreve = nrAutoreve;
    }

    public int getNrAutoreve() {
        return nrAutoreve;
    }

    public void setNrAutoreve(int nrAutoreve) {
        this.nrAutoreve = nrAutoreve;
    }

    @Override
    public String toString() {
        return "Enciklopedia " + getIsbn() + " : " + getTitulli() + " - " + getVitiIPublikimit() + " ka " + nrAutoreve
                + " autore";
    }
}
