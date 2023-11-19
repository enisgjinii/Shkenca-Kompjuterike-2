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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pajisja pajisja = (Pajisja) obj;
        return numriSerik == pajisja.numriSerik;
    }

    @Override
    public String toString() {
        return numriSerik + " : " + prodhuesi;
    }
}
