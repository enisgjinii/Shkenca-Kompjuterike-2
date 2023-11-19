public abstract class PajisjaElektrike extends Pajisja {
    protected int voltazhi;
    protected String kategoriaShpenzuese;

    public PajisjaElektrike(int numriSerik, String prodhuesi, int voltazhi, String kategoriaShpenzuese) {
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

    public String getKategoriaShpenzuese() {
        return kategoriaShpenzuese;
    }

    public void setKategoriaShpenzuese(String kategoriaShpenzuese) {
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }

    public abstract int getGarancioni();

    @Override
    public String toString() {
        return super.toString() + " " + voltazhi + " - " + kategoriaShpenzuese;
    }
}
