package com.arquitecturajava.funciones;

public class Principal10EjemploYo2 {

	// Función para calcular el área de un círculo
	public static double calcularAreaCirculo(double radio) {
		// Fórmula para calcular el área: pi * radio^2
		return Math.PI * radio * radio; // Retorna el área

	}
	public static void main(String[] args) {
        // Llamamos a la función calcularAreaCirculo con un valor de radio (por ejemplo, 5)
        double area = calcularAreaCirculo(5);  // Radio 5

        // Imprimimos el resultado
        System.out.println("El área del círculo con radio 5 es: " + area);
}
}