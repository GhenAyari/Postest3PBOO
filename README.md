## Profil
---
- **Nama:** Ghendida Gantari Ayari
- **NIM:** 2409116080
- **Tema:** Manajemen Daftar Hewan Di Kebun Binatang

## Deskripsi
---
Program ini adalah sebuah program sederhana CRUD dengan tema manajemen daftar hewan kebun binatang. Di program ini user dapat membuat, membaca, mengedit, dan menghapus data hewannya.

## Kode
<img width="850" height="883" alt="image" src="https://github.com/user-attachments/assets/95067617-6ba8-402a-9dc5-9df6f1c904e7" />
<br>
Superclass (induk) yang mewakili semua hewan.
<br>
Menggunakan Encapsulation:
Atribut (nama, jenis, habitat, umur) bersifat private
Disediakan getter & setter untuk akses dan modifikasi
Memiliki toString() untuk menampilkan informasi dasar hewan
Class ini nanti akan diwarisi (inheritance) oleh Mamalia dan Burung.
<br><br>
<img width="1120" height="583" alt="image" src="https://github.com/user-attachments/assets/a41f0252-26ec-4936-859b-87fb9111063e" />
<br>
Mamalia adalah subclass dari Hewan.
<br>
Menambahkan atribut khusus: menyusui (true/false)
Constructor memanggil constructor super dari Hewan agar atribut dasar tetap ada
Ada Overriding pada method toString() menambahkan informasi apakah hewan menyusui atau tidak.
<br><br>
<img width="1061" height="587" alt="image" src="https://github.com/user-attachments/assets/1ca89d5a-314d-4764-ab03-6a01f41909d5" />
<br>
Burung juga subclass dari Hewan.
Atribut tambahan: bisaTerbang.
Constructor tetap memanggil constructor Hewan dengan super(...).
toString() dioverride untuk menampilkan informasi tambahan apakah burung bisa terbang.
<br><br>

```
package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Hewan;
import model.Mamalia;
import model.Burung;

public class HewanService {
    private ArrayList<Hewan> daftarHewan = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void tambahHewan() {
        System.out.println("Pilih tipe hewan:");
        System.out.println("1. Mamalia");
        System.out.println("2. Burung");
        System.out.println("3. Hewan umum");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        System.out.print("Nama Hewan   : ");
        String nama = input.nextLine();
        System.out.print("Jenis Hewan  : ");
        String jenis = input.nextLine();
        System.out.print("Habitat Hewan: ");
        String habitat = input.nextLine();
        System.out.print("Umur Hewan   : ");
        float umur = input.nextFloat();
        input.nextLine();

        Hewan hewan;

        switch (pilihan) {
            case 1:
                System.out.print("Apakah menyusui? (true/false): ");
                boolean menyusui = input.nextBoolean();
                input.nextLine();
                hewan = new Mamalia(nama, jenis, habitat, umur, menyusui);
                break;
            case 2:
                System.out.print("Apakah bisa terbang? (true/false): ");
                boolean bisaTerbang = input.nextBoolean();
                input.nextLine();
                hewan = new Burung(nama, jenis, habitat, umur, bisaTerbang);
                break;
            default:
                hewan = new Hewan(nama, jenis, habitat, umur);
        }

        daftarHewan.add(hewan);
        System.out.println("Hewan berhasil ditambahkan!");
    }

    public void lihatHewan() {
        if (daftarHewan.isEmpty()) {
            System.out.println("Belum ada data hewan.");
        } else {
            for (int i = 0; i < daftarHewan.size(); i++) {
                System.out.println((i + 1) + ". " + daftarHewan.get(i));
            }
        }
    }

    public void ubahHewan() {
        lihatHewan();
        if (!daftarHewan.isEmpty()) {
            System.out.print("Pilih nomor hewan yang ingin diubah: ");
            int index = input.nextInt();
            input.nextLine();

            if (index > 0 && index <= daftarHewan.size()) {
                Hewan hewanLama = daftarHewan.get(index - 1);

                System.out.print("Nama Hewan Baru   : ");
                String nama = input.nextLine();
                System.out.print("Jenis Hewan Baru  : ");
                String jenis = input.nextLine();
                System.out.print("Habitat Hewan Baru: ");
                String habitat = input.nextLine();
                System.out.print("Umur Hewan Baru   : ");
                float umur = input.nextFloat();
                input.nextLine();

                if (hewanLama instanceof Mamalia) {
                    System.out.print("Apakah menyusui? (true/false): ");
                    boolean menyusui = input.nextBoolean();
                    input.nextLine();
                    daftarHewan.set(index - 1, new Mamalia(nama, jenis, habitat, umur, menyusui));
                } else if (hewanLama instanceof Burung) {
                    System.out.print("Apakah bisa terbang? (true/false): ");
                    boolean bisaTerbang = input.nextBoolean();
                    input.nextLine();
                    daftarHewan.set(index - 1, new Burung(nama, jenis, habitat, umur, bisaTerbang));
                } else {
                    daftarHewan.set(index - 1, new Hewan(nama, jenis, habitat, umur));
                }

                System.out.println("Data hewan berhasil diubah!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    public void hapusHewan() {
        lihatHewan();
        if (!daftarHewan.isEmpty()) {
            System.out.print("Pilih nomor hewan yang ingin dihapus: ");
            int index = input.nextInt();
            input.nextLine();

            if (index > 0 && index <= daftarHewan.size()) {
                daftarHewan.remove(index - 1);
                System.out.println("Data hewan berhasil dihapus!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }
}
```
Bertugas sebagai CRUD service:<br>
tambahHewan() user bisa pilih apakah mau tambah Mamalia, Burung, atau Hewan umum<br>
lihatHewan() menampilkan daftar semua hewan yang ada<br>
ubahHewan() bisa mengupdate data hewan, menyesuaikan apakah dia subclass Mamalia/Burung<br>
hapusHewan() menghapus data hewan dari daftar<br>
Menggunakan ArrayList<Hewan> memungkinkan menyimpan polymorphic object (Hewan, Mamalia, Burung).
<br><br>
## Output Tambahan Dari Yang Sebelumnya
<img width="590" height="514" alt="Screenshot 2025-09-22 225703" src="https://github.com/user-attachments/assets/b03d9be2-7310-4d13-84c4-3b179e5012c2" />
<br>
Jika memilih menu 1 ada tambahan yang baru yaitu Pilih Tipe Hewan. Burung, mamalia atau hewan umum.
<br>
<img width="435" height="461" alt="Screenshot 2025-09-22 225834" src="https://github.com/user-attachments/assets/7c2cf2ae-ac64-4c2d-aaa9-eb190b627208" />
<br>
Untuk inputnya masih sama seperti sebelumnya, yang berbeda ada tambahan apakah hewan menyusui (karena dia mamalia) dan true atau false.
<br>
<img width="482" height="461" alt="Screenshot 2025-09-22 225851" src="https://github.com/user-attachments/assets/4ba747ac-b636-4d50-965f-dd7535eab0bc" />
Begitupun juga di bagian tipe hewan Burung

