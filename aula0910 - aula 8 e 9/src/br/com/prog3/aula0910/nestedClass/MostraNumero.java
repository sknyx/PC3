package br.com.prog3.aula0910.nestedClass;

public class MostraNumero {
	private Integer numero = 123;
	
	public class MostraNumeroInterno{
		public int getNumero(){
		return numero;
		}
		}
}
