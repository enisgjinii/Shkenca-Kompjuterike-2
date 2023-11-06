public abstract class Sportisti {
    private int id;
    private String emri;
    private String mosha;
    private char gjinia;

    public Sportisti(int id, String emri, String mosha, char gjinia) {
        this.id = id;
        this.emri = emri;
        this.mosha = mosha;
        this.gjinia = gjinia;
    }

    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public String getMosha() {
        return mosha;
    }

    public char getGjinia() {
        return gjinia;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setMosha(String mosha) {
        this.mosha = mosha;
    }

    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }

    public String toString() {
        String gjiniaStr = (gjinia == 'M') ? "mashkull" : "femer";

        // <id> : <emri> <mashkull / femer> <mosha> vjeç
        return id + " : " + emri + " " + gjiniaStr + " " + mosha + " vjec";
    }

    public abstract boolean garonIndividualisht();

    public boolean equals(Object obj) {
        if (obj instanceof Sportisti) {
            Sportisti s = (Sportisti) obj;
            return s.getId() == id;
        }
        return false;
    }

}