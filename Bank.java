
public class Bank {

    public String nama;
    protected int saldo;
    private int norek;

    public void  Bank(String nama, int saldo, int norek) {
        this.nama = nama;
        this.saldo = saldo;
        this.norek = norek;
    }

    public void menabung(double jumlah) {
        this.saldo += jumlah;
    }

    public void menarik(double jumlah) {
       this.saldo -= jumlah;
    }
}