public class Futbollisti extends Sportisti {
    private int numri;

    public Futbollisti(int id,String emri,int mosha,char gjinia,int numri){
        super (id,emri,mosha,gjinia);
        this.numri = numri;
    }

    public int getNumri(){
        return numri;
    }
    public void setNumri(int numri){
        this.numri = numri;
    }
    public String toString(){
        return "Futbollisti: " + super.toString() + " -nr " + numri;
    }
}