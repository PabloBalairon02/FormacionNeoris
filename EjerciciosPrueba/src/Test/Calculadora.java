package Test;

public class Calculadora {
	public static int sumar(int num1, int num2){
		return num1 + num2;
	}
	
	public static int restar(int num1, int num2){
		return num1 - num2;
	}
	
	public static int multiplicar(int num1, int num2){
		return num1 * num2;
	}
	
	public static int dividir(int num1, int num2){
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		System.out.println(sumar(54,20));
		System.out.println(restar(54,20));
		System.out.println(multiplicar(10,20));
		System.out.println(dividir(50,2));
	}

}
