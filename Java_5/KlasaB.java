
public class KlasaB extends KlasaA {
    static int i;
    int j;

    public KlasaB() {
        super();

        System.out.println("KlasaB");
    }

    public void print() {
        System.out.println("i: " + i + ", j: " + j);
    }

    static {
        System.out.println("Hello Blloku static");
    }
    {
        i = 10;
        j = 20;
        System.out.println("Hello Blloku inicizalizues");
    }

    public static void main(String[] args) {
        System.out.println("Hello Main : Start");
        System.out.println("------------------------");

        KlasaB b1 = new KlasaB();
        KlasaB b2 = new KlasaB();
        b1.print();
        b2.print();

        System.out.println("------------------------");
        System.out.println("Hello Main : End");

    }
}
