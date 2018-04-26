package br.com.prog3.aula0310;

public class ContaBancaria {
	private Double saldo;

	public ContaBancaria() {
		saldo = 0.0;
	}

	public double getSaldo() {
		return saldo;
	}

	public synchronized void deposito(double quantia) {
		System.out.print("depositando " + quantia);
		double novoSaldo = saldo + quantia;
		System.out.println(", novo saldo é " + novoSaldo);
		saldo = novoSaldo;
		notifyAll();
	}

	public synchronized void saque(double quantia) throws InterruptedException {
		while (saldo < quantia) {
			wait();
		}
		System.out.print("sacando " + quantia);
		double novoSaldo = saldo - quantia;
		System.out.println(", novo saldo é " + novoSaldo);
		saldo = novoSaldo;
	}
}
