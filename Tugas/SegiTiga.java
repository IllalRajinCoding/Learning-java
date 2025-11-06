public class SegiTiga extends Bentuk2D {
    double alas;
    double tinggi;

    public SegiTiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return 3 * alas;
    }

    @Override
    public String toString() {
        return nameShape() + " Alas: " + alas + " Tinggi: " + tinggi;
    }
}
