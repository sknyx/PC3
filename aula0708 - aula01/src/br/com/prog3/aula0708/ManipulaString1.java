package br.com.prog3.aula0708;

public class ManipulaString1 {

	public static void main(String[] args) {

		/*
		 * String nome1 = "Ana Clara"; String nome2 = "Ana Clara";
		 * 
		 * if (nome1 == nome2) {
		 * 
		 * System.out.println("Nomes iguais"); } else {
		 * System.out.println("Nomes diferentes"); } }
		 */
		
		/////////////////////////////////////////////

		/*
		 * String nome1 = new String(); nome1 = "ana clara"; String nome2= new String();
		 * nome2 = "ana clara";
		 * 
		 * if (nome1 == nome2) {
		 * 
		 * System.out.println("Nomes iguais"); } else {
		 * System.out.println("Nomes diferentes"); }
		 */
		
		/////////////////////////////////////////////

		String nome1 = new String("Ana Clara");
		String nome2 = new String("Ana Clara");
		if (nome1.equals(nome2)) { // diferencia maiuisculo de minusculo
			// para não diferencia minusculos e maiusculos, usa-se
			// (nome1.equalsIgnoreCase(nome2))
			System.out.println("Nomes iguais");
		} else {
			System.out.println("Nomes diferentes");
		}
	}
}
