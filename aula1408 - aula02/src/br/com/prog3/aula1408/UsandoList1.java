package br.com.prog3.aula1408;

import java.util.ArrayList;

public class UsandoList1 {

	public static void main(String[] args) {
		// Criando lista usando ArrayList
		ArrayList listaDinamica = new ArrayList();
		listaDinamica.add("Ana Clara");
		listaDinamica.add(89.6);
		listaDinamica.add(90.0f);
		listaDinamica.add("Hoje é segunda-feira");
		listaDinamica.add(12);

		// Percorrendo a lista
		for (int i = 0; i < listaDinamica.size(); i++) {
			System.out.println(listaDinamica.get(i));
		}
		
		
	}

}
