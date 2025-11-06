public class PersegiPanjang extends Bentuk2D{
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public String toString() {
        return nameShape() + " Panjang: " + panjang + " Lebar: " + lebar;
    }
    
}
