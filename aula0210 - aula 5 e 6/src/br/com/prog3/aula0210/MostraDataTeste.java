package br.com.prog3.aula0210;

public class MostraDataTeste {

	public static void main(String[] args) {
		MostraData md1 = new MostraData("  Olá");
		MostraData md2 = new MostraData("  Adeus");
		md2.setPriority(Thread.MAX_PRIORITY);
		md1.start();
		md2.start();
		
		//md1.run();
		//md2.run();
		
		//diferentemente do start, o run processa primeiro o md1 e quando o md1 acaba ele processa o md2. O start
		//processa os dois ao mesmo tempo
	}

}
