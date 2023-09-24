/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurantmain;

/**
 *
 * @author ASUS
 */
public class RestaurantMain {

     public static void main(String[] args) {
     Restaurant menu = new Restaurant();
     menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
     menu.tambahMenuMakanan("Gehu", 1_000, 20);
     menu.tambahMenuMakanan("Tahu", 1_000, 10);
     menu.tambahMenuMakanan("Molen", 1_000, 20);

     menu.tampilMenuMakanan();

    // Contoh pemesanan
     menu.pesanMenu("Bala-Bala", 5);
     menu.pesanMenu("Tahu", 3);
     menu.pesanMenu("Soto", 2); 
}

}
