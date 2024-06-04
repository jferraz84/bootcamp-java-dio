package edu.jorge.estruturascondicionais.java;

public class ExemploBreackContinue {

	public static void main(String[] args) {

		for (int numero = 1; numero <= 5; numero++) {
			if (numero == 3) 
				continue;

			System.out.println("Meu numero é " + numero);
		}

	}

}
