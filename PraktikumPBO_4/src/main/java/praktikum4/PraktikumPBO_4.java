/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author user
 */
public class PraktikumPBO_4 {

    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Toyota", 180, "Bensin");
        
        //menampilkan data awal        
        System.out.println("Nama: "+ mobil.getNama());
        mobil.tampilkanInfoKendaraan();
        
        //mengubah nama
        mobil.setNama("Innova");
        System.out.println("Nama baru: "+ mobil.getNama());
        
        System.out.println("------------------------");
        
        Mobil mobil1 = new Mobil("Toyota Avanza", 180, "Bensin", 4);
        mobil1.tampilkanInfoKendaraan();
        mobil1.tampilkanInfoMobil();
    }
}
