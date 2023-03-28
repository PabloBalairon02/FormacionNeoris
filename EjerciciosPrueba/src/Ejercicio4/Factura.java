package Ejercicio4;

public class Factura {

	public static void main(String[] args) {
		int cantidad = 0, unidades = 0, total = 0;
		double precio= 0, importe = 0;
		
		importe = cantidad*unidades*precio;
		total = (int) (importe * 1.21);
		
		
		System.out.println("Cantidad " + "\t" + cantidad);
		System.out.println("Cantidad " + "\t" + unidades);
		System.out.println("Precio " + "\t" + precio);
		System.out.println("Importe " + "\t" + importe);
		System.out.println("Iva " + "\t" + (importe*0.21));
		System.out.println("Total " + "\t" + total);
	}
}
