package com.arquitecturajava.bucles;

public class Principal03BucleFactorial {

	public static void main(String[] args) {
		//factorial
		//5!=5*4*3*2*1
		int factorial = 1;
		for (int i=1;i<=5; i++) {
		factorial= factorial*i;
		System.out.println("iteracion: " +i);
		System.out.println("factorial de iteracion: "+ factorial);
		}
		System.out.println("factorial final: "+factorial);
		}
	

}
