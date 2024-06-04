package edu.jorge.estruturascondicionais.java;

public class CondicionaisSimples {

	public static void main(String[] args) {
		
		//Caixa Eletrônico.java
		
		double saldo = 25.00;
		double valorSolicitado = 17.00;
		
		if (saldo >= valorSolicitado) {
			double novoSaldo = saldo - valorSolicitado; 
			System.out.println("Operação realizado !!");
			System.out.println("Seu saldo era de R$ " + saldo + " e o valor solicitado foi de R$ " + valorSolicitado );
			System.out.println("Seu novo Saldo é de R$ " + novoSaldo);
		} else {
			System.err.println("Operação NÃO REALIZADA !!");
			System.out.println("Seu saldo de R$ " + saldo + " é insulficiente para o saque de R$ " + valorSolicitado);
		}
		
		

	}

}
