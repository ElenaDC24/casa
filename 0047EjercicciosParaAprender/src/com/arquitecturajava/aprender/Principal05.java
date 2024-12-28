package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal05 {
	public static void main(String[] args) {
		// pedir dos numeros y sumarlos

		Scanner scanner = new Scanner(System.in);
		System.out.println("dime un número");
		int numero1 = scanner.nextInt();

		System.out.println("dime otro número");
		int numero2 = scanner.nextInt();

		int suma = numero1 + numero2;
		System.out.println("la suma es:"  + suma);

		scanner.close();
		
	}
}
