/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pemesananmakanan;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PemesananMakanan {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produk> menu = new ArrayList<>();
        ArrayList<Penjualan> keranjang = new ArrayList<>();

        // Menambahkan item makanan ke menu
        menu.add(new Produk("Nasi Kebuli", 25000));
        menu.add(new Produk("Nasi Rames", 20000));
        menu.add(new Produk("Nasi Katsu", 28000));
        menu.add(new Produk("Nasi Kerang", 22000));
        menu.add(new Produk("Ayam Goreng", 30000));
        menu.add(new Produk("Ayam Bakar", 35000));
        menu.add(new Produk("Cuanki", 18000));
        menu.add(new Produk("Mie Ayam", 21000));
        menu.add(new Produk("Fuyunhai", 32000));
        menu.add(new Produk("Mie Kakek", 23000));
        menu.add(new Produk("Mie Rendang", 15000));
        menu.add(new Produk("Mie Kocok", 15000));
        menu.add(new Produk("Mie Empal Gentong", 15000));
        menu.add(new Produk("Mie Ayam Bawang", 15000));
        menu.add(new Produk("Mie Aceh", 15000));

        boolean lanjutPesan = true;

        while (lanjutPesan) {
            System.out.println("Menu Makanan yang lagi ada nihh:");
            for (int i = 0; i < menu.size(); i++) {
                Produk item = menu.get(i);
                System.out.println((i + 1) + ". " + item.getNamaProduk() + " - Rp" + item.getHarga());
            }

            System.out.print("Apa yang kamu mauu dari menu yang ada ? (1-" + menu.size() + "): ");
            int nomorMenu = scanner.nextInt();
            scanner.nextLine(); 

            if (nomorMenu >= 1 && nomorMenu <= menu.size()) {
                Produk produkTerpilih = menu.get(nomorMenu - 1);
                System.out.print("Mau beli  " + produkTerpilih.getNamaProduk() + " berapa kakk? : ");
                int jumlahPesan = scanner.nextInt();
                scanner.nextLine(); 

                produkTerpilih.setQty(produkTerpilih.getQty() + jumlahPesan);

                double hargaTotalItem = produkTerpilih.getHarga() * jumlahPesan;
                keranjang.add(new Penjualan(produkTerpilih.getNamaProduk(), jumlahPesan, hargaTotalItem));

                System.out.println("Makanan " + produkTerpilih.getNamaProduk() + " sebanyak " + jumlahPesan + " Sudah di catet yaa.");
            } else {
                System.out.println("Nomor menu salah.");
            }

            System.out.print("Mauu beli lagi yang lain gaa? (Lagi ah/Udah ah): ");
            String pilihanLanjut = scanner.nextLine();

            if (!pilihanLanjut.equalsIgnoreCase("lagi")) {
                lanjutPesan = false;
            }
        }

        System.out.println("\nNahh ini nih yang kamu beli1"
                + "1:");
        double totalBayar = 0.0;

        for (Penjualan item : keranjang) {
            System.out.println(item.getNamaProduk() + " - " + item.getQuantity() + " pcs - Rp" + item.getHargaTotal());
            totalBayar += item.getHargaTotal();
        }

        System.out.println("Jadi totalnya: Rp" + totalBayar);
    }
}
