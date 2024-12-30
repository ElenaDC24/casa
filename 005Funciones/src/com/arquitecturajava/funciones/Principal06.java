package com.arquitecturajava.funciones;

public class Principal06 {
//paso por referencia
	public static void main(String[] args) {

		int[] lista = new int[] { 1, 2, 3 };
		// aqui se ha pasado una referencia a la lista
		// no una copia
		duplicar(lista);

		// los numeos tienen que salir duplicados
		imprimir(lista);

	}
	// esta lista que en la funcion se denomina elementos
	// recibe la lista originaly la duplica

	// funcion imprimir o metodo
	public static void imprimir(int[] lista) {
		for (int i = 0; i < lista.length; i++) {

			System.out.println(lista[i]);
		}
	}

	public static void duplicar(int[] elementos) {

		for (int i = 0; i < elementos.length; i++) {

			elementos[i] = elementos[i] * 2;
		}
	}
}
