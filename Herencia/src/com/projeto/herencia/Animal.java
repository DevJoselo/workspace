package com.projeto.herencia;

public class Animal {

	//Atributos
	private String tamanho;
	private String cor;
	private double peso;
	
	//metodos - acciones
	public void correr(){
		System.out.println("correr como animal");
	}
	
	public void dormir(){
		System.out.println("dormir como animal");
	}
	
	//getter and setter
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	//getter and setter
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public double getPeso(){
		return this.peso;
	}
}
