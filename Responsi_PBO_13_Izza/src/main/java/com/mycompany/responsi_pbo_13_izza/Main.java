/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsi_pbo_13_izza;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("1. Output Produk");
        Elektronik laptop = new Elektronik("Laptop", 6000000, 2);
        laptop.tampilkanInfo();

        System.out.println("\n2. Output Pegawai");
        PegawaiTetap hong = new PegawaiTetap("Est", 5000000, 1000000); // ganti nama
        hong.tampilkanInfo();

        // Polimorfisme: referensi induk memegang objek turunan
        System.out.println("\n3. Output Polimorfisme");
        Produk produk = new Makanan("Nabati", 5000, "2026-09-12");
        Pegawai pegawai = new PegawaiKontrak("Dylan", 3000000, 12);

        produk.tampilkanInfo();
        pegawai.tampilkanInfo();
    }
}
