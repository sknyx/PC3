package br.com.prog3.aula0409;

public class Apartamento implements Comparable<Apartamento> {
	Integer codigo;
	Double area;
	Integer numeroComodo;
	String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Integer getNumeroComodo() {
		return numeroComodo;
	}

	public void setNumeroComodo(Integer numeroComodo) {
		this.numeroComodo = numeroComodo;
	}

	public boolean equals(Object obj) {
		if ((obj instanceof Apartamento) && ((Apartamento) obj).getCodigo().equals(this.codigo)) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return codigo; // colocar return 0 para fazer o exercício 7
	}

	@Override
	public int compareTo(Apartamento apartamento) {
		// Ordenação pela matrícula
		if (this.codigo < apartamento.codigo) {
			return -1;
		}
		if (this.codigo > apartamento.codigo) {
			return 1;
		}
		return 0;
	}

}
