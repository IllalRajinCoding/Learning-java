package oop;

public class FahrenheitCelcius implements KonverterSatuan {

    String asal, tujuan;

    public FahrenheitCelcius() {
        this.asal = "Fahrenheit";
        this.tujuan = "Celcius";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    public float konversi(float in) {
        return 5f / 9 * (in - 32);
    }
}
