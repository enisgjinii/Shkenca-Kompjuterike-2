public class Journal extends Publikimi {

    public boolean eshteDigjitale() {
        return true;
    }

    private int nrVolumit;

    public Journal(String isbn, String titulli, int vitiIPublikimit, int nrVolumit) {
        super(isbn, titulli, vitiIPublikimit);
        this.nrVolumit = nrVolumit;
    }

    public int getNrVolumit() {
        return nrVolumit;
    }

    public void setNrVolumit(int nrVolumit) {
        this.nrVolumit = nrVolumit;
    }

    public String toString() {
        return "Journal: " + super.toString() + " " + nrVolumit;
    }
}