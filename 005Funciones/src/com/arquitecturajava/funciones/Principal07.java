package com.arquitecturajava.funciones;

public class Principal07 {
//paso por referencia
	public static void main(String[] args) {

		int[] lista = new int[] { 1, 2, 3 };
		// aqui se ha pasado una referencia a la lista
		// no una copia
		int[] listaDuplicada=duplicar(lista);

		// los numeros tienen que salir duplicados
		imprimir(listaDuplicada);
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

	public static int [] duplicar(int[] elementos) {
		// esta nueva lista
		// tiene la misma longitud que los elementos
		// es una variable que pertenece a la funcion
		int[] nuevaLista = new int[elementos.length];

		for (int i = 0; i < elementos.length; i++) {

			nuevaLista[i] = elementos[i] * 2;
		}
		return nuevaLista;
	}
}