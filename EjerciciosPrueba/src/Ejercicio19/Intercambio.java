package Ejercicio19;

public class Intercambio <T>{
	private T inter1;
	private T inter2;
	
	public Intercambio(T inter1, T inter2) {
		super();
		this.inter1 = inter1;
		this.inter2 = inter2;
	}
	
	public T getInter1() {
		return inter1;
	}
	
	public void setInter1(T inter1) {
		this.inter1 = inter1;
	}
	
	public T getInter2() {
		return inter2;
	}
	
	public void setInter2(T inter2) {
		this.inter2 = inter2;
	}
	
	public void Intercambiar() {

		T inter = this.inter1;
		this.inter1 = this.inter2;

		this.inter2 = inter;
	}
}
