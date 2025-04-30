public class Surat16 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // ('S' untuk sakit, 'I' untuk izin)
    int durasi;

    public Surat16(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
}
}