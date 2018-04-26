package br.com.prog3.aula0409;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Atividade2 {

	public static void main(String[] args) {
		// 1-
		Set<String> listaCursos = new HashSet<>();
		// 2-
		listaCursos.add("Ciência da Computação");
		listaCursos.add("Licenciatura em Física");
		listaCursos.add("Licenciatura em Química");
		listaCursos.add("Eletromecânica");
		listaCursos.add("Ciência da Computação");
		// 3-
		System.out.println(listaCursos.size()); // percebe-se que o hash não
												// insere elementos duplicados
		System.out.println("**Usando Iterator**");

		Iterator<String> it = listaCursos.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// 4-
		System.out.println("\n**Usando for-each**");

		for (String s : listaCursos) {
			System.out.println(s);
		}

		// 5-
		listaCursos.remove("Eletromecânica");

		System.out.println("\n** Após remover 'eletromecânica' **");

		for (String s : listaCursos) {
			System.out.println(s);
		}
		
		// 6-
		if ((listaCursos.contains("Licenciatura em Física")) && (listaCursos.contains("Eletromecânica"))) {
			System.out.println("\n\n--- Resultado(s) encontrado(s)! --- ");
		}else{
			System.out.println("\n\n--- Resultado(s) não encontrado(s)! --- ");
		}

		//7-
		listaCursos.clear();
		System.out.println(listaCursos.size());
		
	}

}
