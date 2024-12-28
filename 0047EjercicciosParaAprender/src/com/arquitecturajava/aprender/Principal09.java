package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal09 {

	public static void main(String[] args) {
		
		//triplicador
		Scanner scanner = new Scanner(System.in);
		
				
		System.out.println("introduce un valor");
		int numero = scanner.nextInt();
		
		int triple = numero*3;
		System.out.println("el triple de " + numero + " es: " + triple);
		
		scanner.close();
	}

}
