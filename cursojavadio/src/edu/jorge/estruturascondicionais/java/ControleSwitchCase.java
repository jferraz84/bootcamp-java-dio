package edu.jorge.estruturascondicionais.java;

public class ControleSwitchCase {

	public static void main(String[] args) {

		String sigla = "S";

		switch (sigla) {
		case "P":
			System.out.println("PEQUENO");
			break;
		case "M":
			System.out.println("MÉDIO");	
			break;
		case "G":
			System.out.println("GRANDE");
		default:
			System.out.println("INDEFINIDO");
			break;
		}

	}

}
