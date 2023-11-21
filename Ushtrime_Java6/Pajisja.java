package Ushtrime_Java6;

public abstract class Pajisja {
    // Atributet
    private final int numriSerik;
    private String prodhuesi;

    // Konstruktori
    public Pajisja(int numriSerik, String prodhuesi) {
        this.numriSerik = numriSerik;
        this.prodhuesi = prodhuesi;
    }

    // Metodat get dhe set
    public int getNumriSerik() {
        return numriSerik;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    // Metoda për krahasimin e dy objekteve Pajisja
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Pajisja pajisja = (Pajisja) obj;
        return numriSerik == pajisja.numriSerik;
    }

    // Metoda për paraqitjen në String
    @Override
    public String toString() {
        return numriSerik + " : " + prodhuesi;
    }
}
