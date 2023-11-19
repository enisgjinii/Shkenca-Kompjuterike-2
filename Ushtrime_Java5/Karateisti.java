public class Karateisti extends Sportisti {
    private String stili;

    public Karateisti(int id, String emri, int mosha, char gjinia, String stili) {
        super(id, emri, mosha, gjinia);
        this.stili = stili;
    }

    @Override
    public String toString() {
        return "Karateisti me stil " + stili + " - " + super.toString();
    }
}
