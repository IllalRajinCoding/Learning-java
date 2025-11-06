
public class Gempa {

    private String tempat;
    private float skala;

    public Gempa(String tempat, float skala) {
        this.tempat = tempat;
        this.skala = skala;
    }

    public String dampak() {
        String efek;
        if (this.skala < 3f) {
            efek = "Tidak Kerasa";
        } else if (this.skala >= 3f && this.skala <= 5f) {
            efek = "Bangunan Retak";
        } else if (this.skala >= 5f && this.skala <= 8f) {
            efek = "Bangunan roboh";
        } else {
            efek = "Tsunami";
        }
        System.out.println("Telah terjadi gempa di" + this.tempat + "dengan skala" + this.skala + "Richter berdampak" + efek);
        return efek;
    }
}
