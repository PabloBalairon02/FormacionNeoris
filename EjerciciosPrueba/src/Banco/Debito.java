package Banco;

import java.time.LocalDate;

public class Debito extends Tarjeta{

	public Debito(String numero, String titular,LocalDate fechaCaducidad, String numeroTarjeta,
			String titularTarjeta) {
		super(numero, titular,fechaCaducidad, numeroTarjeta, titularTarjeta);
	}

	@Override
	public Double getSaldo() {
		return cuentaAsociada.getSaldo();
	}


	@Override
	public void ingresar(double dinero) {
		cuentaAsociada.ingresar(dinero);
	}

	@Override
	public void retirar(double dinero) {
		cuentaAsociada.retirar(dinero);
	}
	
	@Override
	public void pagoEstablecimiento(String concepto, double dinero) {
		cuentaAsociada.pagoEstablecimiento(concepto, dinero);
	}
	
}
