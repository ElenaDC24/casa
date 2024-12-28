package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal07 {

	public static void main(String[] args) {
		
		//hallar el area de un rectangulo
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("introduce el valor de un lado");
		int lado1 = sc.nextInt();
		
		System.out.println("introduce le valor del otro lado");
		int lado2 = sc.nextInt();
	
		int area = lado1*lado2;
		System.out.println("el area del rectangulo es: " + area);
		
		sc.close();
		
	}

}
