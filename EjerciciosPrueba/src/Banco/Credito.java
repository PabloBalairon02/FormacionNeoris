package Banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Credito extends Tarjeta{
	private double credito;
	private ArrayList <Movimiento> movimientos;
	
	public Credito(String numero, String titular, LocalDate fechaCaducidad, String numeroTarjeta,
			String titularTarjeta, Double credito, ArrayList <Movimiento> movimientos) {
		super(numero, titular, fechaCaducidad, numeroTarjeta, titularTarjeta);
		this.credito = credito;
		this.movimientos = movimientos;
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
