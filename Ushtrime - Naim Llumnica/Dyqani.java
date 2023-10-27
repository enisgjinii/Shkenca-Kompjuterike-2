
public class Dyqani {
    private String emri;
    private Paisja[] paisjet;
    private int index = 0;

    public Dyqani(String emri, int nrPaisjet) {
        this.emri = emri;
        paisjet = new Paisja[nrPaisjet];
    }

    public boolean ekziston(Paisja p) {
        for (int i = 0; i < index; i++) {
            if (paisjet[i].equals(p)) {
                return true;
            }
        }
        return false;
    }

    public void shtoPaisjen(Paisja p) {
        if (p == null) {
            System.out.println("Paisja nuk eshte shtu");
        } else if (ekziston(p)) {
            System.out.println("Paisja/ja: " + p + " vetem se gjendet ne stok");
        } else {
            paisjet[index++] = p;
        }
    }

    public void shtyEnelareseKategoria(String kategoria) {
        for (int i = 0; i < index; i++) {
            if (paisjet[i].getKategoriaShpenzuese().equals(kategoria)) {
                System.out.println(paisjet[i].toString());
            }
        }
    }

    public void shtypMP3Voltazhi(double voltazhi) {
        for (int i = 0; i < index; i++) {
            if (paisjet[i] instanceof MP3Player && paisjet[i].getVoltazhi() > voltazhi) {
                System.out.println(paisjet[i].toString());
            }
        }
    }

    public int ktheNumriProgrameve(int nrProgrameve) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (paisjet[i] instanceof Enelaresja && ((Enelaresja) paisjet[i]).getNrProgrameve() == nrProgrameve) {
                count++;
            }
        }
        return count;
    }

    public int fshijSipasMemories(int memoria) {
        int removedCount = 0;
        int currentIndex = 0;
        for (int i = 0; i < index; i++) {
            if (paisjet[i] instanceof MP3Player && ((MP3Player) paisjet[i]).getMemoria() != memoria) {
                paisjet[currentIndex] = paisjet[i];
                currentIndex++;
            } else {
                removedCount++;
            }
        }
        index = currentIndex;
        return removedCount;
    }

    public static void main(String[] args) {
        Dyqani dyqani = new Dyqani("ABC Shop", 50);

        Paisja paisja1 = new Enelaresja("12345", "Prodhuesi1", 220.0, "Kategoria1", 10);
        Paisja paisja2 = new Enelaresja("67890", "Prodhuesi2", 220.0, "Kategoria2", 8);
        Paisja paisja3 = new MP3Player("54321", "Prodhuesi3", 5.0, "Kategoria3", 16);

        dyqani.shtoPaisjen(paisja1);
        dyqani.shtoPaisjen(paisja2);
        dyqani.shtoPaisjen(paisja3);

        dyqani.shtyEnelareseKategoria("Kategoria1");
        dyqani.shtypMP3Voltazhi(4.0);
        int numriProgrameve = 8;
        System.out.println("Numri i pajisjeve me " + numriProgrameve + " programe: "
                + dyqani.ktheNumriProgrameve(numriProgrameve));

        int fshirje = dyqani.fshijSipasMemories(16);
        System.out.println("Fshirja u realizua, numri i pajisjeve të fshira: " + fshirje);
    }

}