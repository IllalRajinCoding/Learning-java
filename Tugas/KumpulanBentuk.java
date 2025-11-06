
public class KumpulanBentuk {
    public static void main(String[] args) {
        Bentuk2D b1 = new Lingkaran(8);
        Bentuk2D b2 = new Lingkaran(4);
        Bentuk2D b4 = new PersegiPanjang(10, 5);
        Bentuk2D b5 = new BujurSangkar(6);
        Bentuk2D b6 = new SegiTiga(4, 5);



        Bentuk2D ar_bentuk[] = {b1, b2, b4, b5, b6};
        for(Bentuk2D b2d : ar_bentuk){
            System.out.println(b2d + " Luas: " + b2d.luas() + " Keliling: " + b2d.keliling());
        }
    }
}
