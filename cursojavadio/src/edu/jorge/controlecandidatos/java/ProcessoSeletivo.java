package edu.jorge.controlecandidatos.java;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {

		// System.out.println("Processo Seletivo");
		// selecaoCandidatos();
		// imprimirSelecionados();

		String[] candidatos = { "Pedro", "José", "Eduardo", "Patricia", "Heloyse" };

		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}

	}

	public static void entrandoEmContato(String candidato) {

		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;

		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("CONTATO REALIZADO COM SUCESSO COM CANDIDATO " + candidato);
			}
		} while (continuarTentando && tentativasRealizadas > 3);
		if (atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "° TENTATIVA");
		} else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
		}
	}

	// método auxiliar
	public static boolean atender() {
		return new Random().nextInt(3) == 1;
	}

	public static void imprimirSelecionados() {
		String[] candidatos = { "Pedro", "José", "Eduardo", "Patricia", "Heloyse" };
		System.out.println("IMprimindo a lista de candidatos informando o indice do elemento");

		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
		}

		System.out.println("=======================================");

		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);

		}
	}

	public static void selecaoCandidatos() {
		// Array com lista de Candidatos
		String[] candidatos = { "Pedro", "José", "Eduardo", "Patricia", "Heloyse", "Guilherme", "João", "Gustavo",
				"Paula", "Ana" };

		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;

		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O Candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O Candidato " + candidato + " foi selecinado para a vaga !");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}

	public static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	public static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;

		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM A CONTRA PROPOSTA !!");
		} else {
			System.out.println("AGUARDANDO RESULTADOS DOS DEMAIS CANDIDATOS !!");
		}
	}

}
