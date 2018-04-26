package br.com.prog3.aula0409;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Condominio {

	public static void main(String[] args) {
		// 2-
		Apartamento ap1 = new Apartamento();
		Apartamento ap2 = new Apartamento();
		Apartamento ap3 = new Apartamento();

		ap1.setCodigo(1);
		ap1.setArea(100.00);
		ap1.setNumeroComodo(7);

		ap2.setCodigo(1);
		ap2.setArea(120.00);
		ap2.setNumeroComodo(5);

		ap3.setCodigo(2);
		ap2.setArea(190.00);
		ap2.setNumeroComodo(8);
		// 3-
		Set<Apartamento> aps = new HashSet<>();

		aps.add(ap1);
		aps.add(ap2);
		aps.add(ap3);

		// 4-
		System.out.println(ap1.equals(ap3));

		Iterator<Apartamento> it = aps.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getCodigo());
		}

		// 5-
		long inicio = Calendar.getInstance().getTimeInMillis();

		for (int i = 0; i < 10000; i++) {
			Apartamento a = new Apartamento();
			a.setArea(505.00);
			a.setCodigo(i + 1);
			a.setNumeroComodo(4);
			aps.add(a);
		}

		long fim = Calendar.getInstance().getTimeInMillis();

		System.out.println("Tempo gasto: " + (fim - inicio));

		// 6-

		Iterator<Apartamento> p = aps.iterator();
		long i = Calendar.getInstance().getTimeInMillis();
		while (p.hasNext()) {
			Apartamento a = p.next();
			if (a.getCodigo() == 5000) {
				p.remove();
			}
		}

		long f = Calendar.getInstance().getTimeInMillis();
		System.out.println("Tempo gasto: " + (f - i));
		
		//7- mudar o return de hasCode pra return 0
	}
}
