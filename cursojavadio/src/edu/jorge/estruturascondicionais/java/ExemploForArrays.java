package edu.jorge.estruturascondicionais.java;

public class ExemploForArrays {

	public static void main(String[] args) {
		
		String alunos[] = {"Jorge", "Aline", "Heloyse", "Heloa"};
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("O aluno no indice: " + i + " é " + alunos[i]);
		}
		System.out.println("--------------------------------------");

		for (String aluno : alunos) {
			System.out.println("Nome do aluno é: " + aluno);
		}
	}

}
