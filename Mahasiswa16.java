public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa16(){

    }

    public Mahasiswa16(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        if (nilai > 0) {
            this.nilai = nilai;
        }
    }
    
}
