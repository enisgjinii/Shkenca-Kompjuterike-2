public class Automjeti {
    private final String nrShasise;
    private String prodhuesi;
    private int vitiProdhimit;

    // Konstruktori
    public Automjeti(String nrShasise, String prodhuesi, int vitiProdhimit) {
        this.nrShasise = nrShasise;
        this.prodhuesi = prodhuesi;
        this.vitiProdhimit = vitiProdhimit;
    }

    // Metodat get dhe set për atributet të cilat duhet të jenë të ndryshueshme
    public String getProdhuesi() {
        return prodhuesi;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    public int getVitiProdhimit() {
        return vitiProdhimit;
    }

    public void setVitiProdhimit(int vitiProdhimit) {
        this.vitiProdhimit = vitiProdhimit;
    }

    // Metoda për paraqitjen në formatin e kërkuar
    @Override
    public String toString() {
        return nrShasise + " : " + prodhuesi + " - " + vitiProdhimit;
    }

    // Metoda për krahasimin e dy objekteve Automjeti
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Automjeti that = (Automjeti) obj;
        return nrShasise.equals(that.nrShasise);
    }
}
