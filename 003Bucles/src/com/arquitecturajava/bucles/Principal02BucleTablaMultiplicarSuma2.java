package com.arquitecturajava.bucles;

public class Principal02BucleTablaMultiplicarSuma2 {

	public static void main(String[] args) {
		 
		int suma=0;
		
		for (int i=1;i<=10;i++) {
		System.out.println("iteracion: " +i );
		suma=suma+i;	
		System.out.println("suma actual: "+suma);
		}
		System.out.println("total: "+suma);
	}

}
