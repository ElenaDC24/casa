package com.arquitecturajava.funciones;

public class Principal11EjemploLongitud {
	
		//funcion pra calcular la longitud de una circunferencia
		public static double calcularLongitudCircunferencia(double radio) {
			//formula para calcular la longitud de la circunferencia:2*radio*pi
			
			return Math.PI*radio*2;//retorna la longitud
		}
		
			public static void main(String[] args) {
		//llamamos a la funcion calcularLongitudCircunferencia con un valor de radio 5
				double longitud= calcularLongitudCircunferencia(5);
				//radio 5
				//imprimimos el resultado
				System.out.println("la longitud de la circunferencia con radio 5 es: "+longitud);
			}	
			

	}


