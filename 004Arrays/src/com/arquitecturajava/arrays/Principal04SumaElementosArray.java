package com.arquitecturajava.arrays;

public class Principal04SumaElementosArray {

	public static void main(String[] args) {
		
		int []listaNumeros=new int [] {5,7,3,2,1};
		int total=0;
		for(int i=0;i<listaNumeros.length;i=i+1){
			total=total+listaNumeros[i];
			System.out.println("posicion: "+i+", valor:"+listaNumeros[i]);
		}
			System.out.println("la suma de los elementos es: "+total);
		
				
		}
	
	}

