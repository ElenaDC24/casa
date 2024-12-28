package com.arquitecturajava.arrays;

public class Principal12Matrices3 {

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
		
		int total=0;
		for (int i=0;i<matriz.length;i++) {
			
			for (int j=0;j<matriz[i].length;j++) {
				//sumar todos los elementos de la matriz
				total=total+matriz[i][j];
			}	
		}
			System.out.println(total);	
				
			}
		
	} 	


