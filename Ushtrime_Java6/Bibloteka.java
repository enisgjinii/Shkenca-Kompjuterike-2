public class Bibloteka {
    private String emri;
    private Libri[] librat;
    private int index = 0;

    public Bibloteka(String emri, int nr) {
        this.emri = emri;
        librat = new Libri[nr];
    }

    public boolean ekziston(Libri l) {
        for (int i = 0; i < index; i++) {
            if (librat[i].equals(l)) {
                return true;
            }
        }
        return false;
    }

    public void shtoLibri(Libri l) {
        if (ekziston(l)) {
            System.out.println("Libri ekziston");
            return;
        }
        if (index == librat.length) {
            System.out.println("Nuk ka vend ne vend bibliotekave");
            return;
        }
        librat[index++] = l;
        System.out.println("Libri eshte shtuar me sukses!");
    }

    public Libri meIRiuMeDetyra() {
        Libri l = null;
        for (int i = 0; i < index; i++) {
            if (l == null && librat[i].kaDetyra() || (librat[i].kaDetyra() && l != null)) {
                if (l == null || librat[i].getVitiIPublikimit() < l.getVitiIPublikimit()) {
                    l = librat[i];
                }
            }
        }
        return l;
    }

    public void shtypLibratEVitite(int viti) {
        for (int i = 0; i < index; i++) {
            if (librat[i] instanceof LibriShkollor && librat[i].getVitiIPublikimit() > viti) {
                System.out.println(librat[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        Bibloteka bibloteka = new Bibloteka("UBT", 50);
        LibriShkollor l1 = new LibriShkollor("123", "Libri Shkollor 1", 2010, "Drejtimi 1");
        LibriShkollor l2 = new LibriShkollor("456", "Libri Shkollor 2", 2010, "Drejtimi 2");
        LibriShkollor l3 = new LibriShkollor("789", "Libri Shkollor 3", 2010, "Drejtimi 3");

        Enciklopedia e1 = new Enciklopedia("123", "Enciklopedia 1", 2005, 5);
        Enciklopedia e2 = new Enciklopedia("456", "Enciklopedia 2", 2005, 5);
        Enciklopedia e3 = new Enciklopedia("789", "Enciklopedia 3", 2005, 5);

        bibloteka.shtoLibri(l1);
        bibloteka.shtoLibri(l2);
        bibloteka.shtoLibri(l3);

        bibloteka.shtoLibri(e1);
        bibloteka.shtoLibri(e2);
        bibloteka.shtoLibri(e3);

        System.out.println("--------------");
        bibloteka.shtypLibratEVitite(2010`);
        System.out.println("--------------");
        bibloteka.shtypLibratEVitite(2015);
    }
}
