package edu.jorge.metodos.java;

public class SmartTv {

	boolean ligada = true;
	int canal = 1;
	int volume = 25;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}
	
	public void aumentaVolume() {
		volume ++;
	}

	public void abaixaVolume() {
		volume --;
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarCanal() {
		canal++;
	}

	public void diminuirCanal() {
		canal--;
	}

}
