
package Ushtrime_Java6;
// Klasa Enelaresja
public class Enelaresja extends PajisjaElektrike {
    // Atributi shtesë
    private int nrProgrameve;

    // Konstruktori
    public Enelaresja(int numriSerik, String prodhuesi, int voltazhi, char kategoriaShpenzuese, int nrProgrameve) {
        super(numriSerik, prodhuesi, voltazhi, kategoriaShpenzuese);
        this.nrProgrameve = nrProgrameve;
    }

    // Metodat get dhe set për atributin nrProgrameve
    public int getNrProgrameve() {
        return nrProgrameve;
    }

    public void setNrProgrameve(int nrProgrameve) {
        this.nrProgrameve = nrProgrameve;
    }

    // Metoda për paraqitjen në String për objektin Enelaresja
    @Override
    public String toString() {
        return "Enelaresja me " + nrProgrameve + " programe - " + super.toString();
    }

    // Implementimi i metodes abstrakte kaBateri
    @Override
    public boolean kaBateri() {
        return false; // Enelaresja është një pajisje pa bateri
    }
}
