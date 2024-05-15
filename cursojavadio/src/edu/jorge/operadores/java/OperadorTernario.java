package edu.jorge.operadores.java;

public class OperadorTernario {

	public static void main(String[] args) {
		int a, b;

		a = 5;
		b = 6;
		String resultado = "";

		if (a == b)
			resultado = "Verdadeiro";
		else
			resultado = "Falso";

		System.out.println(resultado);
		
		//Segundo exemplo utilizando OPERADOR TERNARIO
		
		a = 5;
		b = 5;
		
		String resultado1 = a == b ? "Verdadeiro" : "Falso";
		System.out.println(resultado1);
		

	}

}
