package edu.jorge.terminaleargumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutNeScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome: ");
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
		
		System.out.println("================================================");
		
		System.out.println("Olá meu nome é " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("MInha altura é " + altura + " cm");
         
		
		

	}

}
