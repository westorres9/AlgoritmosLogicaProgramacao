package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		double valorMetro = sc.nextDouble();
		double area = largura * comprimento;
		System.out.println("Area do terreno: " + area);
		double preco = area * valorMetro;
		System.out.println("Valor do terreno: " + preco);
		sc.close();
		
	}

}
