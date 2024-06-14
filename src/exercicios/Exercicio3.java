package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;


public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno novo = new Aluno();
		

		System.out.println("Qual a nota 1?");
		novo.nota1 = sc.nextDouble();
		
		System.out.println("Qual a nota 2?");
		novo.nota2 = sc.nextDouble();
		
		System.out.println("Qual a nota 3?");
		novo.nota3 = sc.nextDouble();
		
		double notaf = novo.fim();
		System.out.println("Final grade:" + notaf);
		
		
		
		
		
		
		
		sc.close();
	}

}
