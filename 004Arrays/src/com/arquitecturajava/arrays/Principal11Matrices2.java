package com.arquitecturajava.arrays;

public class Principal11Matrices2 {

	public static void main(String[] args) {
	
		int matriz[][]=new int [3][3];
		
		//fila1
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;
		
		//fila2
		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;
		
		//fila3
		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9;
		
		for (int i=0;i<matriz.length;i++) {
			System.out.println("fila: "+i);
			for (int j=0;j<matriz[i].length;j++) {
				//saca todos los valores de los elementos de la matriz
				System.out.println(matriz [i][j]);
			}
		}
	} 	

}
