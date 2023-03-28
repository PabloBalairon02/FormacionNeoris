package Ejercicio4;

public class Factura {

	public static void main(String[] args) {
		int cantidad = 3, unidades = 12, total = 0;
		double precio= 5.4, importe = 0;
		
		importe = cantidad*unidades*precio;
		total = (int) (importe * 1.21);
		
		
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Cantidad: " + unidades);
		System.out.println("Precio: " + precio);
		System.out.println("Importe: " + importe);
		System.out.println("Iva: " + (importe*0.21));
		System.out.println("Total: " + total);
	}
}
