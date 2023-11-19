public class Dyqani {
    private String emri;
    private Pajisja[] pajisjet;
    private int numriPajisjeve;

    public Dyqani(String emri, int numriPajisjeve) {
        this.emri = emri;
        this.numriPajisjeve = numriPajisjeve;
        this.pajisjet = new Pajisja[numriPajisjeve];
    }

    public void shtoPajisjen(Pajisja pajisja) {
        if (!containsPajisja(pajisja) && pajisjet.length < 50) {
            for (int i = 0; i < pajisjet.length; i++) {
                if (pajisjet[i] == null) {
                    pajisjet[i] = pajisja;
                    break;
                }
            }
        }
    }

    private boolean containsPajisja(Pajisja pajisja) {
        for (Pajisja p : pajisjet) {
            if (p != null && p.equals(pajisja)) {
                return true;
            }
        }
        return false;
    }

    public void shtypPajisjetMeGarancion(int vitiGarancionit) {
        for (Pajisja pajisja : pajisjet) {
            if (pajisja instanceof PajisjaElektrike) {
                PajisjaElektrike elektrike = (PajisjaElektrike) pajisja;
                if (elektrike.getGarancioni() > vitiGarancionit) {
                    System.out.println(pajisja);
                }
            }
        }
    }

    public void ktheEnelaresetProdhuesi5(String prodhuesi) {
        for (Pajisja pajisja : pajisjet) {
            if (pajisja instanceof Enelaresja) {
                Enelaresja enelaresja = (Enelaresja) pajisja;
                if (enelaresja.getProdhuesi().equals(prodhuesi) && enelaresja.getNrProgrameve() > 5) {
                    System.out.println(enelaresja);
                }
            }
        }
    }

    public void ktheMullirinEKafesMateriali(String materiali) {
        for (Pajisja pajisja : pajisjet) {
            if (pajisja instanceof MulliriKafes) {
                MulliriKafes mulliriKafes = (MulliriKafes) pajisja;
                if (mulliriKafes.getMateriali().equals(materiali)) {
                    System.out.println(mulliriKafes);
                    break; // Only print the first one found
                }
            }
        }
    }

    public static void main(String[] args) {
        Dyqani dyqani = new Dyqani("ABC Shop", 50);

        Enelaresja enelaresja1 = new Enelaresja(1, "Enela", 220, "A", 8);
        Enelaresja enelaresja2 = new Enelaresja(2, "Enela", 220, "B", 3);

        MP3Player mp3Player = new MP3Player(3, "Sony", 110, "C", 16);

        MulliriKafes mulliriKafes = new MulliriKafes(4, "Mulliri", "Alumini");

        dyqani.shtoPajisjen(enelaresja1);
        dyqani.shtoPajisjen(enelaresja2);
        dyqani.shtoPajisjen(mp3Player);
        dyqani.shtoPajisjen(mulliriKafes);

        dyqani.shtypPajisjetMeGarancion(3);
        dyqani.ktheEnelaresetProdhuesi5("Enela");
        dyqani.ktheMullirinEKafesMateriali("Alumini");
    }
}
