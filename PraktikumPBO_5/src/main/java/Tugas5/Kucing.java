/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author user
 */
class Kucing extends Hewan {
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKhas();
    }
    public void suaraKhas() {
        System.out.println("Suara: Meaw");
    }   
}
