package Fundamentos;

import java.util.Locale;

public class ExercicioSaidaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String produto1 = "Computador";
		String produto2 = "TV";

		double preco1 = 2100.5;
		double preco2 = 1830.0;

		int idade = 30;
		int codigo = 5291;
		char genero = 'F';

		System.out.printf("O produto %s custa %.2f%n ",produto1, preco1);
		System.out.printf("O produto %s custa %.2f%n", produto2, preco2);
		System.out.println();
		System.out.println("Codigo = " + codigo);
		System.out.println();
		System.out.println("Dados da pessoa: genero " + genero + " e idade " + idade);
	}

}
