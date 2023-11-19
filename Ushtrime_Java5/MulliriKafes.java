public class MulliriKafes extends Pajisja {
    private String materiali;

    public MulliriKafes(int numriSerik, String prodhuesi, String materiali) {
        super(numriSerik, prodhuesi);
        this.materiali = materiali;
    }

    public String getMateriali() {
        return materiali;
    }

    public void setMateriali(String materiali) {
        this.materiali = materiali;
    }

    @Override
    public String toString() {
        return "Mulliri i kafes prej " + materiali + " - " + super.toString();
    }
}
