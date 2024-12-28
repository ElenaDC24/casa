package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal08 {

	public static void main(String[] args) {
		
		//hallar la media de tres valores
		Scanner scanner = new Scanner(System.in);
		
			
		System.out.println("introduce el primer valor");
		double numero1 = scanner.nextDouble();
		
		System.out.println("introduce el segundo valor");
		double numero2 = scanner.nextDouble();
		
		System.out.println("introduce el tercer valor");
		double numero3 = scanner.nextDouble();
		
		double suma = numero1+numero2+numero3;
		//System.out.println("la suma de los tres valores es: " + suma);
		
		double media = suma/3;
		System.out.println("la media de los tres valores es: " + media);

		scanner.close();
		
	}
	
}