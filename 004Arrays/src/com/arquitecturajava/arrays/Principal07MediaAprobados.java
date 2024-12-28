package com.arquitecturajava.arrays;

public class Principal07MediaAprobados {

	public static void main(String[] args) {
		int sumaAprobados=0;
		int totalAprobados=0;
		int []listaNumeros= new int[] {2,3,7,5,6,1};
		for (int i=0;i<listaNumeros.length;i++) {
			if(listaNumeros[i]>=5) {
				sumaAprobados=sumaAprobados+listaNumeros[i];
				totalAprobados++;
			System.out.println(listaNumeros[i]);
		}
	}
		System.out.println(sumaAprobados);
		System.out.println("la media de los aprobados es "+ sumaAprobados/totalAprobados);
	}
}
