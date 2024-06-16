package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Digite um numero");
		int n =sc.nextInt();
		
		
		int [] vect = new int[n];
		
		for (int i = 0; i < n;i++) {
			System.out.println("Digite um numero");
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i<n;i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		
		
		
		
		
		
	sc.close();	
	}
}
