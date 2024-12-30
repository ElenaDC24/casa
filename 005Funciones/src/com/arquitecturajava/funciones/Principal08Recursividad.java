package com.arquitecturajava.funciones;

public class Principal08Recursividad {

	public static void main(String[] args) {
		
	System.out.println(factorial (5));
	System.out.println(factorialRecursivo (5));
	}
	public static int factorial (int numero) {
		//5x4x3x2x1
		int factorial=1;
		for (int i=numero;i>0;i--) {
			factorial=factorial*i;
			
		}
		return factorial;
	}
	//4
	public static int factorialRecursivo (int numero) {
		//5x4x3x2x1
		//5x factorial (4)
		//5x4xfactorial (3)
		if (numero==1) {
			return numero;
		}
		
		return numero*factorialRecursivo(numero-1);
		}
		
	}

