/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author user
 */
public class PraktikumPB0_6 {

    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara(); // output : meow
        
        Kucing kucing = new Kucing();
        kucing.makan("ikan"); //memanggil metode makan() dari kelas hewan
        kucing.makan("ikan", 2); //memanggil metode makan() yang overladed
        
        Anjing anjing = new Anjing();
        anjing.bersuara();//output : woof
        anjing.makan("daging", 3); //memanggil metode makan() yang overladed pada kelas hewan
    }
}
