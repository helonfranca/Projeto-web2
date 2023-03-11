package model;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;


public class ParticipacaoProjeto {

	
	private String id;
	
	private String nome_projeto;
	
	private String processo_projeto;

	private String inicio_participacao;
	
	private String atribuicoes;
	
	private String aluno;
	
	private String hrs_semanais;


	
	public String getId() {
		return id;
	}

	public void setId(String numProjeto) {
		this.id = numProjeto;
	}

	public String getNome_projeto() {
		return nome_projeto;
	}

	public void setNome_projeto(String nome_projeto) {
		this.nome_projeto = nome_projeto;
	}

	public String getProcesso_projeto() {
		return processo_projeto;
	}

	public void setProcesso_projeto(String processo_projeto) {
		this.processo_projeto = processo_projeto;
	}

	
	public String getInicio_participacao() {
		return inicio_participacao;
	}

	public void setInicio_participacao(String inicio_participacao) {
		this.inicio_participacao = inicio_participacao;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String string) {
		this.aluno = string;
	}


	public String getAtribuicoes() {
		return atribuicoes;
	}

	public void setAtribuicoes(String atribuicoes) {
		this.atribuicoes = atribuicoes;
	}

	public String getHrs_semanais() {
		return hrs_semanais;
	}

	public void setHrs_semanais(String hrs_semanais) {
		this.hrs_semanais = hrs_semanais;
	}
	
}
