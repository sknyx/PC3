package br.com.prog3.aula0910;

public enum Uf {
	AC("Acre"),
	AL("Alagoas"),
	AP("Amapá"),
	AM("Amazonas"),
	BA("Bahia"),
	CE("Ceará"),
	DF("Distrito Federal");
	
	private String descricao;
	Uf(String descricao){
		this.descricao = descricao;
		}
	public String getDescricao(){
		return descricao;
		}
}
