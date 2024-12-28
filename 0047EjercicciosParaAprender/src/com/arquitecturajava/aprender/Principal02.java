package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal02 {

	public static void main(String[] args) {

		// pedir 2 numeros y sumarlos
		Scanner sc = new Scanner(System.in);

		System.out.println("por favor, ingrese el primer número");

		int numero1 = sc.nextInt();
		System.out.println("por favor, ingrese el segundo número");
		int numero2 = sc.nextInt();
		int suma = numero1 + numero2;

		System.out.println("la suma de " + numero1 + " y " + numero2 + " es: " + suma);

		sc.close();

	}

}
