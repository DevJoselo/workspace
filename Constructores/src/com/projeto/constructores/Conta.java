package com.projeto.constructores;

public class Conta {

	//atributos
	private int numeroConta;
	private double saldo;
	
	// Constructor //
	// Responsable por la inicializacion de nuestro objeto.
	// El constructor debe tener el misom nombre de la clase.
	// No permite el retorno del valor.
	// No es obligatorio su uso.
	public Conta(int nConta){
		//Corpo del constructor para que haga exactamente lo que queramos
		this.numeroConta = nConta;
	}
	
	
	
	//metodo
	public void imprime(){
		System.out.println(this.numeroConta);		
	}
}

// 	constructores y métodos (parecidos y diferencias)
//*	public Conta(){} constructor
//	public void teste(){} metodo que no tiene retorno
//	public String teste(){} metodo que retorna un String
//	public int teste(){} metodo que retorna un int
//	public double teste(){} metodo que retorna un double