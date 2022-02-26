package Fundamentos;

public class TesteSaida {

	public static void main(String[] args) {
		int idade = 32;
		double salario = 2856.89;
		String nome = "Maria Silva";
		boolean maiorDeIdade = true;
		
		System.out.println(idade);
		System.out.println(salario);
		System.out.println(nome);
		System.out.println(maiorDeIdade);
		
		System.out.println("A funcionária " + nome + " recebe um salário de $" + salario 
				+ ", ela tem a idade de " + idade + " anos, portanto, ela é maior de idade " + maiorDeIdade);

	}

}
