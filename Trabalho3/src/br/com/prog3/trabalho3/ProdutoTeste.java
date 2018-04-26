package br.com.prog3.trabalho3;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		Produto produto = new Produto();
		Compra t0 = new Compra(produto, 100);
		Venda t1 = new Venda(produto, 50);
		Compra t2 = new Compra(produto, 0);
		Venda t3 = new Venda(produto, 100);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
