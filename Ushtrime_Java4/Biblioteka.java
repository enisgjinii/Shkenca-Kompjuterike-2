public class Biblioteka {
    private String emri;
    private Publikimi[] publikimet;
    private int index = 0;

    public Biblioteka(String emri, int nr) {
        this.emri = emri;
        publikimet = new Publikimi[nr];
    }

    /* Ofroni metodën shtoPublikimin që e shton një publikim array nëse ai veq se */
    public void shtoPublikimin(Publikimi p) {
        for (int i = 0; i < index; i++) {
            if (publikimet[i].equals(p)) {
                System.out.println("Ky publikim ekziston");
                return;
            }

            if (index == publikimet.length) {
                System.out.println("Nuk ka vend ne array");
                return;
            }

            publikimet[index++] = p;
            System.out.println("Publikimi eshte shtuar me sukses: " + p);
        }
    }

    /**
     * This method finds the digital publication with the earliest publication date
     * that matches the given digital status.
     *
     * @param eshteDigjitale - Boolean indicating if the publication is digital
     * @return - The earliest digital publication
     */
    public Publikimi digjitalMeIVjeter(boolean eshteDigjitale) {
        // Initialize the earliest publication as null
        Publikimi p = null;

        // Loop over the publications
        for (int i = 0; i < index; i++) {
            // Check if the current publication is earlier than the previous earliest
            // publication or if the current publication matches the digital status
            if ((p == null || publikimet[i].eshteDigjitale() == eshteDigjitale)
                    && publikimet[i].getVitiIPublikimit() <= p.getVitiIPublikimit()
                            && publikimet[i].eshteDigjitale() == eshteDigjitale) {
                // If so, update the earliest publication
                p = publikimet[i];
            }
        }
        // Return the earliest digital publication
        return p;
    }

    public Libri[] libratDetyra(boolean kaDetyra) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (publikimet[i] instanceof Libri) {
                Libri l = (Libri) publikimet[i];
                if (l.kaDetyra() == kaDetyra) {
                    count++;
                }
            }
        }

        Libri[] librat = new Libri[count];
        int pozita = 0;

        for (int i = 0; i < index; i++) {
            if (publikimet[i] instanceof Libri) {
                Libri l = (Libri) publikimet[i];
                if (l.kaDetyra() == kaDetyra) {
                    librat[pozita++] = l;
                }
            }
        }

        return librat;
    }

    public void shtypJournalVolum(int volumn) {

        for (int i = 0; i < index; i++) {
            if (publikimet[i] instanceof Journal) {
                Journal j = (Journal) publikimet[i];
                if (j.getNrVolumit() == volumn) {
                    System.out.println(publikimet[i].toString());
                }
            }
        }

    }

    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka("UBT", 50);

        Journal j1 = new Journal("123-123", "journal 1", 2010, 30);
        Journal j2 = new Journal("122-123", "journal 2", 2013, 30);
        Journal j3 = new Journal("121-123", "journal 3", 2014, 20);

        LibriShkollor l1 = new LibriShkollor("123-123", "libri 1", 2009, 22, "Drejtimi1");
        LibriShkollor l2 = new LibriShkollor("122-123", "libri 2", 2010, 22, "Drejtimi2");
        LibriShkollor l3 = new LibriShkollor("121-123", "libri 3", 2011, 22, "Drejtimi3");

        Enciklopedia e1 = new Enciklopedia("123-123", "enciklopedia 1", 2009, 22, 3);
        Enciklopedia e2 = new Enciklopedia("122-123", "enciklopedia 2", 2010, 22, 4);
        Enciklopedia e3 = new Enciklopedia("121-123", "enciklopedia 3", 2011, 22, 5);

        biblioteka.shtoPublikimin(j1);
        biblioteka.shtoPublikimin(j2);
        biblioteka.shtoPublikimin(j3);
        biblioteka.shtoPublikimin(l1);
        biblioteka.shtoPublikimin(l2);
        biblioteka.shtoPublikimin(l3);
        biblioteka.shtoPublikimin(e1);
        biblioteka.shtoPublikimin(e2);
        biblioteka.shtoPublikimin(e3);
        System.out.println("--------------");
        System.out.println(biblioteka.digjitalMeIVjeter(true));
        System.out.println("--------------");

        Libri[] librat = biblioteka.libratDetyra(true);
        for (int i = 0; i < librat.length; i++) {
            System.out.println(librat[i].toString());
        }

        System.out.println("--------------");
        biblioteka.shtypJournalVolum(30);

    }
}