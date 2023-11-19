public abstract class Publikimi {
    private String isbn;
    private String titulli;
    private int vitiIPublikimit;

    public Publikimi(String isbn, String titulli, int vitiIPublikimit) {
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

    public abstract boolean eshteDigjitale();

    public boolean equals(Object obj) {
        if (obj instanceof Publikimi) {
            Publikimi p = (Publikimi) obj;
            return p.getIsbn().equals(isbn);
        }
        return false;
    }
}
