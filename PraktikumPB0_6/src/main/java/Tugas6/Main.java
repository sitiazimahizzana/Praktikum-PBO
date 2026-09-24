/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        keranjang.tambahProduk(new Buku("Laskar Pelangi", 150000));
        keranjang.tambahProduk(new Elektronik ("Kipas Angin", 100000));
        keranjang.tambahProduk(new Pakaian("Kemeja", 80000));
        
        keranjang.tampilkanDetail();
        System.out.println("------------------------");
        System.out.println("Total harga setelah dipotong diskon: " + keranjang.hitungTotalHarga());
    }
    
}
