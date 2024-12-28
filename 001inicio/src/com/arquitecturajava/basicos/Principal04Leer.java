package com.arquitecturajava.basicos;

import java.util.Scanner;

public class Principal04Leer {

	public static void main(String[] args) {
			

		// son dificiles de entender
		// solo las entenderemos mas adelante
		// en el curso
		// tener un poco de fe
		Scanner sc= new Scanner(System.in);		
		System.out.print("por favor introduce nota: ");
		int nota= sc.nextInt();
		System.out.print("la nota introducida es: ");
		System.out.println(nota);
		 sc.close();
	}

}
