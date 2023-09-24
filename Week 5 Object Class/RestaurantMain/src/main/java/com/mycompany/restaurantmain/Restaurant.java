/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurantmain;

/**
 *
 * @author ASUS
 */
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private int maxMenu = 10;
    private int id = 0;

    public Restaurant() {
        nama_makanan = new String[maxMenu];
        harga_makanan = new double[maxMenu];
        stok = new int[maxMenu];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (id < maxMenu) {
            this.nama_makanan[id] = nama;
            this.harga_makanan[id] = harga;
            this.stok[id] = stok;
            id++;
        } else {
            System.out.println("Maaf, jumlah menu sudah mencapai batas maksimal.");
        }
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public void pesanMenu(String nama, int jumlah) {
        int indeksMenu = -1;
        for (int i = 0; i < id; i++) {
            if (nama_makanan[i].equalsIgnoreCase(nama)) {
                indeksMenu = i;
                break;
            }
        }

        if (indeksMenu != -1 && stok[indeksMenu] >= jumlah) {
            System.out.println("Pesanan Anda: " + nama + " x" + jumlah + " telah diterima.");
            stok[indeksMenu] -= jumlah;
        } else if (indeksMenu != -1) {
            System.out.println("Maaf, stok " + nama + " tidak mencukupi.");
        } else {
            System.out.println("Menu " + nama + " tidak ditemukan.");
        }
    }
}
