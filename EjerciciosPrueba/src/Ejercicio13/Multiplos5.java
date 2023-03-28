package Ejercicio13;

public class Multiplos5 {

	public static void main(String[] args) {
		int suma = 0, multiplo = 0;
		for (int i = 1; i <= 10; i++) {
			multiplo = i*5;
			suma+=multiplo;
		}
		System.out.println(suma);
	}
}
