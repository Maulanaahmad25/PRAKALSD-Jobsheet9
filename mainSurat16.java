import java.util.Scanner;
public class mainSurat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackSurat16 stackSurat = new stackSurat16(10);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat16 surat = new Surat16(id, nama, kelas, jenis, durasi);
                    stackSurat.push(surat);
                    break;

                case 2:
                    Surat16 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Surat dari " + diproses.namaMahasiswa + " telah diproses.");
                    }
                    break;

                case 3:
                    Surat16 terakhir = stackSurat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa + ", Jenis Izin: " + terakhir.jenisIzin);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    boolean ditemukan = stackSurat.cariSurat(cariNama);
                    if (ditemukan) {
                        System.out.println("Surat dari " + cariNama + " ditemukan.");
                    } else {
                        System.out.println("Surat dari " + cariNama + " tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        sc.close();
    }
}