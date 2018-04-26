package br.com.prog3.aula0409;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Aula3_Atividade1 {
	Integer codigo;
	String descricao;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static void main(String[] args) {
		Set<Aula3_Atividade1> atv = new HashSet<>();
		 
		Aula3_Atividade1 a1 = new Aula3_Atividade1();
		Aula3_Atividade1 a2 = new Aula3_Atividade1();
		Aula3_Atividade1 a3 = new Aula3_Atividade1();
		
		a1.setCodigo(1);
		a1.setDescricao("Sei lá");
		
		a2.setCodigo(2);
		a2.setDescricao("N sei");
		
		a3.setCodigo(3);
		a3.setDescricao("Ainda n sei");
		
		atv.add(a1);
		atv.add(a2);
		atv.add(a3);

		Iterator<Aula3_Atividade1> it = atv.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getCodigo());
		}
		
		comparaHashSetComLinkedHashSet();
	}
	
	public static void comparaHashSetComLinkedHashSet(){
		
		Set<Integer> numerosH = new HashSet<>();
		Set<Integer> numerosL = new LinkedHashSet<>();
		
		for(int i=0; i<20; i++)
		{
			numerosH.add(i+1);
			numerosL.add(i+1);
		}
		
		for(Integer n2: numerosH){
			System.out.println(n2);
		}
	}
	
	
}
