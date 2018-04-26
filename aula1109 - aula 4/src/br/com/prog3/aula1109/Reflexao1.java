package br.com.prog3.aula1109;

import br.com.prog3.aula0409.Apartamento;

public class Reflexao1 {

	public static void main(String[] args) {
		Integer i = new Integer(6);
		Apartamento a = new Apartamento();
		Class c = i.getClass();
		Class d = a.getClass();
		System.out.println(d);
	}

}
