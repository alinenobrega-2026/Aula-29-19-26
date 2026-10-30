package aula_29_10_26;

public class Atendente extends Funcionario {
	
	private Double ajudaCusto;

	public Atendente(String nome, String cpf, Double salario, String cargo, String departamento, Double ajudaCusto) {
		super(nome, cpf, salario, cargo, departamento);
		this.ajudaCusto = ajudaCusto;
	}

	public Double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(Double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	
	

}
