package Ushtrime_Java6;

public class LibriShkollor extends Libri {
    public boolean kaDetyra() {
        return true;
    }

    private String drejtimi;

    public LibriShkollor(String isbn, String titulli, int vitiIPublikimit, String drejtimi) {
        super(isbn, titulli, vitiIPublikimit);
        this.drejtimi = drejtimi;
    }

    public String getDrejtimi() {
        return drejtimi;
    }

    public void setDrejtimi(String drejtimi) {
        this.drejtimi = drejtimi;
    }

    public String toString() {
        return "Libri Shkollor: " + super.toString() + " : " + drejtimi;
    }

}