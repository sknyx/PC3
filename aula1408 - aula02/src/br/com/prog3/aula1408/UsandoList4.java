package br.com.prog3.aula1408;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.prog3.util.Util;

public class UsandoList4 {

	public static void main(String[] args) {

		List<Aluno> lista = new LinkedList<>(); // = LinkedList<Aluno> lista = new LinkedList<>();
		
		// Criando 3 objetos Aluno
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();

		// Atribuindo valores para os objetos
		a1.setDataNascimento(Util.getData(23, 7, 1995));
		a1.setMatricula(34);
		a1.setNome("Maria");

		a2.setDataNascimento(Util.getData(21, 4, 1999));
		a2.setMatricula(90);
		a2.setNome("João");

		a3.setDataNascimento(Util.getData(7, 2, 1993));
		a3.setMatricula(89);
		a3.setNome("Ana");

		// Adicionando os objetos a lista

		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		// Imprimindo com o for-each
		System.out.println("Usando linked list:");
				for (Aluno a : lista) {
					System.out.println("Nome: " + a.getNome() + "\nMatricula: " + a.getMatricula() + "\nData de nascimento: "
							+ Util.formataDiaMesAno(a.getDataNascimento()));
				}
				
		lista = new Vector<>();		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);		
				
		System.out.println("\nUsando  vector:");
		
		for (Aluno a : lista) {
			System.out.println("Nome: " + a.getNome() + "\nMatricula: " + a.getMatricula() + "\nData de nascimento: "
					+ Util.formataDiaMesAno(a.getDataNascimento()));
		}
	}
}
