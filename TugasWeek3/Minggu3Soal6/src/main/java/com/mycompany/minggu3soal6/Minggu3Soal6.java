/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minggu3soal6;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Minggu3Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		BigInteger A = obj.nextBigInteger();
		BigInteger B = obj.nextBigInteger();
		System.out.println("Hasilnya adalah");
		System.out.println(A + " + "+ B + " = "+ A.add(B));
		System.out.println(A + " x "+ B + " = "+ A.multiply(B));
	}

}