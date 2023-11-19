public class LibriShkollor extends Libri {
    public boolean eshteDigjitale() {
        return false;
    }

    public boolean kaDetyra() {
        return true;
    }

    private String drejtimi;

    public LibriShkollor(String isbn, String titulli, int vitiIPublikimit, int nrFaqeve, String drejtimi) {
        super(isbn, titulli, vitiIPublikimit, nrFaqeve);
        this.drejtimi = drejtimi;
    }

    public String getDrejtimi() {
        return drejtimi;
    }

    public void setDrejtimi(String drejtimi) {
        this.drejtimi = drejtimi;
    }

    public String toString() {
        return "Libri Shkollor: " + super.toString() + drejtimi;
    }
}