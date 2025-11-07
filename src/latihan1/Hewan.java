package latihan1;

public abstract class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public abstract void bersuara();

    public void makan() {
        System.out.println(nama + " sedang makan");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
    }
}
