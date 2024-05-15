package edu.jorge.metodos.java;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv  smartTv = new SmartTv();
		
		System.out.println("Tv Ligada : " + smartTv.ligada);
		System.out.println("Canal atual : " + smartTv.canal);
		System.out.println("Volume atual da TV : " + smartTv.volume);
		
		System.out.println("=============================================");
		
		smartTv.desligar();
		System.out.println("Novo status -> TV Ligada: " + smartTv.ligada);

		smartTv.ligar();
		System.out.println("Novo status -> TV Ligada: " + smartTv.ligada);
		
		System.out.println("=============================================");
		
		smartTv.aumentaVolume();
		System.out.println("Novo status -> Volume atual da TV: " + smartTv.volume);

		smartTv.abaixaVolume();
		System.out.println("Novo status -> Volume atual da TV: " + smartTv.volume);
		
		System.out.println("=============================================");
		
		smartTv.mudarCanal(15);
		System.out.println("Canal atual : " + smartTv.canal);
		
		smartTv.aumentarCanal();
		System.out.println("Novo status -> Canal atual da TV: " + smartTv.canal);

		smartTv.diminuirCanal();
		System.out.println("Novo status -> Canal atual da TV: " + smartTv.canal);

	}

}
