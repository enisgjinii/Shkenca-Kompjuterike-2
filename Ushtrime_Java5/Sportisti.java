public abstract class Sportisti {
    protected final int id;
    protected String emri;
    protected int mosha;
    protected char gjinia;

    public Sportisti(int id, String emri, int mosha, char gjinia) {
        this.id = id;
        this.emri = emri;
        this.mosha = mosha;
        this.gjinia = gjinia;
    }

    public abstract boolean garonIndividualisht();

    public boolean equals(Sportisti obj) {
        return this.id == obj.id;
    }

    @Override
    public String toString() {
        return id + " : " + emri + " " + gjinia + " " + mosha + " vjec";
    }
}
