
public class BujurSangkar extends Bentuk2D {

    double sisi;
    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public double luas() {
        return sisi * sisi;
    }
    @Override
    public double keliling() {
        return 4 * sisi;
    }
    @Override
    public String toString() {
        return nameShape() + " Sisi: " + sisi;
    }
    
    
}
