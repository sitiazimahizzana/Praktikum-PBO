/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class Pekerja extends Manusia {
    private double gaji; //atribut tambahan, bersifat private
    
    //constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); //memanggil constructor kelas induk
        this.gaji = gaji;
    }
    //getter dan setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public String toString() {
        return "Nama: " + getNama() +
                "\nUsia: " + usia +
                "\nPekerjaan: " + pekerjaan +
                "\nGaji: Rp" + gaji;
    }    
}
