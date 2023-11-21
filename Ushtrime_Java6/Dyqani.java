
package Ushtrime_Java6;

public class Dyqani {
    // Atributet
    private String emri;
    private Pajisje[] pajisjet;
    private int numriPajisjeve;

    // Konstruktori
    public Dyqani(String emri) {
        this.emri = emri;
        this.pajisjet = new Pajisje[35];
        this.numriPajisjeve = 0;
    }

    // Klasa e brendshme Turiela
    public class Turiela extends Pajisje {
        private int gjatesia;

        public Turiela(int numriSerik, String prodhuesi, int gjatesia) {
            super(numriSerik, prodhuesi);
            this.gjatesia = gjatesia;
        }

        @Override
        public String toString() {
            return "Turiela " + getNumriSerik() + " : " + getProdhuesi() + " me shpim " + gjatesia + " cm";
        }
    }

    // Klasa e ndërthurur (nested class) TV
    public static class TV extends PajisjaElektrike {
        private boolean eshteHD;

        public TV(int numriSerik, String prodhuesi, int voltazhi, char kategoriaShpenzuese, boolean eshteHD) {
            super(numriSerik, prodhuesi, voltazhi, kategoriaShpenzuese);
            this.eshteHD = eshteHD;
        }

        @Override
        public boolean kaBateri() {
            return false; // TV pa bateri
        }

        @Override
        public String toString() {
            return "TV " + (eshteHD ? "HD" : "jo HD") + " : " + super.toString();
        }
    }

    // Metoda shtoPajisjen
    public void shtoPajisjen(Pajisje pajisje) {
        if (numriPajisjeve < 35) {
            if (!containsPajisje(pajisje)) {
                pajisjet[numriPajisjeve] = pajisje;
                numriPajisjeve++;
                System.out.println("Pajisja u shtua me sukses.");
            } else {
                System.out.println("Pajisja ekziston në dyqan.");
            }
        } else {
            System.out.println("Dyqani është i mbushur, nuk mund të shtohen më pajisje.");
        }
    }

    // Metoda shtoNjePajisjeElektrike
    public void shtoNjePajisjeElektrike(PajisjaElektrike pajisjeElektrike) {
        shtoPajisjen(pajisjeElektrike);
    }

    // Metoda shtoFshese
    public void shtoFshese(String prodhuesi, int voltazhi, char kategoriaShpenzuese, int shpenzimeNeVat) {
        Fshesa fshesa = new Fshesa(numriPajisjeve + 1, prodhuesi, voltazhi, kategoriaShpenzuese, shpenzimeNeVat);
        shtoPajisjen(fshesa);
    }

    // Klasa e ndërthurur Fshesa
    private class Fshesa extends PajisjaElektrike {
        private int shpenzimeNeVat;

        public Fshesa(int numriSerik, String prodhuesi, int voltazhi, char kategoriaShpenzuese, int shpenzimeNeVat) {
            super(numriSerik, prodhuesi, voltazhi, kategoriaShpenzuese);
            this.shpenzimeNeVat = shpenzimeNeVat;
        }

        @Override
        public boolean kaBateri() {
            return false; // Fshesa pa bateri
        }

        @Override
        public String toString() {
            return "Fshesa <" + getNumriSerik() + "> : " + getProdhuesi() + " " + getVoltazhi() + " - "
                    + getKategoriaShpenzuese() +
                    " shpenzon " + shpenzimeNeVat + " vat";
        }
    }

    // Metoda shtypPajisjetElektrike
    public void shtypPajisjetElektrike(boolean meBateri) {
        for (int i = 0; i < numriPajisjeve; i++) {
            if (pajisjet[i] instanceof PajisjaElektrike) {
                PajisjaElektrike pajisjaElektrike = (PajisjaElektrike) pajisjet[i];
                if (pajisjaElektrike.kaBateri() == meBateri) {
                    System.out.println(pajisjaElektrike.toString());
                }
            }
        }
    }

    // Metoda avgMemoria
    public PajisjaElektrike avgMemoria() {
        if (numriPajisjeve == 0) {
            return null;
        }

        int totalMemoria = 0;
        int count = 0;

        for (int i = 0; i < numriPajisjeve; i++) {
            if (pajisjet[i] instanceof PajisjaElektrike) {
                PajisjaElektrike pajisjaElektrike = (PajisjaElektrike) pajisjet[i];
                totalMemoria += (pajisjaElektrike instanceof MP3Player) ? ((MP3Player) pajisjaElektrike).getMemoria()
                        : 0;
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        int mesatarjaMemoria = totalMemoria / count;
        PajisjaElektrike pajisjaMePakMemori = null;

        for (int i = 0; i < numriPajisjeve; i++) {
            if (pajisjet[i] instanceof PajisjaElektrike) {
                PajisjaElektrike pajisjaElektrike = (PajisjaElektrike) pajisjet[i];
                if (pajisjaElektrike instanceof MP3Player) {
                    int memoria = ((MP3Player) pajisjaElektrike).getMemoria();
                    if (memoria < mesatarjaMemoria && (pajisjaMePakMemori == null
                            || memoria < ((MP3Player) pajisjaMePakMemori).getMemoria())) {
                        pajisjaMePakMemori = pajisjaElektrike;
                    }
                }
            }
        }

        return pajisjaMePakMemori;
    }

    // Metoda main
    public static void main(String[] args) {
        Dyqani dyqani = new Dyqani("ABC Shop");

        dyqani.shtoPajisjen(dyqani.new Turiela(1, "BrandX", 30));
        dyqani.shtoNjePajisjeElektrike(dyqani.new TV(2, "Samsung", 220, 'A', false));
        dyqani.shtoFshese("Philips", 240, 'B', 1500);

        dyqani.shtypPajisjetElektrike(true);
        dyqani.shtypPajisjetElektrike(false);

        PajisjaElektrike pajisjaMePakMemori = dyqani.avgMemoria();
        if (pajisjaMePakMemori != null) {
            System.out.println("Pajisja me pak memorie se mesatarja: " + pajisjaMePakMemori.toString());
        } else {
            System.out.println("Nuk ka pajisje elektrike me memorie.");
        }
    }
}
