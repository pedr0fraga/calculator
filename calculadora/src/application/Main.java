package application;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double result = 0;
		
		System.out.println("--------------------");
		System.out.println("Calculadora Básica");
		System.out.println("--------------------");
		
		System.out.print("Digite um número: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite outro número: ");
		double n2 = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("1 - Adição (+)");
		System.out.println("2 - Subtração (-)");
		System.out.println("3 - Multiplicação (x)");
		System.out.println("4 - Divisão (/)");
		System.out.print("Qual a operação desejada? ");
		int operation = sc.nextInt();
		
		switch(operation) {
		case(1):
			result = n1 + n2;
		 break;
		case(2):
			result = n1 - n2;
		 break;
		case(3):
			result = n1 * n2;
		 break;
		case(4):
			result = n1 / n2;
		 break;
		 default:
			 System.out.println("Comando inválido.");
		}
		
		System.out.println();
		
		System.out.printf("Resultado da operação: %.1f", result);

	}

}
