/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo_teori;

/**
 *
 * @author user
 */
class EBook extends Buku{
    String formatFile;
    double ukuranFile;

    @Override
    void pinjam() {
        System.out.println("Link unduh " + judul + " dikirim");
    }
    
}
