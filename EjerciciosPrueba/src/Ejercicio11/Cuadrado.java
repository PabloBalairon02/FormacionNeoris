package Ejercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num;
		ArrayList<Double> numeros = new ArrayList<>();
		System.out.println("Pon números para hacer su cuadrado (-1 para parar)");
		do {
			num = teclado.nextInt();
			numeros.add(num);
		}while(num>=0);
		
		for (int i = 0; i < numeros.size(); i++) {
			double cuadrado = Math.pow(numeros.get(i), 2);
			System.out.println("El cuadrado de " + numeros.get(i) + " es " + cuadrado);
		}
	}
}
