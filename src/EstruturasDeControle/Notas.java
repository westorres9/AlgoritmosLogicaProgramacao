package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digita a segunda nota: ");
		double nota2 = sc.nextDouble();
		double soma = nota1 + nota2;
		System.out.printf("NOTA FINAL = %.2f%n", soma);
		if(soma >= 60.0) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
	}
}
