package br.com.prog3.aula0708;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormataData {

	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println("Data de hoje sem formata��o");
		System.out.println(hoje);
		System.out.println("Data de hoje com formata��o");
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
		System.out.println(df.format(hoje));
	}

}
