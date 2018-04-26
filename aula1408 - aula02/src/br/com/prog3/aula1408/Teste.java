package br.com.prog3.aula1408;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Teste {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		a1.setNome("Ana Clara");
		a1.setMatricula(123);

		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		c.set(Calendar.YEAR, 1997);

		a1.setDataNascimento(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Matrícula: " + a1.getMatricula() + "\nNome: " + a1.getNome() + "\nData de nascimento: "
				+ df.format(a1.getDataNascimento()));

	}

}
