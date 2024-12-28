package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal10 {

	public static void main(String[] args) {
	
		//introducir y leer la nota introducida
		Scanner scanner = new Scanner(System.in);
		
			
		System.out.println("por favor, introduce tu nota");
		int nota = scanner.nextInt();
		
		System.out.println("tu nota es: " + nota);
		
		scanner.close();
	}

}
