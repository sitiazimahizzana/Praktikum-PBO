/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo_teori;

/**
 *
 * @author user
 */
class AnggotaMahasiswa extends Anggota {
    String npm;
    String jurusan;

    @Override
    double hitungDenda(int hari) {          // override
        return hari * 500;
    }

    double hitungDenda(int hari, int jmlBuku) {   // overload
        return hari * 500 * jmlBuku;
    }
}
