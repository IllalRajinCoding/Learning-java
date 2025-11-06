
public class Lingkaran extends Bentuk2D{
    double jari2;
    public static final double PHI = 3.14;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    @Override
    public double luas() {
        return PHI * jari2 * jari2;
    }

    @Override
    public double keliling() {
        return 2 * PHI * jari2;
    }

    @Override
    public String toString() {
        return nameShape() + " Jari - jari: " + jari2;
    }
}
