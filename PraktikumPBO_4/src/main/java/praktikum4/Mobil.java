/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; //atribut tambahan khusus untuk mobil
 
  //constructor
  public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
      super(nama, kecepatanMaks, jenisMesin); //memanggil construktor dari kelas induk
      this.jumlahPintu = jumlahPintu;
  }
  
  //methode untuk menampilkan informasi mobil
  public void tampilkanInfoMobil() {
      //dapat mengakses kecepetanMaks karena protected
      System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + "km/h");
      System.out.println("Jumlah Pintu: " + jumlahPintu);
  }
}