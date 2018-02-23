package com.projeto.operadoreslogicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 2;
				
		boolean resultadoIgual = a == b;
		boolean resultadoDiferente = a != b;
		boolean resultadoMayor = a > b;
		boolean resultadoMayorIgual = a >= b;
		boolean resultadoMenor = a < b;
		boolean resultadoMenorIgual = a <= b;
		boolean resultadoY = a == b && a < b;
		boolean resultadoO = a == b ||  a > b;
		
		System.out.println(resultadoIgual);
		System.out.println(resultadoDiferente);
		System.out.println(resultadoMayor);
		System.out.println(resultadoMayorIgual);
		System.out.println(resultadoMenor);
		System.out.println(resultadoMenorIgual);
		System.out.println(resultadoY);
		System.out.println(resultadoO);

	}

}
