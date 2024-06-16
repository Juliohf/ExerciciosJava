package entities;

public class Funcionario3 extends Funcionario {

	private Double adicional;

	public Funcionario3(String nome, Integer hora, Double valhora, Double adicional) {
		super(nome, hora, valhora);
		this.adicional = adicional;
	}

	public Funcionario3() {
		super();
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + adicional * 1.1;
	}
	
}
