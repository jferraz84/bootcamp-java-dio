package edu.jorge.estruturascondicionais.java;

public class ResultadoEscolar {

	public static void main(String[] args) {
		
		int nota = 6;
		
		//As condições devem retornar TRUE OU FALSE
		
		if (nota >= 7) {
			System.out.println("Aluno está APROVADO !!");
			
		}else if (nota >= 6 && nota < 7) {
			System.out.println("Prova de RECUPERAÇÃO");
			
		}else {
			System.out.println("Aluno está REPROVADO !!");
		}

	}

}
