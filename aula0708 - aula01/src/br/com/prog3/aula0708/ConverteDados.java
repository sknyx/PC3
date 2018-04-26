package br.com.prog3.aula0708;

import java.text.DecimalFormat;

public class ConverteDados {

	public static void main(String[] args) {
		String sValor1 = "89.7";
		String sValor2 = "68.57";
		DecimalFormat df = new DecimalFormat("0.##");
		
		double dvalor1 = Double.parseDouble(sValor1);
		double raiz = Math.sqrt(dvalor1);
		System.out.println(df.format(raiz));
		
		System.out.println(Math.sqrt(Double.parseDouble(sValor2)));
		
		//Convertendo para String
		Integer i = 45;
		String s = i.toString();
		}

}
