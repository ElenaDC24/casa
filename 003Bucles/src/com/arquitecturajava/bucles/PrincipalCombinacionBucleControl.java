package com.arquitecturajava.bucles;

public class PrincipalCombinacionBucleControl {

	public static void main(String[] args) {
		
		int numero1=6;
		int numero2=3;
		//esto es el operador % o modulo
		//nos devuelve el resto de la division entera
		//de dos numeros
		// si yo divido 6/3=2 por lo tanto no hay resto
		int resto= numero1%numero2;
		//System.out.println(resto);
		
		//cuantos numeros divisibles entre tres hay en los primeros 100
		
		int divisibles3=0;
		for(int i=1;i<100;i++) {
			
			System.out.println(i);
			if (i%3==0) {
				
				divisibles3++;
			}
		}
		System.out.println("-------");
		System.out.println(divisibles3);
	}

}
