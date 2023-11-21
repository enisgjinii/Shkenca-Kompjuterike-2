package Ushtrime_Java6;

// Klasa MulliriKafes
public class MulliriKafes extends Pajisja {
    // Atributi shtesë
    private String materiali;

    // Konstruktori
    public MulliriKafes(int numriSerik, String prodhuesi, String materiali) {
        super(numriSerik, prodhuesi);
        this.materiali = materiali;
    }

    // Metodat get dhe set për atributin materiali
    public String getMateriali() {
        return materiali;
    }

    public void setMateriali(String materiali) {
        this.materiali = materiali;
    }

    // Metoda për paraqitjen në String për objektin MulliriKafes
    @Override
    public String toString() {
        return "Mulliri i kafes prej " + materiali + " - " + super.toString();
    }
}
