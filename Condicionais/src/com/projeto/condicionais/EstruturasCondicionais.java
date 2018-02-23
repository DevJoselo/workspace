package com.projeto.condicionais;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		// Estruturas Condicionais - if else
		
		int nota = 9;
				
		if (nota < 6) {
			System.out.println("reprobado");
		}
		else if ( nota >= 6 && nota <= 8) {
			System.out.println("aprobado");
		}
		else if (nota > 8){
			System.out.println("aprobado excelente");
		}
		else {
			System.out.println("otra opcion ");
		}
	}
}
