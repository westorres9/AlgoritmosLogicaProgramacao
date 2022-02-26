package Fundamentos;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite a sua idade ");
		int idade = sc.nextInt();
		System.out.println("Seu nome é " + nome + " e sua idade é de " + idade + " anos");
		
	}

}
