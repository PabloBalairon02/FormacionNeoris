package Banco;

public class Start {

	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta("1","Pablo");
		cuenta.ingresar(1000, "Primer ingreso");
		cuenta.ingresar(20000);
		cuenta.retirar(300);
		
		System.out.println(cuenta.getSaldo());

	}

}
