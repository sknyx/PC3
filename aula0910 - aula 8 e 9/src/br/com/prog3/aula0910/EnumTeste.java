package br.com.prog3.aula0910;

import java.util.LinkedList;
import java.util.List;

public class EnumTeste {
static double total = 0.0;

	public static void main(String[] args) {
		
		//System.out.println(TipoPessoa.PESSOA_JURIDICA);
		/*
		TipoPessoa tp1 = TipoPessoa.PESSOA_FISICA;
		TipoPessoa tp2 = TipoPessoa.PESSOA_JURIDICA;
		System.out.println(tp1);
		System.out.println(tp1.name());
		System.out.println(tp1.toString());*/
		
		//System.out.println(EstadoCivil.CASADO.getValor());
		//System.out.println(EstadoCivil.CASADO);
		
		//System.out.println(Uf.DF);
		//System.out.println(Uf.DF.getDescricao());
		
		//System.out.println(Imposto.calcularImposto(115000.0, Taxa.ITBI));

		
		List<Servicos> lista = new LinkedList<>();	
		
		Servicos s1 = new Servicos();
		Servicos s2 = new Servicos();
		
		s1.setQtde(3);
		s1.setTipo("CARGA_CARTUCHO");		
		s2.setQtde(2);
		s2.setTipo("LIMPEZA_PC");
		
		lista.add(s1);
		lista.add(s2);
		
		for (Servicos a : lista) {
			
		total = total + CalculoServicos.calcularValorTotal(a.getQtde() , a.getTipo());
			
		}
		System.out.println("Total:"+total);
	}

}
