package br.com.prog3.aula0409;

import java.util.PriorityQueue;
import java.util.Queue;

public class Atividade7 {

	public static void main(String[] args) {
		Queue<Apartamento> filaApt = new PriorityQueue<>();
		
		Apartamento a1 = new Apartamento();
		Apartamento a2 = new Apartamento();
		Apartamento a3 = new Apartamento();

		a1.setCodigo(1);
		a1.setDescricao("Sei lá");

		a2.setCodigo(2);
		a2.setDescricao("N sei");

		a3.setCodigo(3);
		a3.setDescricao("Ainda n sei");

		filaApt.add(a1);
		filaApt.add(a2);
		filaApt.add(a3);
		
		for(Apartamento a: filaApt)
		{
			System.out.println(a.getCodigo());
			System.out.println(a.getDescricao());
		}
	}

}
