package Ushtrime_Java6;

public abstract class Libri {
    private String isbn;
    private String titulli;
    private int vitiIPublikimit;

    public Libri(String isbn, String titulli, int vitiIPublikimit) {
        this.isbn = isbn;
        this.titulli = titulli;
        this.vitiIPublikimit = vitiIPublikimit;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public int getvitiIPublikimit() {
        return vitiIPublikimit;
    }

    public void setvitiIPublikimit(int vitiIPublikimit) {
        this.vitiIPublikimit = vitiIPublikimit;
    }

    public abstract boolean kaDetyra();

    @Override
    public String toString() {
        return "isbn: " + isbn + ", titulli: " + titulli + ", vitiIPublikimit: " + vitiIPublikimit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Libri libri = (Libri) obj;
        return isbn.equals(libri.isbn);
    }
}