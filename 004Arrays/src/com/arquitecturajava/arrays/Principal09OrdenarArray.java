package com.arquitecturajava.arrays;

public class Principal09OrdenarArray {

	public static void main(String[] args) {
		//un lio que flipas
		//está hecho en dos partes en el contenido digital
		//ordenacion 1 y 2 de arrays
		int[] listaNumeros = new int[] { 2, 3, 7, 5, 6, 1 };

		boolean noOrdenado = true;

		while (noOrdenado) {
			noOrdenado = false;
			// realizara este bucle for y en cuanto termine
			// finalizara todo

			for (int i = 0; i < listaNumeros.length - 1; i++) {
				// System.out.println(listaNumeros[i]);

				if (listaNumeros[i] > listaNumeros[i + 1]) {

					// intercambiar los valores de 2 posiciones del array

					// almacena en la variable temporal el primer valor

					int temporal = listaNumeros[i];
					// una vez almacenado
					// asigna el nuevo valor a la posicion 0
					listaNumeros[i] = listaNumeros[i + 1];
					// en la posicion 1 asigna el valor de temporal
					listaNumeros[i + 1] = temporal;
					noOrdenado = true;
				}
			}
		}
			for (int i = 0; i < listaNumeros.length; i++)
				
			{
				System.out.println(listaNumeros[i]);
			}
		}
	}
