package Ejercicio19;

public class PruebaIntercambio {
	public static void main(String[] args) {
		Intercambio<String> nombres = new Intercambio<String>("Juan", "Pablo");
		Intercambio<Integer> numeros = new Intercambio<Integer>(1, 2);
		
		System.out.println("Nombres: "
				+ "\nuno: " + nombres.getInter1()
				+ "\ndos: " + nombres.getInter2());
		
		System.out.println("Números: "
				+ "\nuno: " + numeros.getInter1()
				+ "\ndos: " + numeros.getInter2());
		
		nombres.Intercambiar();
		numeros.Intercambiar();
		
		System.out.println("Nombres: "
				+ "\nuno: " + nombres.getInter1()
				+ "\ndos: " + nombres.getInter2());
		
		System.out.println("Números: "
				+ "\nuno: " + numeros.getInter1()
				+ "\ndos: " + numeros.getInter2());
	}
}
