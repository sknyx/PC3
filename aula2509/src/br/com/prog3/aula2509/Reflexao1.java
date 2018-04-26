package br.com.prog3.aula2509;

public class Reflexao1 {

	public static void main(String[] args) {
		//Criando um objeto da classe wrapper integer
		Integer i = new Integer(6);
		
		//Capturando o nome da classe ao qual o objeto i pertence
		Class c = i.getClass();
		
		System.out.println(c);
				
		String s = new String("Ana Clara");
		System.out.println(s.getClass());
		
		
		Carro carro1 = new Carro();
		System.out.println(carro1.getClass());
	}

}
