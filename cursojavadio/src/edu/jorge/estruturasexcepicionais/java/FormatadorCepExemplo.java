package edu.jorge.estruturasexcepicionais.java;

public class FormatadorCepExemplo {

	public static void main(String[] args) {
		
		try {
			String cepFormatado = formatarCep("8383352");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			System.err.println("O CEP não corresponde com a regra de négocio");
		}	

	}
	
	static String formatarCep(String cep) throws CepInvalidoException{
		if (cep.length() != 8) {
			throw new CepInvalidoException();
			
			//simulando um cep formatado
		}
		return "83.833-542";
	}

}
