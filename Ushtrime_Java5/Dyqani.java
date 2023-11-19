public class Dyqani {
    private String emri;
    private Pajisja[] pajisjet;
    private int numriPajisjeve;

    public Dyqani(String emri) {
        this.emri = emri;
        this.pajisjet = new Pajisja[25];
        this.numriPajisjeve = 0;
    }

    public class Turiela extends Pajisja {
        private int gjatesia;

        public Turiela(int numriSerik, String prodhuesi, int gjatesia) {
            super(numriSerik, prodhuesi);
            this.gjatesia = gjatesia;
        }

        public int getGjatesia() {
            return gjatesia;
        }

        public void setGjatesia(int gjatesia) {
            this.gjatesia = gjatesia;
        }

        @Override
        public String toString() {
            return "Turiela " + super.toString() + " me shpim " + gjatesia + " cm";
        }
    }

    public static class TV extends PajisjaElektrike {
        private boolean eshteHD;

        public TV(int numriSerik, String prodhuesi, int voltazhi, char kategoriaShpenzuese, boolean eshteHD) {
            super(numriSerik, prodhuesi, voltazhi, kategoriaShpenzuese);
            this.eshteHD = eshteHD;
        }

        public boolean isEshteHD() {
            return eshteHD;
        }

        public void setEshteHD(boolean eshteHD) {
            this.eshteHD = eshteHD;
        }

        @Override
        public String toString() {
            return "TV " + (eshteHD ? "HD" : "jo HD") + " : " + super.toString();
        }
    }

    public void shtoPajisjen(Pajisja pajisja) {
        if (numriPajisjeve < 25) {
            pajisjet[numriPajisjeve] = pajisja;
            numriPajisjeve++;
            System.out.println("Pajisja u shtua me sukses në dyqanin " + emri);
        } else {
            System.out.println("Dyqani është i mbushur. Pajisja nuk mund të shtohet.");
        }
    }

    public void shtypHD(boolean eshteHD) {
        for (Pajisja pajisja : pajisjet) {
            if (pajisja instanceof TV && ((TV) pajisja).eshteHD == eshteHD) {
                System.out.println(pajisja.toString());
            }
        }
    }

    public void turielatGjatesia(int gjatesia) {
        for (Pajisja pajisja : pajisjet) {
            if (pajisja instanceof Turiela && ((Turiela) pajisja).gjatesia == gjatesia) {
                System.out.println(pajisja.toString());
            }
        }
    }

    public static void main(String[] args) {
        Dyqani dyqani = new Dyqani("ABC Shop");

        Enelaresja enelaresja = new Enelaresja(1, "Philips", 220, 'A', 5);
        MP3Player mp3Player = new MP3Player(2, "Sony", 5, 'C', 16);
        MulliriKafes mulliriKafes = new MulliriKafes(3, "Bosch", "Inox");
        Dyqani.Turiela turiela = dyqani.new Turiela(4, "Toshiba", 120);
        Dyqani.TV tvHD = new Dyqani.TV(5, "Samsung", 220, 'B', true);

        dyqani.shtoPajisjen(enelaresja);
        dyqani.shtoPajisjen(mp3Player);
        dyqani.shtoPajisjen(mulliriKafes);
        dyqani.shtoPajisjen(turiela);
        dyqani.shtoPajisjen(tvHD);

        dyqani.shtypHD(true);
        dyqani.turielatGjatesia(120);
    }
}
