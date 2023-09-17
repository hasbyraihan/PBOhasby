/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventori;

/**
 *
 * @author ASUS
 */
public class Inventori {
    Barang[] barangs;
    
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getstok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getstok() + ")");
    }
    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(30);
        showBarang();
    }
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
