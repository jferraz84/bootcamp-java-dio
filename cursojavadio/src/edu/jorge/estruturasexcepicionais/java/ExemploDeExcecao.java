package edu.jorge.estruturasexcepicionais.java;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploDeExcecao {

	public static void main(String[] args) {

		//Number valor = Double.valueOf("a1.75");

		Number valor;
		try {
			valor = NumberFormat.getInstance().parse("a1.75");
			System.out.println(valor);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
