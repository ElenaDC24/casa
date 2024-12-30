package com.arquitecturajava.funciones;

public class Principal02 {

	public static void main(String[] args) {
		//selecciono lo que va a formar la funcion
		//refactor..extract method y le pongo nombre 
		imprimirHolas();
		System.out.println("adios");
		System.out.println("adios");
		imprimirHolas();
	
	}
	//bloque de codigo reutilizable
	//al que damos un nombre
	//sirve para evitar repeticiones en el codigo del programa
	private static void imprimirHolas() {
		System.out.println("hola1");
		System.out.println("hola2");
	}
}
