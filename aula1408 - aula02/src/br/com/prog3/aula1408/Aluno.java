package br.com.prog3.aula1408;

import java.util.Date;

public class Aluno implements Comparable<Aluno> {

	private Integer matricula;
	private String nome;
	private Date dataNascimento;

	// gets e sets necessários para que os atributos privados estejam visiveis para
	// outras classes/pacotes

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	//Sobrescrevendo o metodo compateTo para ordenar pela matricula
/*	@Override
	public int compareTo(Aluno aluno) {
		// Ordenação pela matricula
		if (this.matricula < aluno.matricula) {
			return -1;
		}
		if(this.matricula > aluno.matricula) {
			return 1;
		}
		return 0;
	}
*/
	
	//Sobrescrevendo o metodo compateTo para ordenar pelo nome
	@Override
	public int compareTo(Aluno aluno) {
		// Ordenação pelo nome
		return this.nome.compareTo(aluno.nome);
	}

	
	
	
	
}
