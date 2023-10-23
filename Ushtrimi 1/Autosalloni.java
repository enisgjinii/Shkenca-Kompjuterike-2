public class Autosalloni {
    private String emri;
    private Automjeti[] automjetet;
    private int numriAutomjeteve;

    // Konstruktori
    public Autosalloni(String emri, int numriAutomjeteve) {
        this.emri = emri;
        this.automjetet = new Automjeti[numriAutomjeteve];
        this.numriAutomjeteve = 0;
    }

    // Metoda exists
    public boolean exists(Automjeti automjeti) {
        for (int i = 0; i < numriAutomjeteve; i++) {
            if (automjeti.equals(automjetet[i])) {
                return true;
            }
        }
        return false;
    }

    // Metoda shtoAutomjetin
    public void shtoAutomjetin(Automjeti automjeti) {
        if (!exists(automjeti) && numriAutomjeteve < automjetet.length) {
            automjetet[numriAutomjeteve] = automjeti;
            numriAutomjeteve++;
        }
    }

    // Metoda shtypSipasProdhuesit
    public void shtypSipasProdhuesit(String prodhuesi) {
        System.out.println("Automjetet e prodhuesit '" + prodhuesi + "':");
        for (int i = 0; i < numriAutomjeteve; i++) {
            if (automjetet[i].getProdhuesi().equals(prodhuesi)) {
                System.out.println(automjetet[i].toString());
            }
        }
    }

    // Metoda meIVjetri
    public Automjeti meIVjetri() {
        if (numriAutomjeteve == 0) {
            return null;
        }

        Automjeti automjetiIVjeter = automjetet[0];
        for (int i = 1; i < numriAutomjeteve; i++) {
            if (automjetet[i].getVitiProdhimit() < automjetiIVjeter.getVitiProdhimit()) {
                automjetiIVjeter = automjetet[i];
            }
        }
        return automjetiIVjeter;
    }

    // Metoda fshijAutomjetet
    public void fshijAutomjetet(int viti) {
        int indeksi = 0;
        for (int i = 0; i < numriAutomjeteve; i++) {
            if (automjetet[i].getVitiProdhimit() > viti) {
                automjetet[indeksi] = automjetet[i];
                indeksi++;
            }
        }
        numriAutomjeteve = indeksi;
    }

    public static void main(String[] args) {
        Autosalloni salloni = new Autosalloni("Salloni ABC", 50);

        // Shtoni disa automjete
        Automjeti automjeti1 = new Automjeti("XYZABC123409873CDE", "Mercedes-Benz", 2015);
        Automjeti automjeti2 = new Automjeti("ABCXYZ987654321DEF", "OPEL", 2005);
        Automjeti automjeti3 = new Automjeti("123DEF456ABC789XYZ", "Mercedes-Benz", 2010);

        salloni.shtoAutomjetin(automjeti1);
        salloni.shtoAutomjetin(automjeti2);
        salloni.shtoAutomjetin(automjeti3);

        // Testoni a ekziston automjeti "XYZABC123409873CDE : Mercedes-Benz - 2015"
        boolean ekziston = salloni.exists(new Automjeti("XYZABC123409873CDE", "Mercedes-Benz", 2015));
        System.out.println("Ekziston 'XYZABC123409873CDE : Mercedes-Benz - 2015'? " + ekziston);

        // Shtypni (afishoni) automjetet e prodhuesit "OPEL"
        salloni.shtypSipasProdhuesit("OPEL");

        // Shtypni (afishoni) automjetin më të vjetër
        Automjeti automjetiIVjeter = salloni.meIVjetri();
        if (automjetiIVjeter != null) {
            System.out.println("Automjeti më i vjetër: " + automjetiIVjeter.toString());
        } else {
            System.out.println("Nuk ka automjete në sallon.");
        }

        // Fshini automjetet më të vjetra se viti 2000
        salloni.fshijAutomjetet(2000);
    }
}
