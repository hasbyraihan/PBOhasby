/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minggu3soal4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Minggu3Soal4 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int Product = obj.nextInt();
        double bonus = 0; 
        double Primary = 500000; 

        if (Product > 80) {
            bonus = (Product * 50000) * 35 / 100; 
        } else if (Product > 40 && Product <= 80) {
            bonus = (Product * 50000) * 25 / 100; 
        } else if (Product > 15 && Product <= 40) {
            bonus = (Product * 50000) * 10 / 100; 
        } else if (Product <= 15) {
            Primary += (((Product - 15) * 50000) * 15 / 100.0);
        }
        System.out.print(Primary + bonus);
    }
}
