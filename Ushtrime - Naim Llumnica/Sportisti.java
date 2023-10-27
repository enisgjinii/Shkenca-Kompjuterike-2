public class Sportisti {
    private final int id;
    private String emri;
    private int mosha;
    private char gjinia; // 'M' për mashkull, 'F' për femër

    // Konstruktori që inicializon të gjitha atributet
    public Sportisti(int id, String emri, int mosha, char gjinia) {
        this.id = id;
        this.emri = emri;
        this.mosha = mosha;
        this.gjinia = gjinia;
    }

    // Metodat get dhe set për atributet emri, mosha dhe gjinia
    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public char getGjinia() {
        return gjinia;
    }

    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }

    // Metoda për paraqitjen në String të objektit Sportisti s
    @Override
    public String toString() {
        String gjiniaStr = (gjinia == 'M') ? "mashkull" : "femer";
        return "<" + id + "> : " + emri + " " + gjiniaStr + " " + mosha + " vjec";
    }

    // Metoda për krahasimin e dy objekteve Sportisti s
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Nëse objektet janë të njëjtë në memorie
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Nëse obj nuk është një instancë e klasës Sportisti
        }
        Sportisti Sportisti = (Sportisti) obj;
        return id == Sportisti.id;
    }

    // Metoda për hasjen e objektit bazuar në id
    // @Override
    public int hashCode() {
        return Object.hash(id);
    }
}
