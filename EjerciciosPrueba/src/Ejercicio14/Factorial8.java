package Ejercicio14;

public class Factorial8 {

	public static void main(String[] args) {
		int factorial = 1;
		for (int i = 1; i <= 8; i++) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de 8 es " + factorial);
	}
}
