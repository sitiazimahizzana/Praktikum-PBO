/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class TugasModul4 {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("William Jakrapatr", 21, "Idol", 20000000);
        System.out.println(pekerja1.toString());
        System.out.println("--------------------");
        
        pekerja1.setNama("William Jakrapatr Kaewpanpong");
        System.out.println(pekerja1.toString());
        System.out.println("-------------------");
        
        System.out.println("Usia: " + pekerja1.usia);
        System.out.println("Pekerjaan: " + pekerja1.pekerjaan);
        
        //pekerja1.nama = "Coba ubah";
        pekerja1.usia = 25;
        System.out.println("Usia setelah diubah: " + pekerja1.usia);
        
        pekerja1.pekerjaan = "Aktor";
        System.out.println("Pekerja setelah diubah: " + pekerja1.pekerjaan);
    }  
}
