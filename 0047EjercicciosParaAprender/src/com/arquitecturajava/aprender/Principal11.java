package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal11 {

	public static void main(String[] args) {
		
		
		//Solicite al usuario un número entero.
		//Utilice un bucle for para generar y mostrar la tabla de multiplicar de ese número, desde el 1 hasta el 10.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduce un número");
		int numero = scanner.nextInt();
		
		System.out.println("la tabla de multiplicar del " + numero + " es:");
		
		
		for (int i=1; i<=10; i++) {
		int multiplicacion = numero * i	;
			System.out.println(numero + " x " + i + " = " + multiplicacion);
		}
		scanner.close();
	}

}
