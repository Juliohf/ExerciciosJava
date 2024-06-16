package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;



public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Produto> lista = new ArrayList<>();
		
		
		System.out.println("Quantos produtos?");
		int nr = sc.nextInt();
		
		for (int i=0;i<nr;i++) {
			System.out.println("Produto importado?Usado?ou Comum?(i/u/c)");
			sc.nextLine();
			char im = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Nome?");			
			String nome = sc.nextLine();
			System.out.println("preço?");
			double preço = sc.nextDouble();

			if (im == 'i') {
				System.out.println("imposto?");
				double imposto = sc.nextDouble();
				Produto x = new ProdutoImportado(nome,preço,imposto);
				lista.add(x);
			} 
			if (im == 'c'){
				Produto y = new Produto(nome,preço);
				lista.add(y);
			}
			

		}
	
		for (Produto pro : lista) {
			System.out.println(pro.etiqueta());
		}
		
		
		
		sc.close();
	}

}
