public class Fakulteti {
    private String drejtimin;
    Mesimdhenesi[] mesimdhenesit;
    int index = 0;

    public Fakulteti(String drejtimin, int nrM) {

        this.drejtimin = drejtimin;
        mesimdhenesit = new Mesimdhenesi[nrM];
    }

    public void printAll() {
        for (int i = 0; i < index; i++) {
            System.out.println(mesimdhenesit[i].toString());
        }
    }

    public boolean ekziston(Mesimdhenesi m) {
        for (int i = 0; i < index; i++) {
            if (mesimdhenesit[i].equals(m)) {
                return true;
            }
        }
        return false;
    }

    public void shtoMesimdhenesi(Mesimdhenesi m) {
        if (m == null) {
            System.out.println("Mesimdhenesi eshte null");
            return;
        }

        if (ekziston(m)) {
            System.out.println("Mesimdhenesi ekziston");
            return;
        }

        if (index == mesimdhenesit.length) {
            System.out.println("Nuk ka vend ne vend");
            return;
        }

        mesimdhenesit[index++] = m;
    }

    public static void main(String[] args) {
        Fakulteti f1 = new Fakulteti("SHK1", 15);

        Profesori p1 = new Profesori("P1", (short) 1997, "Asistent", "1");
        Profesori p2 = new Profesori("P2", (short) 1998, "Asistent", "2");
        Profesori p3 = new Profesori("P3", (short) 1999, "Asistent", "3");

        Asistenti a1 = new Asistenti("A1", (short) 1997, "Asistent", "Numerike");
        Asistenti a2 = new Asistenti("A2", (short) 1998, "Asistent", "Laboratike");
        Asistenti a3 = new Asistenti("A3", (short) 1999, "Asistent", "Numerike");

        f1.shtoMesimdhenesi(p1);
        f1.shtoMesimdhenesi(p2);
        f1.shtoMesimdhenesi(p3);
        f1.shtoMesimdhenesi(a1);
        f1.shtoMesimdhenesi(a2);
        f1.shtoMesimdhenesi(a3);

    }
}
