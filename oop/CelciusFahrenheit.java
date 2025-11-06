package oop;

public class CelciusFahrenheit implements KonverterSatuan {
    String asal, tujuan;

    public CelciusFahrenheit(){
        this.asal = "Celcius";
        this.tujuan = "Fahrenheit";
    }
    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    public float konversi(float in){
        return 9f / 5 * in + 32;
    }
    
}
