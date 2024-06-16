package entities;

public class Funcionario {
	
	private String nome;
	private Integer hora;
	private Double valhora;
	
	
	public Funcionario(String nome, Integer hora, Double valhora) {
		this.nome = nome;
		this.hora = hora;
		this.valhora = valhora;
	}


	public Funcionario() {
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getHora() {
		return hora;
	}


	public void setHora(Integer hora) {
		this.hora = hora;
	}


	public Double getValhora() {
		return valhora;
	}


	public void setValhora(Double valhora) {
		this.valhora = valhora;
	}

	public Double pagamento() {
		return hora * valhora;
	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", pagamento()=" + pagamento() + "]";
	}



	
	

}
