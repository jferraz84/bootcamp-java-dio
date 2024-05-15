package edu.jorge.operadores.java;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		boolean simNao1 = numero1 <= numero2;
		boolean simNao2 = numero1 < numero2;
		boolean simNao3 = numero1 >= numero2;
		boolean simNao4 = numero1 > numero2;
		boolean simNao5 = numero1 != numero2;
		
		System.out.println("numero1 é igual ao numero2: " + simNao);
		System.out.println("numero1 é menor ou igual ao numero2: " + simNao1);
		System.out.println("numero1 é menor ao numero2: " + simNao2);
		System.out.println("numero1 é maior ou igual ao numero2: " + simNao3);
		System.out.println("numero1 é maior ao numero2: " + simNao4);
		System.out.println("numero1 é diferente ao numero2: " + simNao5);

	}

}
