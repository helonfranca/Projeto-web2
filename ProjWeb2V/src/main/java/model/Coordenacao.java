package model;

public class Coordenacao extends Usuario{

	private String matricula_siape;
	private Boolean ContaAtiva = true; 
	
	public Coordenacao(String nome, String login, String senha) {
		super(nome, login, senha);
		// TODO Auto-generated constructor stub
	}
	
	public String getMatricula_siape() {
		return matricula_siape;
	}

	public void setMatricula_siape(String matricula_siape) {
		this.matricula_siape = matricula_siape;
	}

	public Boolean getContaAtiva() {
		return ContaAtiva;
	}

	public void setContaAtiva(Boolean contaAtiva) {
		ContaAtiva = contaAtiva;
	}
	
}
