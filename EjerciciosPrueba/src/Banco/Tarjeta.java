package Banco;

import java.time.LocalDate;
import java.util.Date;

public abstract class Tarjeta extends Cuenta{
	protected Cuenta cuentaAsociada;
	protected LocalDate fechaCaducidad;
	protected String numeroTarjeta;
	protected String titularTarjeta;
	
	public Tarjeta(String numero, String titular,LocalDate fechaCaducidad, String numeroTarjeta,
			String titularTarjeta) {
		super(numero, titular);
		this.fechaCaducidad = fechaCaducidad;
		this.numeroTarjeta = numeroTarjeta;
		this.titularTarjeta = titularTarjeta;
	}


	public abstract Double getSaldo();
	public abstract void ingresar(double dinero);
	public abstract void retirar(double dinero);

	public void setCuentaAsociada(Cuenta cuentaAsociada) {
		this.cuentaAsociada = cuentaAsociada;
	}
	
	
}
