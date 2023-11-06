public class Karateisti extends Sportisti {
    public boolean garonIndividualisht() {
        return true;
    }

    private String stili;

    public Karateisti(int id, String emri, String mosha, char gjinia, String stili) {
        super(id, emri, mosha, gjinia);
        this.stili = stili;
    }

    public String getStili() {
        return stili;
    }

    public void setStili(String stili) {
        this.stili = stili;
    }

    public String toString() {
        // Karateisti me stil <stili> - <id> : <emri> <mashkull / femer> <mosha> vjeç
        return "Karateisti me stil " + stili + " " + super.toString();
    }
}