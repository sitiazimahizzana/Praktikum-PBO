/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("HEWAN");
        Kucing kucing = new Kucing();
        kucing.nama = "Moji";
        kucing.jenis = "Kucing Anggoora";
        kucing.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Chowon";
        anjing.jenis = "Anjing Husky Siberia";
        anjing.tampilkanInfo();
        
        System.out.println("\nHIERARKI KENDARAAN");
        MobilDarat mobil = new MobilDarat();
        mobil.nama = "Aston Martin";
        mobil.kecepatan = 210;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotorDarat motor = new SepedaMotorDarat();
        motor.nama = "Yamaha NMAX";
        motor.kecepatan = 100;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-tak";
        motor.tampilkanInfo();
    }
    
}
