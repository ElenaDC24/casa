package com.arquitecturajava.arrays;

public class Principal03Recorrer {

	public static void main(String[] args) {
		
		int[]listaNumeros= new int[] {2,3,7,14,5,6};
		//System.out.println(listaNumeros.length);
		
		
		for(int i=0;i<listaNumeros.length;i=i+1){
		System.out.println("posicion "+i+", valor: " +listaNumeros[i]);
		
		
	}
	}
}
