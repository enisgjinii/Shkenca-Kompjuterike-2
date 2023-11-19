public class MP3Player extends PajisjaElektrike {
    private int memoria;

    public MP3Player(int numriSerik, String prodhuesi, int voltazhi, char kategoriaShpenzuese, int memoria) {
        super(numriSerik, prodhuesi, voltazhi, kategoriaShpenzuese);
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "MP3Player - " + super.toString() + " : " + memoria + " GB";
    }
}
