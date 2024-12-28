package com.arquitecturajava.aprender;
//hallar la media de tres valores

import java.util.Scanner; 

 

public class Principal04 {
	
	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	
	
	System.out.println("introduce el primer valor");
		double numero1= sc.nextInt();
	System.out.println("introduce el segundo valor");
		double numero2= sc.nextInt();
		System.out.println("introduce el tercer valor");
		double numero3= sc.nextInt();
		
	double media= (numero1+numero2+numero3)/3;
	System.out.println("la media de los tres valores es:" +media);
	
	sc.close();
	
		
	}
	

}

