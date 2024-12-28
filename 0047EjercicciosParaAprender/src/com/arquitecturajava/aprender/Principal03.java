package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal03 {
	
	public static void main(String[] args) {
	
	//hallar el area de un rectángulo
		
	Scanner sc= new Scanner (System.in);
	
	System.out.println("introduce el valor de la base");
	int numero1= sc.nextInt();
	System.out.println("introduce el valor de la altura");
	int numero2= sc.nextInt();
	
	int area= numero1*numero2;
	System.out.println("el área del rectángulo es:" +area);
	
	 sc.close();
	}

}

