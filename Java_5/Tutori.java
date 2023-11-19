public class Tutori extends Mesimdhenesi {
    private byte vitiIStudimeve;

    public Tutori(String emri, short vitiLindjes, String angazhimi, byte vitiIStudimeve) {
        super(emri, vitiLindjes, "tutorime");
        this.vitiIStudimeve = vitiIStudimeve;
    }

    public byte getVitiIStudimeve() {
        return vitiIStudimeve;
    }

    public void setVitiIStudimeve(byte vitiIStudimeve) {
        this.vitiIStudimeve = vitiIStudimeve;
    }

    public boolean mentoron() {
        return false;
    }

    public String toString() {
        return "Tutori i vitit " + vitiIStudimeve + " " + super.toString();
    }
}
