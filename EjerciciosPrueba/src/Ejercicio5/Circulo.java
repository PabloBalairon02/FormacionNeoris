package Ejercicio5;

public class Circulo {

	public static void main(String[] args) {
		float radio = 23, area, longitud;
		
		area = (float) (3.14 *(radio*radio));
		longitud = (float) (2*(3.14)*radio);
		
		System.out.println("El area es: " + area);
		System.out.println("La longitud es: " + longitud);
	}
}
