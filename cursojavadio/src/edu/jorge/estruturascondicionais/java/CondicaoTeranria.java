package edu.jorge.estruturascondicionais.java;

public class CondicaoTeranria {

	public static void main(String[] args) {
		
		int nota = 5;
		
		String resultado = nota >= 7 ? "APROVADO" : "REPROVADO";
		System.out.println("O Aluno está " + resultado);
		
		System.out.println("=========================");
		
		String resultado2 = nota >= 7 ? "APROVADO" : nota >= 5 && nota <7 ? "RECUPERAÇÃO": "REPROVADO";
		System.out.println("O Aluno está " + resultado2);
		

	}

}
