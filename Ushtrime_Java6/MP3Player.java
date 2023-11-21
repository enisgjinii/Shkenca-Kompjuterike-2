// Klasa MP3Player
package Ushtrime_Java6;

public class MP3Player extends PajisjaElektrike {
    // Atributi shtesë
    private int memoria; // në GB

    // Konstruktori
    public MP3Player(int numriSerik, String prodhuesi, int voltazhi, char kategoriaShpenzuese, int memoria) {
        super(numriSerik, prodhuesi, voltazhi, kategoriaShpenzuese);
        this.memoria = memoria;
    }

    // Metodat get dhe set për atributin memoria
    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // Metoda për paraqitjen në String për objektin MP3Player
    @Override
    public String toString() {
        return "MP3Player - " + super.toString() + " : " + memoria + " GB";
    }

    // Implementimi i metodes abstrakte kaBateri
    @Override
    public boolean kaBateri() {
        return true; // MP3Player ka bateri
    }
}
