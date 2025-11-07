package latihan1;

public class HewanBiasa {
    protected String nama;

    public HewanBiasa(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println(nama + " bersuara...");
    }

    public void makan() {
        System.out.println(nama + " sedang makan");
    }
}
