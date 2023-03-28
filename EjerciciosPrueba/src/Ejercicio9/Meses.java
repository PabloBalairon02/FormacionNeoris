package Ejercicio9;

public class Meses {
	
	public static boolean ejercicio1(int dia, int mes) {
		if(dia>30 || dia <1 || mes>12 || mes<1) {
			return false;
		}
		return true;
	}
	
	public static boolean ejercicio2(int dia, int mes, int anyo) {
		if(dia<1 || mes<1|| mes>12) {
			return false;
		}
		if(mes==2) {
			if(anyo%4==0 && (anyo%100 != 0 || anyo % 400 == 0)) {
				if(dia>29) {
					return false;
				}
			}else {
				if(dia>28) {
					return false;
				}
			}
		}else if(mes==4||mes==6||mes==9||mes==11){
			if(dia>30) {
				return false;
			}
		}else {
			if(dia>31) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean ejercicio3(int dia, int mes, int anyo) {
		int[]diasTopMes = {31,28,31,30,31,30,31,31,39,31,30,31};
		if(dia<1 || mes<1|| mes>12) {
			return false;
		}
		if(mes==2) {
			if(anyo%4==0 && (anyo%100 != 0 || anyo % 400 == 0)) {
				if(dia>29) {
					return false;
				}
			}else {
				if(dia>28) {
					return false;
				}
			}
		}else if(mes==4||mes==6||mes==9||mes==11){
			if(dia>30) {
				return false;
			}
		}else {
			if(dia>diasTopMes[mes-1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int dia = 20, mes = 8, anyo=2015;
		System.out.println(ejercicio1(dia,mes));
		System.out.println(ejercicio2(dia,mes,anyo));
		System.out.println(ejercicio3(dia,mes,anyo));
		System.out.println(ejercicio3(dia,mes,anyo));
		//pongo el mismo ejercicio3 por que se haría de la misma manera, ya que contemplo si es bisiesto o no
	}
}
