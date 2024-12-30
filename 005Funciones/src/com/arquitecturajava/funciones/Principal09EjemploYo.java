package com.arquitecturajava.funciones;

public class Principal09EjemploYo {

	public static void main(String[] args) {
		
		int numero1= 2;
		int numero2= 4;
		int resultado = multiplicar(numero1,numero2);
		System.out.println("el multiplicando es: "+numero1);
		System.out.println("el multiplicador es: "+numero2);
		System.out.println("el producto de ambos es: "+resultado);
	}
	static int multiplicar (int a,int b) {
	
		return a+b;
	


	}
}
	
	