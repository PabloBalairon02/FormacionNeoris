package Ejercicio10;

import java.util.Scanner;

public class NumLetras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Pon un número: ");
		int num = teclado.nextInt();
		
		String[]unidades = {"","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
		String[]decenas = {"","diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
		String[]excepciones = {"once","doce","trece","catorce","quince","dieciséis","diecieiste","dieciocho","diecinueve"};
		
		if(num==0) {
			System.out.println("cero");
		}else if(num==100){
			System.out.println("cien");
		}else if(num<0||num>100) {
			System.out.println("No se puede poner más de 100");
		}else if(num<=9) {
			System.out.println(unidades[num]);
		}else if(num==10||num==20||num==30||num==40||num==50||num==60||num==70||num==80||num==90) {
			System.out.println(decenas[num/10]);
		}else if(num>=11 && num <=19) {
			System.out.println(excepciones[num-11]);
		}else {
			int decena = num/10;
			int unidad = num%10;
			System.out.println(decenas[decena] + " y " + unidades[unidad]);
		}
	}
}
