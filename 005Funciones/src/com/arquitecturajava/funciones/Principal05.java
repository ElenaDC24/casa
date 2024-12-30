package com.arquitecturajava.funciones;

public class Principal05 {
//paso por referencia
	public static void main(String[] args) {

		int[] lista= new int[] {1,2,3};
		//aqui se ha pasado una referencia a la lista
		//no una copia
		duplicar(lista);
		
		//los numeros tienen que salir duplicados
		for (int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i]);
		}
		
				
		}
	//esta lista que en la funcion se denomina elementos
	//recibe la lista originaly la duplica
	public static void duplicar (int[] elementos) {
		
		for (int i=0;i<elementos.length;i++) {
			
			elementos[i]=elementos[i]*2;
		}
	}
}
