package br.com.prog3.aula0708;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormataDado {

	public static void main(String[] args) {
		double valor = 35.5454622;
		
		//Usando NumberFormat
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println("Antes da formata��o");
		System.out.println(valor);
		System.out.println("Depois da formata��o");
		System.out.println(nf.format(valor));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("PT-BR"));
		System.out.println(nf1.format(valor));
		
		//Usando DecimalFormat
		DecimalFormat df = new DecimalFormat("0.###"); //casas ap�s a v�rgula -> #
		System.out.println(df.format(valor));
		
	}

}
