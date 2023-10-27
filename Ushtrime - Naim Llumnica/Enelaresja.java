public class Enelaresja extends Paisja {
    private int nrProgrameve;

    public Enelaresja(String numriSerik, String prodhuesi, double voltazhi, String kategoriaShpenzuese,
            int nrProgrameve) {
        super(numriSerik, prodhuesi, voltazhi, kategoriaShpenzuese);
        this.nrProgrameve = nrProgrameve;
    }

    public int getNrProgrameve() {
        return nrProgrameve;
    }

    public void setNrProgrameve(int nrProgrameve) {
        this.nrProgrameve = nrProgrameve;
    }

    public String toString() {
        return "Enelaresja me : " + nrProgrameve + "programe - " + super.toString();
    }

}