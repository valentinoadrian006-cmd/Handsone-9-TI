package latihan1;

public class IntroToAbstractionPractice {
    public static void main(String[] args) {
        System.out.println("=== TANPA ABSTRACTION ===");

        System.out.println("\n=== DENGAN ABSTRACTION ===");

        Kucing kucing = new Kucing("Kitty");
        kucing.bersuara();
        kucing.makan();
        kucing.tidur();

        Anjing anjing = new Anjing("Bobby");
        anjing.bersuara();
        anjing.makan();
        anjing.tidur();

        Burung burung = new Burung("Tweety");
        burung.bersuara();
        burung.makan();
        burung.tidur();

        System.out.println("\n=== DEMONSTRASI ABSTRACTION ===");

        Hewan[] hewanArray = new Hewan[3];
        hewanArray[0] = new Kucing("Kitty");
        hewanArray[1] = new Anjing("Bobby");
        hewanArray[2] = new Burung("Tweety");

        for (Hewan h : hewanArray) {
            h.bersuara();
        }

        System.out.println("\n=== KEUNTUNGAN ABSTRACTION ===");
    }
}
