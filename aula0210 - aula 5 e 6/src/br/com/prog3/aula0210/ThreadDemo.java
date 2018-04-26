package br.com.prog3.aula0210;

public class ThreadDemo extends Thread {
	public ThreadDemo(String nome) {
		super(nome);
		start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName());
		}
	}

	public static void main(String[] args) {
		ThreadDemo pnt1 = new ThreadDemo("A");
		ThreadDemo pnt2 = new ThreadDemo("B");
		ThreadDemo pnt3 = new ThreadDemo("C");
		ThreadDemo pnt4 = new ThreadDemo("D");
	}
}
