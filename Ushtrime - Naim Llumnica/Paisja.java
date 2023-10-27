// Krijoni klasen Paisja qe ka atributet : numriSerik readonly , prodhuesi , voltazhi dhe kategoriaShpenzuese
public class Paisja {
    private final String numriSerik;
    private String prodhuesi;
    private double voltazhi;
    private String kategoriaShpenzuese;

    // Constructor
    public Paisja(String numriSerik, String prodhuesi, double voltazhi, String kategoriaShpenzuese) {
        this.numriSerik = numriSerik;
        this.prodhuesi = prodhuesi;
        this.voltazhi = voltazhi;
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }

    // Getters and Setters
    public String getNumriSerik() {
        return numriSerik;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    public double getVoltazhi() {
        return voltazhi;
    }

    public void setVoltazhi(double voltazhi) {
        this.voltazhi = voltazhi;
    }

    public String getKategoriaShpenzuese() {
        return kategoriaShpenzuese;
    }

    public void setKategoriaShpenzuese(String kategoriaShpenzuese) {
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }

    // Ofroni metoden qe reprezenton ne String nje objekt te klases Paisja ne
    // formatin : <numriSerik> : <prodhuesi> <voltazhi> = <kategoriaShpenzuese>
    @Override
    public String toString() {
        return numriSerik + " : " + prodhuesi + " " + voltazhi + " = " + kategoriaShpenzuese;
    }

    // Ofroni metoden per krahasimin e dy objekteve Paisja. Vini re : Dy paisje jane
    // te njejta nese kane numrin serik te njejte
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Paisja other = (Paisja) obj;
        return numriSerik.equals(other.numriSerik);
    }
    

}