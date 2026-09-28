/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspbo_teori;

/**
 *
 * @author user
 */
public class TugasPBO_Teori {

    public static void main(String[] args) {
        // Membuat objek anggota
        AnggotaMahasiswa mhs = new AnggotaMahasiswa();
        mhs.nama = "Budi";
        mhs.npm = "12345";
        mhs.jurusan = "Informatika";

        AnggotaDosen dsn = new AnggotaDosen();
        dsn.nama = "Bu Sari";
        dsn.nip = "1987001";

        // Override: hitungDenda() hasilnya beda tiap kelas
        System.out.println("Denda mahasiswa 3 hari: " + mhs.hitungDenda(3));
        System.out.println("Denda dosen 3 hari: " + dsn.hitungDenda(3));

        // Overload: hitungDenda() dengan parameter tambahan
        System.out.println("Denda mahasiswa 3 hari 2 buku: " + mhs.hitungDenda(3, 2));

        // Membuat objek buku
        BukuFisik fisik = new BukuFisik();
        fisik.judul = "Java Dasar";
        fisik.stok = 2;

        EBook ebook = new EBook();
        ebook.judul = "Basis Data";

        // Override: pinjam() perilakunya beda tiap kelas
        fisik.pinjam();
        System.out.println("Sisa stok: " + fisik.stok);
        ebook.pinjam();
    }
}
