package com.arquitecturajava.funciones;

public class Principal04 {
//retorno
	public static void main(String[] args) {

		int numero1 = 2;
		int numero2 = 4;
		int resultado = sumar(numero1, numero2);
		// ganamos en flexibilidad ya que aqui imprimimos el valor por la consola
		System.out.println(resultado);
	}

	// lo que hacemos es devolver la suma
	// la podríamos utilizar en un programa grafico por ejemplo
	static int sumar(int a, int b) {

		return a + b;
	}
}
