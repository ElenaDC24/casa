package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("por favor introduce tu nombre: ");

		String nombre = sc.nextLine();
//		System.out.println(nombre);

		System.out.print("Hola,");
		System.out.println(nombre);
		sc.close();

	}

}
