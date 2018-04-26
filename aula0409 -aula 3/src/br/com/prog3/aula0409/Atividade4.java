package br.com.prog3.aula0409;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Atividade4 {

	public static void main(String[] args) {
		
		Map<Integer, Apartamento> map1 = new Hashtable<>();
		Map<Integer, Apartamento> map2 = new HashMap<>();
		
		Apartamento ap1 = new Apartamento();
		Apartamento ap2 = new Apartamento();
		Apartamento ap3 = new Apartamento();
		
		ap1.setCodigo(1);
		ap1.setArea(45.0);
		ap2.setCodigo(2);
		ap2.setArea(87.00);
		ap3.setCodigo(3);
		ap3.setArea(49.00);

		map1.put(ap1.getCodigo(),ap1);
		map1.put(ap2.getCodigo(),ap2);
		map1.put(ap3.getCodigo(),ap3);		
		
		map2.put(ap1.getCodigo(),ap1);
		map2.put(ap2.getCodigo(),ap2);
		map2.put(ap3.getCodigo(),ap3);
		
		
		Set<Integer> chaves1 = map1.keySet();

		for (Integer i : chaves1) {
			System.out.println("Código: " + map1.get(i).getCodigo());
			System.out.println("Área: " + map1.get(i).getArea());

		}
		
		
	}

}
