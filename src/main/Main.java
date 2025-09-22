package main;

import java.util.Scanner;
import service.HewanService;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HewanService hewanService = new HewanService();
        int pilihan;

        do {
            System.out.println("\n=== Manajemen Daftar Hewan Kebun Binatang ===");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Lihat Daftar Hewan");
            System.out.println("3. Ubah Data Hewan");
            System.out.println("4. Hapus Hewan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: hewanService.tambahHewan(); break;
                case 2: hewanService.lihatHewan(); break;
                case 3: hewanService.ubahHewan(); break;
                case 4: hewanService.hapusHewan(); break;
                case 5: System.out.println(">> Terima kasih, program selesai."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        input.close();
    }
}
