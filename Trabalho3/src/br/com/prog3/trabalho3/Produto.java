package br.com.prog3.trabalho3;

public class Produto {
	private Double saldo;

	public Produto() {
		saldo = 0.0;
	}

	public double getSaldo() {
		return saldo;
	}

	public synchronized void deposito(double quantia) {
		System.out.print("comprando " + quantia);
		double novoSaldo = saldo + quantia;
		System.out.println(", nova quantidade é " + novoSaldo);
		saldo = novoSaldo;
		notifyAll();
	}

	public synchronized void saque(double quantia) throws InterruptedException {
		while (saldo < quantia) {
			//wait();
			System.out.println("Não foi possível realizar a venda devido a falta de estoque do produto!\n");
			System.exit(0);
		}
		System.out.print("vendendo " + quantia);
		double novoSaldo = saldo - quantia;
		System.out.println(", nova quantidade é " + novoSaldo);
		saldo = novoSaldo;
	}
}
