package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal13ScannerDuplicador {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("por favor, introduce tu nota");
		int nota= sc.nextInt();
				
		
		System.out.println("la nota introducida es: " +nota);
		System.out.println("el triple de tu nota es: "+nota*3);
		
	}

}
