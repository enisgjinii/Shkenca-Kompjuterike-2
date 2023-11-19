public class Enelaresja extends PajisjaElektrike {
    private int nrProgrameve;

    public Enelaresja(int numriSerik, String prodhuesi, int voltazhi, String kategoriaShpenzuese, int nrProgrameve) {
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
    public int getGarancioni() {
        return 5;
    }

    @Override
    public String toString() {
        return "Enelaresja me " + nrProgrameve + " programe - " + super.toString();
    }
}
