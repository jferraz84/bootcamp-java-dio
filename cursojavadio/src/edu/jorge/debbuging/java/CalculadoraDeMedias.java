package edu.jorge.debbuging.java;

import java.util.Scanner;

public class CalculadoraDeMedias {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] alunos = {"Jorge", "Heloyse", "Aline", "Heloa"};
		
		int media = calculaMediaDaTurma(alunos, scan);
		System.out.printf("Media da turma %d", media);

	}

	private static int calculaMediaDaTurma(String[] alunos, Scanner scanner) {
		int soma = 0;
		for (String aluno : alunos) {
			System.out.printf("Nota do Aluno %s: ", aluno);
			int nota = scanner.nextInt();
			soma += nota;
			
		}
		return soma / alunos.length;
	}

}
