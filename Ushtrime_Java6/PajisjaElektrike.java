package Ushtrime_Java6;

public abstract class PajisjaElektrike extends Pajisja {
    // Atributet shtesë
    private int voltazhi;
    private char kategoriaShpenzuese;

    // Konstruktori
    public PajisjaElektrike(int numriSerik, String prodhuesi, int voltazhi, char kategoriaShpenzuese) {
        super(numriSerik, prodhuesi);
        this.voltazhi = voltazhi;
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }

    // Metodat get dhe set
    public int getVoltazhi() {
        return voltazhi;
    }

    public void setVoltazhi(int voltazhi) {
        this.voltazhi = voltazhi;
    }

    public char getKategoriaShpenzuese() {
        return kategoriaShpenzuese;
    }

    public void setKategoriaShpenzuese(char kategoriaShpenzuese) {
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }

    // Metoda abstrakte kaBateri
    public abstract boolean kaBateri();

    // Metoda për paraqitjen në String
    @Override
    public String toString() {
        return super.toString() + " " + voltazhi + " - " + kategoriaShpenzuese;
    }
}
