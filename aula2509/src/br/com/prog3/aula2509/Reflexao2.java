package br.com.prog3.aula2509;

public class Reflexao2 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName("br.com.prog3.aula2509.Carro"));
		
		Class c1 = Double.TYPE;
		Class c2 = Integer.TYPE;
		Class c3 = Void.TYPE;
		
		//Class c4 = br.com.prog3.aula2509.Carro.class.getSuperclass();
		//System.out.println(c4);
		
		Class<?>[] c4 = Character.class.getClasses();
		for(Class cs : c4){
		System.out.println(cs.getName());
		}
	}

}
