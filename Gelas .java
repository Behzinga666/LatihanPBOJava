public class Gelas {
    private String warna; // Mendeklarasikan variabel string privat 'warna' [cite: 2]

    public Gelas(String w) { // Konstruktor untuk kelas Gelas, mengambil string 'w' sebagai argumen [cite: 3]
        warna = w; // Menginisialisasi atribut 'warna' dengan nilai 'w' [cite: 3]
    }

    // Metode setter untuk mengatur warna gelas
    void setWarna(String w) {
        warna = w;
    }

    // Metode getter untuk mendapatkan warna gelas
    String getWarna() {
        return warna; [cite: 4]
    }
}