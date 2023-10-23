public class Mesimdhenesi {
    private final String emri;
    private int vitiLindjes;
    private String angazhimi;

    // Konstruktori
    public Mesimdhenesi(String emri, int vitiLindjes, String angazhimi) {
        this.emri = emri;
        this.vitiLindjes = vitiLindjes;
        this.angazhimi = angazhimi;
    }

    // Metodat get dhe set për atributet të cilat duhet të jenë të ndryshueshme
    public int getVitiLindjes() {
        return vitiLindjes;
    }

    public void setVitiLindjes(int vitiLindjes) {
        this.vitiLindjes = vitiLindjes;
    }

    public String getAngazhimi() {
        return angazhimi;
    }

    public void setAngazhimi(String angazhimi) {
        this.angazhimi = angazhimi;
    }

    // Metoda për paraqitjen në formatin e kërkuar
    @Override
    public String toString() {
        return emri + " : " + vitiLindjes + " - " + angazhimi;
    }

    // Metoda për krahasimin e dy objekteve Mesimdhenesi për barazi
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Mesimdhenesi that = (Mesimdhenesi) obj;
        return vitiLindjes == that.vitiLindjes && emri.equals(that.emri);
    }

    public static void main(String[] args) {
        Mesimdhenesi mesimdhenesi1 = new Mesimdhenesi("John Doe", 1985, "Profesor");
        Mesimdhenesi mesimdhenesi2 = new Mesimdhenesi("Jane Smith", 1990, "Asistent");
        Mesimdhenesi mesimdhenesi3 = new Mesimdhenesi("John Doe", 1985, "Profesor");

        // Testoni metodën toString
        System.out.println(mesimdhenesi1.toString());
        System.out.println(mesimdhenesi2.toString());
        System.out.println(mesimdhenesi3.toString());

        // Testoni metodën equals
        System.out.println("mesimdhenesi1 == mesimdhenesi2: " + mesimdhenesi1.equals(mesimdhenesi2));
        System.out.println("mesimdhenesi1 == mesimdhenesi3: " + mesimdhenesi1.equals(mesimdhenesi3));
    }
}
