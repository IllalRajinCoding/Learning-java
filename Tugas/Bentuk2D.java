
public abstract class Bentuk2D {
    public String nameShape(){
        return getClass().getSimpleName();
    }
    public abstract double luas();
    public abstract double keliling();
}