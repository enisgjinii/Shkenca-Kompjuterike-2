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

    public int getVitiIPublikimit() {
        return vitiIPublikimit;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public void setVitiIPublikimit(int vitiIPublikimit) {
        this.vitiIPublikimit = vitiIPublikimit;
    }

    public String toString() {
        return isbn + " " + titulli + " " + vitiIPublikimit;
    }

    public abstract boolean kaDetyra();

    public boolean equals(Object obj) {
        if (obj instanceof Libri) {
            Libri l = (Libri) obj;
            return l.getIsbn().equals(isbn);
        }
        return false;
    }

}