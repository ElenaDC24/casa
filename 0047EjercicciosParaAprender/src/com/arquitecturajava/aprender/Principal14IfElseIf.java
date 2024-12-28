package com.arquitecturajava.aprender;

import java.util.Scanner;

public class Principal14IfElseIf {

	public static void main(String[] args) {

		System.out.println("que nota has sacado?");
		Scanner sc = new Scanner(System.in);

		int nota = sc.nextInt();

		System.out.println("he sacado un " + nota);

		if (nota >= 0 && nota < 3) {

		} else if (nota >= 3 && nota < 5) {
			System.out.println("no sales");

		
		} else if (nota >= 5 && nota < 7){
			System.out.println("hay que estudiar mas");
				 

		} else if (nota >= 7 && nota < 9) {
			System.out.println("te compro un balon");
				

		}else{
			System.out.println("te regalo un movil");
		}
}
}