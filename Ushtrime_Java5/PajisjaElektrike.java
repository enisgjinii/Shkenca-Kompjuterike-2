public abstract class PajisjaElektrike extends Pajisja {
    protected int voltazhi;
    protected char kategoriaShpenzuese;

    public PajisjaElektrike(int numriSerik, String prodhuesi, int voltazhi, char kategoriaShpenzuese) {
        super(numriSerik, prodhuesi);
        this.voltazhi = voltazhi;
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }

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

    public abstract boolean kaBateri();

    @Override
    public String toString() {
        return super.toString() + " " + voltazhi + "V - " + kategoriaShpenzuese;
    }
}
