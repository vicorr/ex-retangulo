package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Progrma1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Entidade r1 = new Entidade();
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite a altura baby: ");
		r1.altura = sc.nextDouble();
		
		System.out.println("Agora a larguran: ");
		r1.largura = sc.nextDouble();
		
		System.out.printf("A area do retângulo é: %.2f", r1.areaRetangulo());
		System.out.printf("\nO perimetro do retângulo é: %.2f", r1.perimetroRetangulo());
		System.out.printf("\nA diagonal é: %.2f", r1.diagonalRetangulo());
		
		sc.close();

	}

}
