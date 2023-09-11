/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minggu3soal3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Minggu3Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input A, operator, dan B
        int A = scanner.nextInt();
        String operator = scanner.next();
        int B = scanner.nextInt();

        // Batas A dan B
        if (A < 1 || A > 1000 || B < 1 || B > 1000) {
            System.out.println("A dan B harus berada dalam rentang 1 hingga 1000.");
        } else {
            // Operasi
            int result = 0;
            if (operator.equals("+")) {
                result = A + B;
            } else if (operator.equals("-")) {
                result = A - B;
            } else if (operator.equals("*")) {
                result = A * B;
            } else if (operator.equals("/")) {
                result = A / B;
            } else if (operator.equals("%")) {
                result = A % B;
            }
            System.out.println(result);
        }
    }
}