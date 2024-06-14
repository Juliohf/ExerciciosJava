package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangle;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangle x;
		x = new Retangle();
		
		
		System.out.println("Escreva a width e a height:");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", x.area());
		System.out.printf("PERIMETER = %.2f%n", x.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", x.diagonal());
		
		sc.close();			
	}

}
