package br.com.prog3.aula0708;

public class UsaMetodoString {

	public static void main(String[] args) {
		// M�todo length()
		String curso = "  Ci�ncia da Computa��o  ";
		System.out.println(curso.length()); // tamanho da string

		// M�todo charAt()
		System.out.println(curso.charAt(13)); // mostra o caracter na posi��o 13 da string

		// M�todo compateTo
		String nome1 = new String("A");
		String nome2 = new String("C");
		System.out.println(nome1.compareTo(nome2)); // mostra a dist�ncia entre as posi��es

		// M�todo substring
		String sub1 = curso.substring(13);
		System.out.println(sub1); // Exibe o conte�do da string a partir da posi��o 13

		// M�todo substring(int beginIndex)
		String sub2 = curso.substring(13, 20);
		System.out.println(sub2); // Exibe o conte�do da string a partir da posi��o 13 e vai at� a posi��o 20

		// M�todo replace
		String s1 = curso.replace("�", "e");
		System.out.println(s1);
		String s2 = s1.replace("��", "ca");
		System.out.println(s2);

		// M�todo trim
		String s3 = s2.trim();
		System.out.println(s3);

		// M�todo split
		String nomes = " Ana Clara, Alexandre, Carolina, C�ssio";
		String listanomes[] = nomes.split(",");
		for (String s : listanomes)
			System.out.println(s);
	}
}