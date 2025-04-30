import java.util.Scanner;
public class MahasiswaDemo16{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa16 stack = new StackTugasMahasiswa16(5);
        int pilih;
    
    do{
        System.out.println("\nMenu");
        System.out.println("1. Mengumpulkan Tugas");
        System.out.println("2. Menilai Tugas");
        System.out.println("3. Melihat Tugas Teratas");
        System.out.println("4. Melihat Tugas Terbawah");
        System.out.println("5. Melihat Daftar Tugas");
        System.out.println("6. Melihat Jumlah Tugas");
        System.out.print("Pilih: ");
        pilih=scan.nextInt();
        scan.nextLine();
        switch(pilih){
            case 1:
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("NIM: ");
                String nim = scan.nextLine();
                System.out.print("Kelas: ");
                String kelas = scan.nextLine();
                Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s Berhasil dikumpulkan\n",mhs.nama);
                break;
            case 2:
                Mahasiswa16 dinilai = stack.pop();
                if(dinilai != null){
                    System.out.println("Menilai tugas dari "+ dinilai.nama );
                    System.out.print("Masukkan nilai (0-100): ");
                    int nilai = scan.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Tugas %s adalah %d\n",dinilai.nama,nilai);
                    String biner = stack.konversiDesimalKeBiner(nilai);
                    System.out.printf("Nilai Biner Tugas: "+biner);
                }
                break;
            case 3:
                Mahasiswa16 lihat = stack.peek();
                if(lihat != null){
                    System.out.println("Tugas terakhir dikumpulkan oleh "+lihat.nama);
                }
                break;
            case 4:
                Mahasiswa16 bottom = stack.Bottom();
                    if (bottom != null) {
                        
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + bottom.nama);
                    }
                    break;
            case 5:
                System.out.println("Daftar semua tugas");
                System.out.println("Nama\tNIM\tKelas");
                stack.print();
                break;
            case 6:
                System.out.println("Jumlah tugas: "+stack.Size());
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
            }
        }while (pilih >= 1 && pilih <= 6);
            scan.close();
        }
    }
