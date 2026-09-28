/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo_teori;

/**
 *
 * @author user
 */
class BukuFisik extends Buku {
    String kondisi;

    @Override
    void pinjam() {
        super.pinjam();
        stok--;
        System.out.println("Stok berkurang");
    } 
}
