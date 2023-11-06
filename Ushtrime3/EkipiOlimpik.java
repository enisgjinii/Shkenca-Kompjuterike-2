public class EkipiOlimpik {
    private String emri;
    private Sportisti[] sportistet;
    private int index = 0;

    public EkipiOlimpik(String emri, int nr) {
        this.emri = emri;
        sportistet = new Sportisti[nr];
    }

    public boolean ekziston(Sportisti sportisti) {
        for (int i = 0; i < index; i++) {
            if (sportistet[i].equals(sportisti)) {
                return true;
            }
        }
        return false;
    }

    public void shtoSportistin(Sportisti sportisti) {
        if (ekziston(sportisti)) {
            System.out.println("Sportisti ekziston");
            return;
        }
        if (index == sportistet.length) {
            System.out.println("Nuk ka vend në ekipin olimpik");
            return;
        }
        sportistet[index++] = sportisti;
        System.out.println("Sportisti është shtuar me sukses!");
    }

    public Sportisti meIRiuMeDetyra() {
        Sportisti s = null;
        for (int i = 0; i < index; i++) {
            if ((s == null && sportistet[i].kaDetyra()) || (sportistet[i].kaDetyra() && s != null)) {
                if (s == null || sportistet[i].getVitiIPublikimit() < s.getVitiIPublikimit()) {
                    s = sportistet[i];
                }
            }
        }
        return s;
    }

    public void shtypSportistetMeMoshe(int mosha) {
        for (int i = 0; i < index; i++) {
            if (sportistet[i] instanceof Karateisti && sportistet[i].getMosha() < mosha) {
                System.out.println(sportistet[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        EkipiOlimpik ekipi = new EkipiOlimpik("Kosova Team", 25);
        Karateisti sportisti1 = new Karateisti("123", "Ardian", 25, "M", "Shotokan");
        Karateisti sportisti2 = new Karateisti("456", "Liridona", 23, "F", "Wado-Ryu");
        Futbollisti sportisti3 = new Futbollisti("789", "Dren", 22, "M", 7);

        ekipi.shtoSportistin(sportisti1);
        ekipi.shtoSportistin(sportisti2);
        ekipi.shtoSportistin(sportisti3);

        System.out.println("Sportisti me moshe mbi 24 vjec:");
        ekipi.shtypSportistetMeMoshe(24);

        Sportisti meIRiuMeDetyra = ekipi.meIRiuMeDetyra();
        System.out.println("Sportisti me detyra me i ri eshte: " + meIRiuMeDetyra.toString());
    }
}
