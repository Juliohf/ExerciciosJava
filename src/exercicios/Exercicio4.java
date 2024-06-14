package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.Currency;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double dol, qt;
		
		System.out.println("What's the dollar price?");
		dol = sc.nextDouble();
		
		System.out.println("How many dollars?");
		qt = sc.nextDouble();
		
		System.out.println("O preço a pagar será R$" + Currency.conver(dol,qt));
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
