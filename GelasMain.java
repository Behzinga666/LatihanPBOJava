public class GelasMain {
    public static void main(String[] args) {
        Gelas g1 = new Gelas("Hitam"); // Membuat objek Gelas bernama g1 dengan warna awal "Hitam" [cite: 5]
        Gelas g2 = new Gelas("Biru");  // Membuat objek Gelas bernama g2 dengan warna awal "Biru" [cite: 5]

        tukarWarnaGelas(g1, g2); // Memanggil metode statis untuk menukar warna antara g1 dan g2 [cite: 5]

        System.out.println("Warna g1: " + g1.getWarna()); // Mencetak warna g1 setelah penukaran [cite: 5]
        System.out.println("Warna g2: " + g2.getWarna()); // Mencetak warna g2 setelah penukaran [cite: 5]
    }

    // Metode statis untuk menukar warna dua objek Gelas [cite: 6, 7]
    static void tukarWarnaGelas(Gelas g1, Gelas g2) {
        Gelas gTemp = new Gelas("Temp"); // Membuat objek Gelas sementara [cite: 6]
        gTemp.setWarna(g1.getWarna());  // Mengatur warna gTemp ke warna g1 [cite: 6]
        g1.setWarna(g2.getWarna());     // Mengatur warna g1 ke warna g2 [cite: 6]
        g2.setWarna(gTemp.getWarna());  // Mengatur warna g2 ke warna gTemp (warna asli g1) [cite: 6]
    }
}