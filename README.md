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
Atribut (nama, jenis, habitat, umur) bersifat private.
Disediakan getter & setter untuk akses dan modifikasi.
Memiliki toString() untuk menampilkan informasi dasar hewan.
Class ini nanti akan diwarisi (inheritance) oleh Mamalia dan Burung.
<br><br>
<img width="1120" height="583" alt="image" src="https://github.com/user-attachments/assets/a41f0252-26ec-4936-859b-87fb9111063e" />
<br>
Mamalia adalah subclass dari Hewan.
<br>
Menambahkan atribut khusus: menyusui (true/false).
Constructor memanggil constructor super dari Hewan agar atribut dasar tetap ada.
Ada Overriding pada method toString() menambahkan informasi apakah hewan menyusui atau tidak.
<br><br>
<img width="1061" height="587" alt="image" src="https://github.com/user-attachments/assets/b2aa9ae4-1fc2-4c68-9f35-7c3913eaa6c8" />
<br>
Burung juga subclass dari Hewan.
Atribut tambahan: bisaTerbang.
Constructor tetap memanggil constructor Hewan dengan super(...).
toString() dioverride untuk menampilkan informasi tambahan apakah burung bisa terbang.
