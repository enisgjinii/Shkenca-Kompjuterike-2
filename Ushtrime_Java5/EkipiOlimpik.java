public class EkipiOlimpik {
    private String emri;
    private Sportisti[] sportistet;
    private int numriSportisteve;

    public EkipiOlimpik(String emri) {
        this.emri = emri;
        this.sportistet = new Sportisti[25];
        this.numriSportisteve = 0;
    }

    public class HedhesiGjyles extends Vrapuesi {
        private int peshaTrupore;

        public HedhesiGjyles(int id, String emri, int mosha, char gjinia, int nrMedaljeve, int distanca,
                int peshaTrupore) {
            super(id, emri, mosha, gjinia, nrMedaljeve, distanca);
            this.peshaTrupore = peshaTrupore;
        }

        @Override
        public String toString() {
            return "Hedhesi i gjyles me " + peshaTrupore + " kg - " + super.toString();
        }
    }

    public static class Mundesi extends Vrapuesi {
        private String kategoria;

        public Mundesi(int id, String emri, int mosha, char gjinia, int nrMedaljeve, int distanca, String kategoria) {
            super(id, emri, mosha, gjinia, nrMedaljeve, distanca);
            this.kategoria = kategoria;
        }

        @Override
        public String toString() {
            return "Mundesi i kategorise se " + kategoria + " - " + super.toString();
        }
    }

    public void shtoSportistin(Sportisti sportisti) {
        if (numriSportisteve < 25) {
            sportistet[numriSportisteve] = sportisti;
            numriSportisteve++;
            System.out.println("Sportisti u shtua me sukses në ekipin " + emri);
        } else {
            System.out.println("Ekipi është i mbushur. Sportisti nuk mund të shtohet.");
        }
    }

    public void shtypKategorine(String kategoria) {
        for (Sportisti sportisti : sportistet) {
            if (sportisti instanceof Mundesi && ((Mundesi) sportisti).kategoria.equals(kategoria)) {
                System.out.println(sportisti.toString());
            }
        }
    }

    public void hedhesitPesha(int pesha) {
        for (Sportisti sportisti : sportistet) {
            if (sportisti instanceof HedhesiGjyles && ((HedhesiGjyles) sportisti).peshaTrupore == pesha) {
                System.out.println(sportisti.toString());
            }
        }
    }

    public static void main(String[] args) {
        EkipiOlimpik ekipi = new EkipiOlimpik("Kosova Team");

        Futbollisti futbollisti = new Futbollisti(1, "Arianit", 25, 'M', 10);
        Karateisti karateisti = new Karateisti(2, "Dafina", 22, 'F', "Shotokan");
        Vrapuesi vrapuesi = new Vrapuesi(3, "Besart", 28, 'M', 5, 1500);
        EkipiOlimpik.HedhesiGjyles hedhesiGjyles = ekipi.new HedhesiGjyles(4, "Lorik", 30, 'M', 8, 30, 100);
        EkipiOlimpik.Mundesi mundesi = new EkipiOlimpik.Mundesi(5, "Albana", 26, 'F', 7, 500, "lehte");

        ekipi.shtoSportistin(futbollisti);
        ekipi.shtoSportistin(karateisti);
        ekipi.shtoSportistin(vrapuesi);
        ekipi.shtoSportistin(hedhesiGjyles);
        ekipi.shtoSportistin(mundesi);

        ekipi.shtypKategorine("lehte");
        ekipi.hedhesitPesha(100);
    }
}
