package model;

import java.util.ArrayList;

import java.util.List;

public class Aluno extends Usuario{
	
	private String matricula;
	public  List<ParticipacaoProjeto> participacao_projetos = new ArrayList<ParticipacaoProjeto>();
	
	public Aluno(String nome, String login, String senha) {
		super(nome, login, senha);
		// TODO Auto-generated constructor stub
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public boolean removerParticipacaoProjeto(ParticipacaoProjeto pp) {
		return this.participacao_projetos.remove(pp);
	}
	
	public List<ParticipacaoProjeto> getParticipacaoProjetos() {
		return participacao_projetos;
	}
	
	public void setParticipacaoProjetos(List<ParticipacaoProjeto> participacao) {
		this.participacao_projetos = participacao;
	}
			
}