public class Enelaresja extends PajisjaElektrike {
    private int nrProgrameve;

    public Enelaresja(int numriSerik, String prodhuesi, int voltazhi, char kategoriaShpenzuese, int nrProgrameve) {
        super(numriSerik, prodhuesi, voltazhi, kategoriaShpenzuese);
        this.nrProgrameve = nrProgrameve;
    }

    public int getNrProgrameve() {
        return nrProgrameve;
    }

    public void setNrProgrameve(int nrProgrameve) {
        this.nrProgrameve = nrProgrameve;
    }

    @Override
    public String toString() {
        return "Enelaresja me " + nrProgrameve + " programe - " + super.toString();
    }
}
