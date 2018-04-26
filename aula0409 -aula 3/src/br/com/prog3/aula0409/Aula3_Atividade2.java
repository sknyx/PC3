package br.com.prog3.aula0409;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aula3_Atividade2 {
	public static void main(String[] args) {

		Set<Integer> numerosH = new HashSet<>();
		Set<Integer> numerosL = new LinkedHashSet<>();
		Set<Integer> numerosT = new TreeSet<>();

		numerosH.add(2);
		numerosH.add(1);

		for (Integer n2 : numerosH) {
			System.out.println("Com HashSet: " + n2);
		}

		numerosL.add(2);
		numerosL.add(1);

		for (Integer n2 : numerosL) {
			System.out.println("Com LinkedHashSet: " + n2);
		}

		numerosT.add(2);
		numerosT.add(1);

		for (Integer n2 : numerosT) {
			System.out.println("Com TreeSet: " + n2);
		}
	}
}
