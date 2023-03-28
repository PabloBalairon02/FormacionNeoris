package Ejercicio7;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1,num2;
		System.out.println("Dime el número 1");
		num1 = teclado.nextInt();
		System.out.println("Dime el número 2");
		num2 = teclado.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 + " es mayor que " + num2);
		}else if(num2 <num1){
			System.out.println(num2 + " es mayor que " + num1);
		}else{
			System.out.println(num2 + " es igual que " + num1);
		}
		
		if(num1%num2==0) {
			System.out.println(num1 + " es multiplo de " + num2);
		}
		
		if(num2%num1==0) {
			System.out.println(num2 + " es multiplo de " + num1);
		}
	}
}
