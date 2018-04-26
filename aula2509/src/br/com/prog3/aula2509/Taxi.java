package br.com.prog3.aula2509;

public class Taxi extends Carro{
	String areaAtuacao;
	String tipo;
	String companhia;
	
	private static final double PERCENTUAL = 0.025;

	public double calcularIpva(double valor){
		return valor*PERCENTUAL;
		}
	
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	
	public Taxi(){}
	public Taxi(String placa, double valor, String companhia){
	super(placa,valor);
	this.companhia = companhia;
	}

}
