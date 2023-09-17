/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventori;

/**
 *
 * @author ASUS
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    
    public int getstok() {
        return stok;
    }
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah harus positif untuk menambah stok.");
        }
    }
}

