package br.com.prog3.aula0708;

public class UsaMetodoString {

	public static void main(String[] args) {
		// Método length()
		String curso = "  Ciência da Computação  ";
		System.out.println(curso.length()); // tamanho da string

		// Método charAt()
		System.out.println(curso.charAt(13)); // mostra o caracter na posição 13 da string

		// Método compateTo
		String nome1 = new String("A");
		String nome2 = new String("C");
		System.out.println(nome1.compareTo(nome2)); // mostra a distância entre as posições

		// Método substring
		String sub1 = curso.substring(13);
		System.out.println(sub1); // Exibe o conteúdo da string a partir da posição 13

		// Método substring(int beginIndex)
		String sub2 = curso.substring(13, 20);
		System.out.println(sub2); // Exibe o conteúdo da string a partir da posição 13 e vai até a posição 20

		// Método replace
		String s1 = curso.replace("ê", "e");
		System.out.println(s1);
		String s2 = s1.replace("çã", "ca");
		System.out.println(s2);

		// Método trim
		String s3 = s2.trim();
		System.out.println(s3);

		// Método split
		String nomes = " Ana Clara, Alexandre, Carolina, Cássio";
		String listanomes[] = nomes.split(",");
		for (String s : listanomes)
			System.out.println(s);
	}
}