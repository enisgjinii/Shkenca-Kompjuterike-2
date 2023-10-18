public class Fakulteti {

	public static void main(String[] args) {
		Mesimdhenesi m1 = new Mesimdhenesi(); // Use the default constructor
		Mesimdhenesi m2 = new Mesimdhenesi("E1", (short) 1997, "Profesor");
		Mesimdhenesi m3 = new Mesimdhenesi("E2");

		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());

		System.out.println("--------------");
		m3.setVitiLindjes((short) 1999);
		m2.setVitiLindjes((short) 2000);
		m1.setVitiLindjes((short) 2005);

		m3.setAngazhimi("Asistent");
		m2.setAngazhimi("Asistent");
		m1.setAngazhimi("Profesor");

		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}
