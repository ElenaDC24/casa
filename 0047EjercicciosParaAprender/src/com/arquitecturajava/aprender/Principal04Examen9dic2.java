package com.arquitecturajava.aprender;

public class Principal04Examen9dic2 {

	public static void main(String[] args) {
		
		
	//Array de tipo double con 5 números 
	//usar un bucle while para recorrerlo
	//sumar todos los elementos , imprimir la suma por la consola	
		
		double [ ] lista = new double [ ] {2.2,5.6,7.1,9.0,1.8};
		int i= 0;
		double suma= 0;
		while (i<lista.length) {
			System.out.println(lista [i]);
			suma = suma + lista [i];
			System.out.println(suma);
			
		i++;
			}
	}

}
