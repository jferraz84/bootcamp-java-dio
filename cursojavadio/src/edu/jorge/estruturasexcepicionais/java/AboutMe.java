package edu.jorge.estruturasexcepicionais.java;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		try {

			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

			System.out.println("Digite seu nome, por favor: ");
			System.out.print("R: ");
			String nome = scanner.next();

			System.out.println("Digite seu sobrenome: ");
			System.out.print("R: ");
			String sobrenome = scanner.next();

			System.out.println("Digite sua idade: ");
			System.out.print("R: ");
			int idade = scanner.nextInt();

			System.out.println("Digite sua altura: ");
			System.out.print("R: ");
			double altura = scanner.nextDouble();

			System.out.println("======================================================");

			// imprimindo os dados obtidos pelo usuario
			System.out.println("Olá meu nome é " + nome.toUpperCase());
			System.out.println("Tenho " + idade + " anos");
			System.out.println("Minha altura é " + altura + " cm");

		} catch (InputMismatchException e) {
			System.err.println("Os campos idade e altura precisam ser numéicos !!");
		}
	}

}
