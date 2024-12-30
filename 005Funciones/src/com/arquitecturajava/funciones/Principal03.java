package com.arquitecturajava.funciones;

public class Principal03 {
//funcion con parametros
	public static void main(String[] args) {
		//nombres de variables a nivel del programa main
		int numero1=2;
		int numero2=4;
		sumar(numero1,numero2);
		
	}
	//recibe 2 valores como parametros
	//y se encarga de sumarlos
	//dudas de los nombres de los parametros
	//y de los nombres de las variables que se les pasan
	static void sumar (int a, int b) {
	//nombres dentro de la propia funcion	
		System.out.println(a+b);
	}
}
