package com.arquitecturajava.arrays;

public class Principal05ElegirMayor {

	public static void main(String[] args) {
		
		int []listaNumeros=new int [] {5,7,3,12,2,1};
		//empiezo con el 5 y lo comparo con el resto
		//si en algun momento existe un numero mayor que 5
		//guardo el que es mayor que el 5
		int mayor=listaNumeros[0];
		for (int i=0;i<listaNumeros.length;i++) {
			//System.out.println(listaNumeros[i]);
			if(mayor<listaNumeros[i]) {
				//cambiamos el contenido del valor por el array de la lista
				mayor=listaNumeros[i];
				System.out.println("cambia");   //imprime las veces que ha cambiado 
												//el valor del mayor al ir comparando 
												//con el siguiente elemento
			}
		}
		System.out.println(mayor);
		}
	
	}

