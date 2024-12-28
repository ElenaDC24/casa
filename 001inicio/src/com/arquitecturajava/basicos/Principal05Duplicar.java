package com.arquitecturajava.basicos;

import java.util.Scanner;

public class Principal05Duplicar {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);		
		System.out.print("por favor introduce nota: ");
		int nota= sc.nextInt();
		
		
		System.out.println(nota*2);
		 sc.close();
	}

}
