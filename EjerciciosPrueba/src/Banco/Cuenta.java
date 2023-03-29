package Banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Cuenta {
	private ArrayList <Movimiento> movimientos = new ArrayList<Movimiento>();
	private String numero;
	private String titular;
	
	public Cuenta(String numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}
	
	public void addMovimientos(Movimiento movimiento) {
		movimientos.add(movimiento);
	}
	
	public Double getSaldo() {
		double dinero = 0;
			for(Iterator<Movimiento> mov = movimientos.iterator(); mov.hasNext();) {
				Movimiento movimiento = mov.next();
				dinero += movimiento.getImporte();
			}
		return dinero;

	}
	
	public void ingresar(double dinero) {
		Movimiento movimiento = new Movimiento();
		
		movimiento.setImporte(dinero);
		movimientos.add(movimiento);
	}
	
	public void ingresar(double dinero, String concepto) {
		Movimiento movimiento = new Movimiento();
		
		movimiento.setImporte(dinero);
		movimiento.setConcepto(concepto);
		movimientos.add(movimiento);
	}
	
	public void retirar(double dinero) {
		Movimiento movimiento = new Movimiento();
		
		if(dinero>getSaldo()) {
			System.out.println("Error, no tienes suficiente dinero");
		}else {
			movimiento.setImporte(dinero*-1);
			movimientos.add(movimiento);
		}

	}
	
	public void retirar(double dinero, String concepto) {
		Movimiento movimiento = new Movimiento();
		
		if(dinero>getSaldo()) {
			System.out.println("Error, no tienes suficiente dinero");
		}else {
			movimiento.setImporte(dinero*-1);
			movimiento.setConcepto(concepto);
			movimientos.add(movimiento);
		}

	}
	
	public void pagoEstablecimiento(String establecimiento, double dinero) {
		System.out.println("Se he gastado en " + establecimiento + " un total de " + dinero + "€");
	}
	
}
