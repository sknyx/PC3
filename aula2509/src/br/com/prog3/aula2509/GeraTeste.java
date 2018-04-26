package br.com.prog3.aula2509;

public class GeraTeste {
	public static void main(String[] args) throws ClassNotFoundException {
		Gera g = new Gera();
		Carro carro = g.instanciarClasse(Class.forName("br.com.prog3.aula4.Carro"));
		carro.setPlaca("JKK0909");
		System.out.println(carro.getPlaca());
	}
}
