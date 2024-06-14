package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee eu = new Employee();		

		
		System.out.println("Digite o Nome,Salario e imposto do funcionario:");
		eu.name = sc.nextLine();
		eu.bruto = sc.nextDouble();		
		eu.imposto= sc.nextDouble();
		
		
		System.out.println("Funcionario: " + eu);
		
		System.out.println("Quanto vc quer aumentar?");
		double percentage = sc.nextDouble();
		eu.increase(percentage);
		
		System.out.println("Funcionario atualizado: " + eu);

		
		sc.close();
	}

}
