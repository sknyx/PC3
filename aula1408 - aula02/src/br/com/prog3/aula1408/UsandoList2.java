package br.com.prog3.aula1408;

import java.util.ArrayList;

import br.com.prog3.util.Util;

public class UsandoList2 {

	public static void main(String[] args) {
		//Criando uma lista din�mica
		ArrayList lista = new ArrayList();
		
		//Criando 3 objetos Aluno
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		//Atribuindo valores para os objetos 
		a1.setDataNascimento(Util.getData(23, 7, 1995));
		a1.setMatricula(34);
		a1.setNome("Maria");
		
		a2.setDataNascimento(Util.getData(21, 4, 1999));
		a2.setMatricula(90);
		a2.setNome("Jo�o");
		
		a3.setDataNascimento(Util.getData(7, 2, 1993));
		a3.setMatricula(89);
		a3.setNome("Ana");
		
		
		//Adicionando os objetos a lista
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		//Imprimindo os objetos na tela forma 1 - n�o d� certo pois n�o imprime OS DADOS do objeto
/*		for(int i=0; i<lista.size(); i++)
		{
			
			System.out.println(lista.get(i));
		}*/
		
		//Imprimindo os objetos na tela forma 2
		
		for(int i=0; i<lista.size(); i++)
		{
			Aluno a = new Aluno();
			a = (Aluno)lista.get(i);
			System.out.println("Nome: "+a.getNome()+"\nMatricula: "+a.getMatricula()+"\nData de nascimento: "+ Util.formataDiaMesAno(a.getDataNascimento()));
		}
		
	}

}
