/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minggu3soal2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Minggu3Soal2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        String str[] = new String [255];
        String Part[];
        
        int i;
        for (i = 0; i < 3; i++) {
            str[i] = obj.nextLine();
            if (str[i].isEmpty()) {
                break;
            }
        }
        System.out.println("=======================");
        for (int j = 0; j < i; j++) {
            Part = str[j].split(" ");
            if (Part.length < 2) {
                break;
            }
            String nama = Part[0];
            int value = Integer.valueOf(Part[1]);
            System.out.println(String.format("%-15s",nama)
                    + String.format("%03d",value));
        }
        System.out.println("=======================");
        
        obj.close();
    }
}
