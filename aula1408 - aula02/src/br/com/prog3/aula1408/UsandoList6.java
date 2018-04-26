package br.com.prog3.aula1408;

import java.util.ArrayList;
import java.util.Collections;

import br.com.prog3.util.Util;

public class UsandoList6 {

	public static void main(String[] args) {
		// Criando uma lista dinâmica
				ArrayList<Aluno> lista = new ArrayList<Aluno>(); // só permite adiconar valores referentes ao objeto aluno

				// Criando 3 objetos Aluno
				Aluno a1 = new Aluno();
				Aluno a2 = new Aluno();
				Aluno a3 = new Aluno();
				Aluno a4 = new Aluno();

				// Atribuindo valores para os objetos
				a1.setDataNascimento(Util.getData(23, 7, 1995));
				a1.setMatricula(34);
				a1.setNome("Maria");

				a2.setDataNascimento(Util.getData(21, 4, 1999));
				a2.setMatricula(90);
				a2.setNome("João");

				a3.setDataNascimento(Util.getData(7, 2, 1993));
				a3.setMatricula(89);
				a3.setNome("Carla");
				
				a4.setDataNascimento(Util.getData(15, 9, 1997));
				a4.setMatricula(8);
				a4.setNome("Ana");

				// Adicionando os objetos a lista

				lista.add(a1);
				lista.add(a2);
				lista.add(a3);
				lista.add(a4);
				
				Collections.sort(lista);
				
				// Imprimindo com o for-each
				for (Aluno a : lista) {
					System.out.println("Nome: " + a.getNome() + "\nMatricula: " + a.getMatricula() + "\nData de nascimento: "
							+ Util.formataDiaMesAno(a.getDataNascimento()));
				}				
	}

}
