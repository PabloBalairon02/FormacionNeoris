package Ejercicio6;

import java.util.Scanner;

public class Argumentos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String fraseArguments = "", fraseFinal = "", fraseFinal2 = "", fraseFinal3 = "", fraseFinal4 = "";
		for (int i = 0; i < args.length; i++) {
			fraseArguments += args[i]+" ";
		}
		System.out.println(fraseArguments); 
		
		for (int i = fraseArguments.length()-1; i>=0; i--) {
			fraseFinal = fraseFinal + fraseArguments.charAt(i);
		}
		System.out.println(fraseFinal);
		
		char letra;
		for (int i = 0; i<fraseArguments.length(); i++) {
			letra = fraseArguments.charAt(i);
			switch(letra) {
			case 'a':
				letra = '1';
				break;
			case 'e':
				letra = '2';
				break;
			case 'i':
				letra = '3';
				break;
			case 'o':
				letra = '4';
				break;
			case 'u':
				letra = '5';
				break;
			}
			fraseFinal3 = fraseFinal3 + letra;
		}
		System.out.println(fraseFinal3);
		
		int longitud = 0;
		
		for (char c : fraseArguments.toCharArray()) {
			longitud++;
		}
		for (int i = 0; i<longitud; i++) {
			if(fraseArguments.charAt(i) == '-') {
				break;
			}
			fraseFinal4 = fraseFinal4 + fraseArguments.charAt(i);
		}

		System.out.println(fraseFinal4);
		
	}
}
