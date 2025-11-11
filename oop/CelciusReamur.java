package oop;

public class CelciusReamur implements KonverterSatuan {

    String asal, tujuan;

    public CelciusReamur() {
        this.asal = "Celcius";
        this.tujuan = "Reamur";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    public float konversi(float in) {
        return 4f / 5 * in;
    }
}
