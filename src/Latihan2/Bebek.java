package Latihan2;


public class Bebek implements Terbang, Berenang {
    private String nama;
    private int kecepatan;

    public Bebek(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    @Override
    public void lepasLandas() {
        System.out.println(nama + " sedang lepas landas...");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " terbang rendah dengan kecepatan " + kecepatan + " km/jam");
    }

    @Override
    public void mendarat() {
        System.out.println(nama + " mendarat di permukaan air");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang santai di danau");
    }

    @Override
    public void menyelam() {
        System.out.println(nama + " menyelam sebentar mencari makanan");
    }
}
