package br.com.prog3.aula0210;

public class ThreadDemo2 implements Runnable {
	Thread thread;

	public ThreadDemo2(String nome) {
		thread = new Thread(this, nome);
		thread.start();
	}

	public void run() {
		String name = thread.getName();
		for (int i = 0; i < 10; i++)
			System.out.println(name);
	}

	public static void main(String[] args) {
		ThreadDemo2 t1 = new ThreadDemo2("A");
		ThreadDemo2 t2 = new ThreadDemo2("B");
		ThreadDemo2 t3 = new ThreadDemo2("C");
		ThreadDemo2 t4 = new ThreadDemo2("D");
		System.out.println("Rodando threads...");
		try {
			t1.thread.join();
			t2.thread.join();
			t3.thread.join();
			t4.thread.join();
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println("\nThreads mostas.");
	}
}
