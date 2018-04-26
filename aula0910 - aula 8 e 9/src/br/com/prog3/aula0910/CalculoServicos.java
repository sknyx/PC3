 package br.com.prog3.aula0910;

public class CalculoServicos {
	
	public static double calcularValor(double qtde, TipoServico tipo) {
		switch (tipo) {
		case CARGA_CARTUCHO:
			return qtde * TipoServico.CARGA_CARTUCHO.getValor();
		case LIMPEZA_PC:
			return qtde * TipoServico.LIMPEZA_PC.getValor();
		case CONFIG_IMPRESSORA:
			return qtde * TipoServico.CONFIG_IMPRESSORA.getValor();
		case CONSERTO_IMPRESSORA:
			return qtde * TipoServico.CONSERTO_IMPRESSORA.getValor();
		case CONFIG_PC:
			return qtde * TipoServico.CONFIG_PC.getValor();
		default:
			return 0.0;
		}
	}	

	public static double calcularValorTotal(double qtde, String tipo) {
		switch (tipo) {
		case "CARGA_CARTUCHO":
			return (qtde * TipoServico.CARGA_CARTUCHO.getValor());
		case "LIMPEZA_PC":
			return (qtde * TipoServico.LIMPEZA_PC.getValor());
		case "CONFIG_IMPRESSORA":
			return (qtde * TipoServico.CONFIG_IMPRESSORA.getValor());
		case "CONSERTO_IMPRESSORA":
			return (qtde * TipoServico.CONSERTO_IMPRESSORA.getValor());
		case "CONFIG_PC":
			return (qtde * TipoServico.CONFIG_PC.getValor());
		default:
			return 0.0;
		}
	}
	
	
}
