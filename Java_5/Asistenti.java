public class Asistenti extends Mesimdhenesi {
    private String llojiUshtrimeve;

    public Asistenti(String emri, short vitiLindjes, String angazhimi, String llojiUshtrimeve) {
        super(emri, vitiLindjes, "Ushtrime");
        this.llojiUshtrimeve = llojiUshtrimeve;
    }

    public String getThirrjaAkademike() {
        return llojiUshtrimeve;
    }

    public void setThirrjaAkademike(String llojiUshtrimeve) {
        this.llojiUshtrimeve = llojiUshtrimeve;
    }

    public boolean mentoron() {
        return true;
    }

    public String toString() {
        return "Profesori " + super.toString() + " ka thirrje : " + llojiUshtrimeve;
    }
}
