package com.arquitecturajava.arrays;

public class Principal02Arrays {

	public static void main(String[] args) {
	
		//declaracion de array
		int[] listaNumeros= new int [3];
		//esta vacia y en cada posicion hay un cero
		System.out.println(listaNumeros[0]);

		//siempre comienzan en la posición 0
		listaNumeros[0]=2;
		listaNumeros[1]=3;
		//el ultimo elemento es uno menos que su longitud
		listaNumeros[2]=7;
		
		System.out.println(listaNumeros[0]);
		System.out.println(listaNumeros[1]);
		System.out.println(listaNumeros[2]);
	}
	
	

}
