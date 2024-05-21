package edu.jorge.desafio.contabanco.java;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite seu nome, por favor: ");
		System.out.print("R: ");
		String nome = scanner.next();

		System.out.println("Digite o numero de sua Agência: ");
		System.out.print("R: ");
		String agencia = scanner.next();
		
		System.out.println("Digite o numero de sua Conta com digito Ex: 12345-0: ");
		System.out.print("R: ");
		String conta = scanner.next();

		System.out.println("Digite o valor do seu depósito: ");
		System.out.print("R: R$ ");
		double saldo = scanner.nextDouble();

		System.out.println("=======================================================");

		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, \r\n"
				+ "sua agência é "+ agencia + ", conta e digito " + conta + ", \r\n"
				+ "e seu saldo de R$ "+ saldo + " já está disponível para saque.");
		
	}

}
