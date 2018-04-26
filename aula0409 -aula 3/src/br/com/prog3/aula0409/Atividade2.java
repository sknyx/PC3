package br.com.prog3.aula0409;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Atividade2 {

	public static void main(String[] args) {
		// 1-
		Set<String> listaCursos = new HashSet<>();
		// 2-
		listaCursos.add("Ci�ncia da Computa��o");
		listaCursos.add("Licenciatura em F�sica");
		listaCursos.add("Licenciatura em Qu�mica");
		listaCursos.add("Eletromec�nica");
		listaCursos.add("Ci�ncia da Computa��o");
		// 3-
		System.out.println(listaCursos.size()); // percebe-se que o hash n�o
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
		listaCursos.remove("Eletromec�nica");

		System.out.println("\n** Ap�s remover 'eletromec�nica' **");

		for (String s : listaCursos) {
			System.out.println(s);
		}
		
		// 6-
		if ((listaCursos.contains("Licenciatura em F�sica")) && (listaCursos.contains("Eletromec�nica"))) {
			System.out.println("\n\n--- Resultado(s) encontrado(s)! --- ");
		}else{
			System.out.println("\n\n--- Resultado(s) n�o encontrado(s)! --- ");
		}

		//7-
		listaCursos.clear();
		System.out.println(listaCursos.size());
		
	}

}
