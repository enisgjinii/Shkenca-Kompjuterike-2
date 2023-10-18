public class Mesimdhenesi {
	String emri;
	short vitiLindjes;
	String angazhimi;

	public Mesimdhenesi() {
		// Default constructor with no arguments
	}

	public Mesimdhenesi(String emri) {
		this.emri = emri;
	}

	public Mesimdhenesi(String emri, short vitiLindjes, String angazhimi) {
		this.emri = emri;
		this.vitiLindjes = vitiLindjes;
		this.angazhimi = angazhimi;
	}

	public String toString() {
		return emri + ":" + vitiLindjes + "-" + angazhimi;
	}

	public void setVitiLindjes(short vitiLindjes) {
		this.vitiLindjes = vitiLindjes;
	}

	public void setAngazhimi(String angazhimi) {
		this.angazhimi = angazhimi;
	}
}
