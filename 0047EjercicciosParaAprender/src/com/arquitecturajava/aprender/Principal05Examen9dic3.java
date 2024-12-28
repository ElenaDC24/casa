package com.arquitecturajava.aprender;

import java.util.Arrays;

public class Principal05Examen9dic3 {

	public static void main(String[] args) {
		
	//array de números 
	//imprimir el numero mas grande	
		
		int[]lista = new int [] {6,23,89,54,2,77};
		int mayor=lista[0]; 
		for (int i= 0; i<lista.length;i++) {
					
			if (lista[i]> mayor) {
				mayor=lista[i];
			}}
	System.out.println("el numero mayor es: " + mayor);
			
	}
		
}
