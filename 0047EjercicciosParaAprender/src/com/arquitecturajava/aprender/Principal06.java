package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//pedir que introduzca nombre
		//sacar hola, nombre
		
		System.out.println("por favor, introduce tu nombre");
		String nombre = scanner.nextLine();

		
		System.out.println("hola, " + nombre);
		
		scanner.close();
		
	}

}
