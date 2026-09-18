/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] agrs) {
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        
        Hewan anjing = new Hewan("Moci", 2);
        anjing.berlari();
        anjing.info();
        
        Mobil mobil1 = new Mobil("Aston Martin", "Vanquish", 2026);
        mobil1.startEngine();
        mobil1.displayInfo();
        Mobil mobil2 = new Mobil("Mercendes-Beanz", "CLE 53 4MATIC+ Coupe", 2024);
        mobil2.startEngine();
        mobil2.displayInfo();
        mobil1.setWarna("Hitam");
        mobil2.setWarna("Abu-abu");
        
        System.out.println("Warna mobil dimodifikasi menjadi");
        mobil1.displayInfo();  
        mobil2.displayInfo();  
    }
    
}
