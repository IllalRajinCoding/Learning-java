package oop;

public class ReamurCelcius implements KonverterSatuan {

    String asal, tujuan;

    public ReamurCelcius() {
        this.asal = "Reamur";
        this.tujuan = "Celcius";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    public float konversi(float in) {
        return 5f / 4 * in;
    }
}
