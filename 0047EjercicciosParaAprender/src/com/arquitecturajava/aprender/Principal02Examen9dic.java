package com.arquitecturajava.aprender;

public class Principal02Examen9dic {

	public static void main(String[] args) {
		//hola me llamo pepe y soy informatico" .  
		//recorrer la cadena con un bucle
		//obtener el numero de letras "e" 
		String cadena = "hola me llamo pepe y soy informatico";
	
		
		for (int i=0;i<cadena.length();i++) {
		System.out.println(cadena.charAt(i));
		}
		System.out.println("*******");
		for (int i=0;i<cadena.length();i++) {
			char letra = cadena.charAt(i);
			if(letra =='e') {
				int NumeroEs = 0;
				NumeroEs = NumeroEs +1;
			
				System.out.println(NumeroEs);
	}
	}
}
}