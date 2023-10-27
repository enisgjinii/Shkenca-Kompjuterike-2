public class MP3Player extends Paisja {
    private int memoria;

    public MP3Player(String numriSerik, String prodhuesi, double voltazhi, String kategoriaShpenzuese, int memoria) {
        super(numriSerik, prodhuesi, voltazhi, kategoriaShpenzuese);
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String toString() {
        return "MP3Player - " + super.toString() + " - " + memoria;
    }

}