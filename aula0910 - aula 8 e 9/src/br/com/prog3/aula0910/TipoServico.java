package br.com.prog3.aula0910;

public enum TipoServico {
	
	CARGA_CARTUCHO("Carga de cartuchos de impressora.",26.00),
	LIMPEZA_PC("Limpeza interna de cases.",50.00),	
	CONFIG_IMPRESSORA("Configuração de impressoras.",60.00),
	CONSERTO_IMPRESSORA("Conserto de impressoras.",50.00),
	CONFIG_PC("Configuração de computadores.",100.00);
	
	private String descricao;
	private double valor;
	
	TipoServico(String descricao, double valor){
		this.descricao = descricao;
		this.valor = valor;
		}
	
	public String getDescricao(){
		return descricao;
		}
		public double getValor(){
		return valor;
		}
}
