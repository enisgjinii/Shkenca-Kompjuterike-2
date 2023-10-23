public class Fakulteti {
    private String drejtimi;
    private Mesimdhenesi[] mesimdhenesit;
    private int numriMesimdhenesve;

    // Konstruktori
    public Fakulteti(String drejtimi, int numriMesimdhenesve) {
        this.drejtimi = drejtimi;
        this.mesimdhenesit = new Mesimdhenesi[numriMesimdhenesve];
        this.numriMesimdhenesve = 0;
    }

    // Metoda ekziston
    public boolean ekziston(Mesimdhenesi mesimdhenesi) {
        for (int i = 0; i < numriMesimdhenesve; i++) {
            if (mesimdhenesi.equals(mesimdhenesit[i])) {
                return true;
            }
        }
        return false;
    }

    // Metoda shtoMesimdhenesin
    public void shtoMesimdhenesin(Mesimdhenesi mesimdhenesi) {
        if (!ekziston(mesimdhenesi) && numriMesimdhenesve < mesimdhenesit.length) {
            mesimdhenesit[numriMesimdhenesve] = mesimdhenesi;
            numriMesimdhenesve++;
        }
    }

    // Metoda mesimdhenesiMeIRi
    public Mesimdhenesi mesimdhenesiMeIRi() {
        if (numriMesimdhenesve == 0) {
            return null;
        }

        Mesimdhenesi mesimdhenesiIRi = mesimdhenesit[0];
        for (int i = 1; i < numriMesimdhenesve; i++) {
            if (mesimdhenesit[i].getVitiLindjes() > mesimdhenesiIRi.getVitiLindjes()) {
                mesimdhenesiIRi = mesimdhenesit[i];
            } else if (mesimdhenesit[i].getVitiLindjes() == mesimdhenesiIRi.getVitiLindjes()) {
                // Nëse ka më tepër se një mësimdhënës më të ri me vit të lindjes të njëjtë,
                // marrim mësimdhënësin e fundit që e plotëson këtë kusht
                mesimdhenesiIRi = mesimdhenesit[i];
            }
        }
        return mesimdhenesiIRi;
    }

    // Metoda shtypAngazhimet
    public void shtypAngazhimet(String angazhimi) {
        System.out.println("Mësimdhënësit me angazhim '" + angazhimi + "':");
        for (int i = 0; i < numriMesimdhenesve; i++) {
            if (mesimdhenesit[i].getAngazhimi().equals(angazhimi)) {
                System.out.println(mesimdhenesit[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        Fakulteti fakulteti = new Fakulteti("Shkenca Kompjuterike dhe Inxhinieri", 15);

        // Shtoni disa mësimdhënës
        Mesimdhenesi mesimdhenesi1 = new Mesimdhenesi("Fistek Filani", 1985, "Asistent");
        Mesimdhenesi mesimdhenesi2 = new Mesimdhenesi("Profesori 1", 1990, "Profesor");
        Mesimdhenesi mesimdhenesi3 = new Mesimdhenesi("Profesori 2", 1995, "Profesor");

        fakulteti.shtoMesimdhenesin(mesimdhenesi1);
        fakulteti.shtoMesimdhenesin(mesimdhenesi2);
        fakulteti.shtoMesimdhenesin(mesimdhenesi3);

        // Testoni a ekziston mësimdhënësi "Fistek Filani : 1985 - Asistent"
        boolean ekziston = fakulteti.ekziston(new Mesimdhenesi("Fistek Filani", 1985, "Asistent"));
        System.out.println("Ekziston 'Fistek Filani : 1985 - Asistent'? " + ekziston);

        // Shtypni (afishoni) mësimdhënësin më të ri
        Mesimdhenesi mesimdhenesiIRi = fakulteti.mesimdhenesiMeIRi();
        if (mesimdhenesiIRi != null) {
            System.out.println("Mësimdhënësi më i ri: " + mesimdhenesiIRi.toString());
        } else {
            System.out.println("Nuk ka mësimdhënës në fakultet.");
        }

        // Shtypni (afishoni) mësimdhënësit me angazhim "Profesor"
        fakulteti.shtypAngazhimet("Profesor");
    }
}
