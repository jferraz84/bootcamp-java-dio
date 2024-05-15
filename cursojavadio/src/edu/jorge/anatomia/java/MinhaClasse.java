package edu.jorge.anatomia.java;

public class MinhaClasse {

	public static void main(String[] args) {

		String primeiroNome = "Jorge";
		String segundoNome = " Santos Ferraz";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

		System.out.println("Helo World !!");
		System.out.println("Meu nome é : " + nomeCompleto);

	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {

		return primeiroNome.concat("").concat(segundoNome);

	}

}
