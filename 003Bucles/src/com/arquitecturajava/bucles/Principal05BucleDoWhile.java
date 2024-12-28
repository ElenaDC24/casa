package com.arquitecturajava.bucles;

public class Principal05BucleDoWhile {

	public static void main(String[] args) {
		//si inicializasemos 1=100
		//al ejecutar el 100 sale aunque esté fuera del rango
		//sale una vez solo 
		int i=0;
		do {
			System.out.println(i);
			i=i+1;
		} while (i<10);
		}
	}


