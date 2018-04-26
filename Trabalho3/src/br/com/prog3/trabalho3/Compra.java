package br.com.prog3.trabalho3;

public class Compra extends Thread{
	private Produto conta;
	private double quantia;
	private static final int REPETICOES = 10;
	private static final int ESPERA = 10;

	public Compra(Produto conta, double quantia) {
		this.conta = conta;
		this.quantia = quantia;
	}

	public void run() {
		try {
			for (int i = 1; i <= REPETICOES && !isInterrupted(); i++) {
				conta.deposito(quantia);
				sleep(ESPERA);
			}
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
