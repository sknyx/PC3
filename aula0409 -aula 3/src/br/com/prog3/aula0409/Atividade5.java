package br.com.prog3.aula0409;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Atividade5 {

	public static void main(String[] args) {

		Map<Integer, Apartamento> map = new LinkedHashMap<>();

		Apartamento a1 = new Apartamento();
		Apartamento a2 = new Apartamento();
		Apartamento a3 = new Apartamento();

		a1.setCodigo(1);
		a1.setDescricao("Sei lá");

		a2.setCodigo(2);
		a2.setDescricao("N sei");

		a3.setCodigo(3);
		a3.setDescricao("Ainda n sei");

		map.put(a1.getCodigo(), a1);
		map.put(a2.getCodigo(), a2);
		map.put(a3.getCodigo(), a3);

		Set<Integer> chaves1 = map.keySet();

		for (Integer i : chaves1) {
			System.out.println("Código: " + map.get(i).getCodigo());
			System.out.println("Área: " + map.get(i).getDescricao());

		}
	}

}
