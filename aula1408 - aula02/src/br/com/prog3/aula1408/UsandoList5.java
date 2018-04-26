package br.com.prog3.aula1408;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsandoList5 {

	public static void main(String[] args) {

		//Criar uma lista que aceita só o tipo string
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Ana");
		lista.add("Joana");
		lista.add("Carla");
		
/*		for (String s : lista) {
			System.out.println(s);
		}
		*/
		//lista.remove("Nome");

		//Ordenando a lista
		Collections.sort(lista);
		for (String s : lista) {
			System.out.println(s);
		}
		
	}

}
