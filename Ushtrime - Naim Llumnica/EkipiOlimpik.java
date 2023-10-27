
public class EkipiOlimpik {

    private String emri;
    private Sportisti[] sportistet;
    private int index = 0;

    public EkipiOlimpik(String emri, int nrS) {
        this.emri = emri;
        sportistet = new Sportisti[nrS];
    }

    public boolean ekziston(Sportisti s) {
        for (int i = 0; i < index; i++) {
            if (sportistet[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public void shtoSportistin(Sportisti s) {
        if (s == null) {
            System.out.println("Sportisti nuk eshte shtu");
        } else if (index == sportistet.length) {
            System.out.println("Nuk ka vend ne ekip per te shtuar sportistin/en: " + s + "!");
        } else if (ekziston(s)) {
            System.out.println("Sportisti/ja: " + s + " vetem se gjendet ne ekip");
        } else {
            sportistet[index++] = s;
        }
    }

    public void shtypSipasGjinise(char gj) {
        if (index == 0) {
            System.out.println("Ky ekip nuk ka asnje sportist/e!");
            return;
        }

        for (int i = 0; i < index; i++) {
            if (sportistet[i].getGjinia() == gj) {
                System.out.println(sportistet[i].toString());
            }
        }
    }

    public Sportisti meIVjetri() {
        if (index == 0) {
            System.out.println("Ky ekip nuk ka asnje sportist!");
            return null;
        }

        Sportisti sVjeter = null;
        for (int i = 0; i < index; i++) {
            if (sVjeter == null || sVjeter.getMosha() < sportistet[i].getMosha()) {
                sVjeter = sportistet[i];
            }
        }

        return sVjeter;
    }

    public Sportisti[] ktheSipasEmrit(String param) {

        Sportisti[] spEmri = null;
        int count = 0;
        for (int i = 0; i < index; i++) {
            if ((sportistet[i].getEmri().toLowerCase()).startsWith(param.toLowerCase())) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Ne kete ekip, asnje sportisti/eje nuk i fillon emri me: " + param);
            return null;
        }

        spEmri = new Sportisti[count];
        int pozita = 0;
        for (int i = 0; i < index; i++) {
            if ((sportistet[i].getEmri().toLowerCase()).startsWith(param.toLowerCase())) {
                spEmri[pozita++] = sportistet[i];
            }
        }

        return spEmri;
    }

    public boolean largoSportistin(Sportisti s) {

        for (int i = 0; i < index; i++) {
            if (s.equals(sportistet[i])) {
                for (int j = i; j < index - 1; j++) {
                    sportistet[j] = sportistet[j + 1];
                }
                sportistet[--index] = null;
                i--;
                return true;
            }
        }

        return false;
    }

    public void shtypFutbollistetGjinia(char gjinia) {
        for (int i = 0; i < index; i++) {
            if (sportistet[i] instanceof Futbollisti) {
                if (sportistet[i].getGjinia() == gjinia) {
                    System.out.println(sportistet[i].toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        EkipiOlimpik ekipi = new EkipiOlimpik("Kosova Team", 25);
        Futbollisti f1 = new Futbollisti(1, "Futbollisti 1", (byte) 27, 'M', 10);
        Futbollisti f2 = new Futbollisti(2, "Futbollisti 2", (byte) 27, 'M', 10);
        Futbollisti f3 = new Futbollisti(3, "Futbollisti 3", (byte) 27, 'M', 10);

        Karateisti k1 = new Karateisti(1, "Karateisti 1", (byte) 27, 'M', "Stili");
        Karateisti k2 = new Karateisti(2, "Karateisti 2", (byte) 27, 'M', "Stili");
        Karateisti k3 = new Karateisti(3, "Karateisti 3", (byte) 27, 'M', "Stili");
        Karateisti k4 = new Karateisti(4, "Karateisti 4", (byte) 27, 'M', "Stili");

        ekipi.shtoSportistin(f1);
        ekipi.shtoSportistin(f2);
        ekipi.shtoSportistin(f3);
        ekipi.shtoSportistin(k1);
        ekipi.shtoSportistin(k2);
        ekipi.shtoSportistin(k3);
        ekipi.shtoSportistin(k4);
    }

    public void shtypKarateistetMeTeRi(int mosha) {
        for (int i = 0; i < index; i++) {
            if (sportistet[i] instanceof Karateisti) {
                if (sportistet[i].getMosha() < mosha) {
                    System.out.println(sportistet[i].toString());
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(sportistet[i]);
        }
    }

    // public static void main(String[] args) {

    // EkipiOlimpik eKS = new EkipiOlimpik("Kosova Team", 25);

    // Sportisti s1 = new Sportisti(202112345, "Vedat Muriqi", (byte) 27, 'M');
    // Sportisti s2 = new Sportisti(202112345, "Vedat Muriqi", (byte) 27, 'M');
    // Sportisti s3 = new Sportisti(202112345, "Vedat Muriqi", (byte) 27, 'M');
    // Sportisti s4 = new Sportisti(202112345, "Vedat Muriqi", (byte) 27, 'M');

    // eKS.shtoSportistin(s1);
    // eKS.shtoSportistin(s2);
    // eKS.shtoSportistin(s3);
    // eKS.shtoSportistin(s4);
    // System.out.println("--------------------");
    // eKS.print();

    // eKS.largoSportistin(s3);
    // eKS.print();
    // System.out.println("------------");
    // System.out.println(eKS.meIVjetri());
    // }
}