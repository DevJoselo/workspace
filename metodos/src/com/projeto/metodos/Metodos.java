package com.projeto.metodos;

public class Metodos {

	public static void main(String[] args) {
		
		miMetodo();
		producto(2,3);
		
		int resultado2;
		resultado2 = retornaProducto(3,5);
		System.out.println(resultado2 + 5);
				
	}
	
	public static void miMetodo(){
		System.out.println("este es mi metodo");
	}

	public static void producto(int number1, int number2){
		int result1 = 0;
		result1 = number1 * number2;
		System.out.println(result1);
	}
	
	public static int retornaProducto(int n1, int n2){
		int resultado2 = 0;
		resultado2 = n1 * n2;
		return resultado2;
	}
}

//public - Todos (clases) tendran acceso.
//private - Apenas puede ser accesado dentro de la clase.
//protected - Puede ser accesado, estando dentro del mismo paquete y/o clases derivadas.
//default - Caso no tenga sido definido ningun modificador, ese sera utilizado permitiendo el acceso dentro del paquete.
