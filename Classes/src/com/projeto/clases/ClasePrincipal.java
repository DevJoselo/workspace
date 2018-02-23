package com.projeto.clases;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		Casa miCasa = new Casa();
		Casa novaCasa = new Casa();
		
		miCasa.cor="Azul";
		System.out.println(miCasa.cor);
		miCasa.abrirGaragem();

	}
	
}

//Que es POO? = es una forma de programación, en la cual los programas son organizados como un conjunto de objetos.
//Que es una clase? = Es un modelo (Template) para la creacion de un conjunto de objetos, que comparten una estructura(Atributos) y acciones (metodos) comunes.
//Que son atributos de un objeto? = Los atributos definen las caracteristicas de un objeto.
//Que son métodos?= Los metodos definen comportamientos o acciones que los objetos pueden hacer.
//Que son objetos?= Objeto es una instancia de una clase, teniendo atributos y comportamientos.
//Suponiendo que yo tenga una clases "Casa" cree una nueva instancia de esa casa = Casa nuevaCasa = new Casa().