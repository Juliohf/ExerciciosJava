package entities;

public class ProdutoImportado extends Produto {

	public Double imposto;

	public ProdutoImportado(String nome, Double preço, Double imposto) {
		super(nome, preço);
		this.imposto = imposto;
	}
	
	public Double preçoTotal() {
		return getPreço() + imposto;
	}
	
	@Override
	public String etiqueta() {
		return getNome() + " R$" +  String.format("%.2f", preçoTotal()) + " Imposto: " + String.format("%.2f",imposto);
	}

}
