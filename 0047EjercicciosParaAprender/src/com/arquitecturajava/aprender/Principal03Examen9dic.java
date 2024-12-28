package com.arquitecturajava.aprender;

public class Principal03Examen9dic {

	public static void main(String[] args) {
		
		//Imprimir con un bucle for los 10 primeros números al revés
		int [] lista = new int [] {1,2,3,4,5,6,7,8,9,10};
			for (int i = lista.length-1;i>=0;i--) {
				System.out.println(lista[i]);
			}
	}

}
