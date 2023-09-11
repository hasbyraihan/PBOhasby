/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minggu3soal1;

import java.util.Scanner;

/**
 *
 * @author ASUSccass
 */

public class Minggu3Soal1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            do {
                String input = scanner.nextLine().trim();
                
                if (input.isEmpty()) {
                    System.out.println("Harus ber inputkan kata");
                } else {
                    String[] words = input.split("[\\s!?,',_@]+");
                    System.out.println("Jumlah Kata: " + words.length);
                    for (String word : words) {
                        System.out.println(word);
                    }
                }
            } while (true);
        }
    }
}
