public abstract class Pajisja {
    protected final int numriSerik;
    protected String prodhuesi;

    public Pajisja(int numriSerik, String prodhuesi) {
        this.numriSerik = numriSerik;
        this.prodhuesi = prodhuesi;
    }

    public int getNumriSerik() {
        return numriSerik;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    public boolean equals(Pajisja obj) {
        return this.numriSerik == obj.numriSerik;
    }

    @Override
    public String toString() {
        return numriSerik + " : " + prodhuesi;
    }
}
