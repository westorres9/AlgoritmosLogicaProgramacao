package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Coeficiente a: ");
		double a = sc.nextDouble();
		System.out.println("Coeficiente b: ");
		double b = sc.nextDouble();
		System.out.println("Coeficiente c");
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2)- 4 * a *c;
				if ( (a == 0) || (delta < 0)){
			System.out.println("Esta equação nao possui raizes reais");
		}
		else {
			double x1 = -b + Math.sqrt(delta) / 2 * a;
			double x2 = -b - Math.sqrt(delta) / 2 * a;
			System.out.println("X1 = " + x1);
			System.out.println("X2 = " + x2);

		}
		sc.close();

	}

}
