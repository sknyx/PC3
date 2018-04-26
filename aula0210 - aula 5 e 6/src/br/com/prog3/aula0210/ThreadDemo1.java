package br.com.prog3.aula0210;

public class ThreadDemo1 implements Runnable {
	Thread thread;

	public ThreadDemo1(String nome) {
		thread = new Thread(this, nome);
		thread.start();
	}

	public void run() {
		String name = thread.getName();
		for (int i = 0; i < 10; i++)
			System.out.println(name);
	}

	public static void main(String[] args) {
		new ThreadDemo1("A");
		new ThreadDemo1("B");
		new ThreadDemo1("C");
		new ThreadDemo1("D");
	}
}
