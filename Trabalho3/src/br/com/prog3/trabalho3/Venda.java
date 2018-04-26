package br.com.prog3.trabalho3;

public class Venda extends Thread{
	private Produto conta;
	private double quantia;
	private static final int REPETICOES = 10;
	private static final int ESPERA = 10;

	public Venda(Produto conta, double quantia) {
		this.conta = conta;
		this.quantia = quantia;
	}

	public void run() {
		try {
			for (int i = 1; i <= REPETICOES && !isInterrupted(); i++) {
				conta.saque(quantia);
				sleep(ESPERA);
			}
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
